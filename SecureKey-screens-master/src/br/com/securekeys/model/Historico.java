package br.com.securekeys.model;

import java.util.Date;

public class Historico {

    private int idHistorico;
    private String nome; //Guarda o valor apenas na aplicação
    private String cargo; //Guarda o valor apenas na aplicação
    private int numeroChave; //Guarda o valor apenas na aplicação
    private int idChave;
    private int idPessoa;
    private String observacoes;
    private String status;
    private Date dataAbertura;
    private Date dataFechamento;

    public Historico() {}

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int id) {
        idHistorico = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumeroChave() {
        return numeroChave;
    }

    public void setNumeroChave(int numeroChave) {
        this.numeroChave = numeroChave;
    }

    public void setIdChave(int idChave) {
        this.idChave = idChave;
    }

    public int getIdChave() {
        return idChave;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }


    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }
}
