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
  `sala` varchar(30) DEFAULT NULL,
  `observacoes` varchar(30) DEFAULT NULL,
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
INSERT INTO `chaves` VALUES (1,124,'LAB 124','Chave Principal',0,'DISPONÍVEL'),(2,115,'LAB 115','Chave Principal',2,'DISPONÍVEL'),(3,118,'LAB 118','Chave Principal',1,'DISPONÍVEL');
/*!40000 ALTER TABLE `chaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `consultahistorico`
--

DROP TABLE IF EXISTS `consultahistorico`;
/*!50001 DROP VIEW IF EXISTS `consultahistorico`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `consultahistorico` AS SELECT 
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
  `idHistorico` int AUTO_INCREMENT,
  `idChave` int,
  `idPessoa` int,
  `observacoes` varchar(500) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `dataAbertura` date DEFAULT NULL,
  `dataFechamento` date DEFAULT NULL,
  PRIMARY KEY (`idHistorico`),
  KEY `idPessoa` (`idPessoa`),
  KEY `idChave` (`idChave`),
  CONSTRAINT `historico_ibfk_1` FOREIGN KEY (`idPessoa`) REFERENCES `pessoa` (`idPessoa`),
  CONSTRAINT `historico_ibfk_2` FOREIGN KEY (`idChave`) REFERENCES `chaves` (`idChave`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico`
--

LOCK TABLES `historico` WRITE;
/*!40000 ALTER TABLE `historico` DISABLE KEYS */;
INSERT INTO `historico` VALUES (3,2,1,'O Estagiário pegou a chave do laboratório 115','ENCERRADO','2024-04-01','2024-04-01'),(4,3,1,'O Estagiário pegou a chave do laboratório 118','ENCERRADO','2024-04-01','2024-04-01'),(7,3,4,'A PM pegou a chave do laboratório 118','ENCERRADO','2024-04-01','2024-04-01'),(8,3,4,'A PM pegou a chave do laboratório 118','Em Aberto','2024-04-01',NULL),(9,1,3,'O programador pegou a chave do laboratório 124','ENCERRADO','2024-04-17','2024-04-17'),(10,1,3,'O programador pegou a chave do laboratório 124','Em Aberto','2024-04-17',NULL),(11,1,3,'O programador pegou a chave do laboratório 124','Em Aberto','2024-04-17',NULL);
/*!40000 ALTER TABLE `historico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logs` (
  `idLogs` int NOT NULL AUTO_INCREMENT,
  `idUser` int NOT NULL,
  `dtLogs` date NOT NULL,
  PRIMARY KEY (`idLogs`),
  KEY `idUser` (`idUser`),
  CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`idUser`) REFERENCES `usuario` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (2,4,'2024-04-01'),(3,2,'2024-04-01');
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
INSERT INTO `pessoa` VALUES (1,'Adimael','000.000.000-00','a@teste.com.br','(00)0000-0000','bairro x, rua c, número n','Empresa z','DEV Front End','Cidade','00000000','2024-04-01'),(3,'Bruno','000.000.100-00','b@teste.com.br','(00)0000-0000','bairro b, rua b, número m','Empresa z','DEV Back End','Cidade','00000000','2024-04-01'),(4,'Geovanna','000.000.000-01','g@teste.com.br','(00)00000-0000','bairro n, rua g, número a','Empresa z','Project Manager','Cidade','00000000','2024-04-17');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

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
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Adimael','Os2gA1bJddTrEVXNmcmUiPkArtToBCTC','ADMINISTRADOR','2024-04-01'),(2,'Bruno','GdV53nA9YjMVN49U2wy+MxcVjhebV4dm','ADMINISTRADOR','2024-04-01'),(4,'Geovanna','5KgZSULSp02JBKmcWUQdu7Vw+Zr4PDZr','ADMINISTRADOR','2024-04-01');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `consultahistorico`
--

/*!50001 DROP VIEW IF EXISTS `consultahistorico`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `consultahistorico` AS select `h`.`idHistorico` AS `idHistorico`,`h`.`idChave` AS `idChave`,`h`.`idPessoa` AS `idPessoa`,`h`.`observacoes` AS `observacoes`,`h`.`status` AS `status`,`h`.`dataAbertura` AS `dataAbertura`,`h`.`dataFechamento` AS `dataFechamento`,`c`.`numeroChave` AS `numerochave`,`p`.`nome` AS `nome`,`p`.`cargo` AS `cargo` from ((`historico` `h` join `chaves` `c` on((`h`.`idChave` = `c`.`idChave`))) join `pessoa` `p` on((`h`.`idPessoa` = `p`.`idPessoa`))) order by `h`.`idHistorico` desc */;
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

-- Dump completed on 2024-04-17 13:06:01
