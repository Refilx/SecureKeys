package br.com.securekeys.model;

import java.util.Date;

public class Historico {

    private int idHistorico;
    private String nome;
    private int idChave;
    private String observacoes;
    private String status;
    private Date dataAbertura;
    private Date dataFechamento;

    public Historico() {}

    //Retirar método
    public boolean verifyChave(int quantChave){
        if(quantChave > 0){
            return true;
        }
        else{
            return false;
        }
    }

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

    public void setIdChave(int idChave) {
        this.idChave = idChave;
    }

    public int getIdChave() {
        return idChave;
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
