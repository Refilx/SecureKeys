CREATE DATABASE  IF NOT EXISTS `securekeys` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `securekeys`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: securekeys
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chaves`
--

DROP TABLE IF EXISTS `chaves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chaves` (
  `idChave` int NOT NULL AUTO_INCREMENT,
  `numeroChave` int NOT NULL,
  `sala` varchar(60) DEFAULT NULL,
  `bloco_predio` varchar(60) DEFAULT NULL,
  `observacoes` varchar(60) DEFAULT NULL,
  `quantChave` int NOT NULL,
  `status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idChave`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chaves`
--

LOCK TABLES `chaves` WRITE;
/*!40000 ALTER TABLE `chaves` DISABLE KEYS */;
INSERT INTO `chaves` VALUES (1,124,'LABORATÓRIO 124','MODULO NOVO','Chave Principal',0,'INDISPONÍVEL'),(2,115,'LABORATÓRIO 115','MODULO NOVO','Chave Principal',2,'DISPONÍVEL'),(3,118,'LABORATÓRIO 118','MODULO NOVO','Chave Principal',1,'DISPONÍVEL');
/*!40000 ALTER TABLE `chaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `consulta_historico`
--

DROP TABLE IF EXISTS `consulta_historico`;
/*!50001 DROP VIEW IF EXISTS `consulta_historico`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `consulta_historico` AS SELECT 
 1 AS `idHistorico`,
 1 AS `idChave`,
 1 AS `idPessoa`,
 1 AS `observacoes`,
 1 AS `status`,
 1 AS `dataAbertura`,
 1 AS `dataFechamento`,
 1 AS `numerochave`,
 1 AS `nome`,
 1 AS `cargo`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `historico`
--

DROP TABLE IF EXISTS `historico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historico` (
  `idHistorico` int NOT NULL AUTO_INCREMENT,
  `idChave` int DEFAULT NULL,
  `idPessoa` int DEFAULT NULL,
  `observacoes` varchar(500) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `dataAbertura` date DEFAULT NULL,
  `dataFechamento` date DEFAULT NULL,
  PRIMARY KEY (`idHistorico`),
  KEY `idPessoa` (`idPessoa`),
  KEY `idChave` (`idChave`),
  CONSTRAINT `historico_chave` FOREIGN KEY (`idChave`) REFERENCES `chaves` (`idChave`),
  CONSTRAINT `historico_pessoa` FOREIGN KEY (`idPessoa`) REFERENCES `pessoa` (`idPessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico`
--

LOCK TABLES `historico` WRITE;
/*!40000 ALTER TABLE `historico` DISABLE KEYS */;
INSERT INTO `historico` VALUES (3,2,1,'O Estagiário pegou a chave do laboratório 115','ENCERRADO','2024-04-01','2024-04-01'),(4,3,1,'O Estagiário pegou a chave do laboratório 118','ENCERRADO','2024-05-01','2024-05-01'),(7,3,3,'A PM pegou a chave do laboratório 118','ENCERRADO','2024-04-01','2024-06-01'),(8,3,3,'A PM pegou a chave do laboratório 118','ENCERRADO','2024-04-01','2024-06-01'),(9,1,2,'O programador pegou a chave do laboratório 124','ENCERRADO','2024-06-17','2024-06-17'),(10,1,2,'O programador pegou a chave do laboratório 124','ENCERRADO','2024-06-17','2024-06-01'),(11,1,2,'O programador pegou a chave do laboratório 124','EM ABERTO','2024-04-17',NULL);
/*!40000 ALTER TABLE `historico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `lista_meses`
--

DROP TABLE IF EXISTS `lista_meses`;
/*!50001 DROP VIEW IF EXISTS `lista_meses`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `lista_meses` AS SELECT 
 1 AS `ano_mes`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logs` (
  `idLogs` int NOT NULL AUTO_INCREMENT,
  `idUser` int NOT NULL,
  `dtLogin` timestamp NOT NULL,
  `dtLogout` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`idLogs`),
  KEY `idUser` (`idUser`),
  CONSTRAINT `logs_user` FOREIGN KEY (`idUser`) REFERENCES `usuario` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (2,3,'2024-04-01 12:29:43','2024-04-01 13:00:00'),(3,2,'2024-04-01 19:09:43','2024-04-01 21:09:43');
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoa` (
  `idPessoa` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(240) NOT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `email` varchar(240) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `endereco` varchar(360) DEFAULT NULL,
  `empresa` varchar(240) DEFAULT NULL,
  `cargo` varchar(240) DEFAULT NULL,
  `cidade` varchar(120) DEFAULT NULL,
  `cep` varchar(8) DEFAULT NULL,
  `dtRegistro` date NOT NULL,
  PRIMARY KEY (`idPessoa`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,'Adimael','000.000.000-00','a@teste.com.br','(00)0000-0000','bairro x, rua c, número n','Empresa z','DEV Front End','Cidade','00000000','2024-04-01'),(2,'Bruno','000.000.100-00','b@teste.com.br','(00)0000-0000','bairro b, rua b, número m','Empresa z','DEV Back End','Cidade','00000000','2024-04-01'),(3,'Geovanna','000.000.000-01','g@teste.com.br','(00)00000-0000','bairro n, rua g, número a','Empresa z','Project Manager','Cidade','00000000','2024-04-17');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `ultimo_logado`
--

DROP TABLE IF EXISTS `ultimo_logado`;
/*!50001 DROP VIEW IF EXISTS `ultimo_logado`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `ultimo_logado` AS SELECT 
 1 AS `idLogs`,
 1 AS `idUser`,
 1 AS `username`,
 1 AS `role`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUser` int NOT NULL AUTO_INCREMENT,
  `username` varchar(120) NOT NULL,
  `password` varchar(240) NOT NULL,
  `role` varchar(30) NOT NULL,
  `dtRegistro` date NOT NULL,
  `idPessoa` int NOT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `username` (`username`),
  KEY `idPessoa` (`idPessoa`),
  CONSTRAINT `user_pessoa` FOREIGN KEY (`idPessoa`) REFERENCES `pessoa` (`idPessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'adimael','Os2gA1bJddTrEVXNmcmUiPkArtToBCTC','ADMINISTRADOR','2024-04-01',1),(2,'bruno','GdV53nA9YjMVN49U2wy+MxcVjhebV4dm','ADMINISTRADOR','2024-04-01',2),(3,'geovanna','5KgZSULSp02JBKmcWUQdu7Vw+Zr4PDZr','ADMINISTRADOR','2024-04-01',3);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `usuario_list`
--

DROP TABLE IF EXISTS `usuario_list`;
/*!50001 DROP VIEW IF EXISTS `usuario_list`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `usuario_list` AS SELECT 
 1 AS `username`,
 1 AS `role`,
 1 AS `telefone`,
 1 AS `email`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping events for database 'securekeys'
--

--
-- Dumping routines for database 'securekeys'
--

--
-- Final view structure for view `consulta_historico`
--

/*!50001 DROP VIEW IF EXISTS `consulta_historico`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `consulta_historico` AS select `h`.`idHistorico` AS `idHistorico`,`h`.`idChave` AS `idChave`,`h`.`idPessoa` AS `idPessoa`,`h`.`observacoes` AS `observacoes`,`h`.`status` AS `status`,`h`.`dataAbertura` AS `dataAbertura`,`h`.`dataFechamento` AS `dataFechamento`,`c`.`numeroChave` AS `numerochave`,`p`.`nome` AS `nome`,`p`.`cargo` AS `cargo` from ((`historico` `h` join `chaves` `c` on((`h`.`idChave` = `c`.`idChave`))) join `pessoa` `p` on((`h`.`idPessoa` = `p`.`idPessoa`))) order by `h`.`idHistorico` desc */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `lista_meses`
--

/*!50001 DROP VIEW IF EXISTS `lista_meses`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `lista_meses` AS select distinct date_format(`historico`.`dataAbertura`,'%Y-%m') AS `ano_mes` from `historico` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ultimo_logado`
--

/*!50001 DROP VIEW IF EXISTS `ultimo_logado`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ultimo_logado` AS select `l`.`idLogs` AS `idLogs`,`l`.`idUser` AS `idUser`,`u`.`username` AS `username`,`u`.`role` AS `role` from (`logs` `l` join `usuario` `u` on((`l`.`idUser` = `u`.`idUser`))) order by `l`.`idLogs` desc limit 1 */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `usuario_list`
--

/*!50001 DROP VIEW IF EXISTS `usuario_list`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `usuario_list` AS select `u`.`username` AS `username`,`u`.`role` AS `role`,`p`.`telefone` AS `telefone`,`p`.`email` AS `email` from (`usuario` `u` join `pessoa` `p` on((`p`.`idPessoa` = `u`.`idPessoa`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-01 17:19:19
