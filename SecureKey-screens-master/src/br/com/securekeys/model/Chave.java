package br.com.securekeys.model;

public class Chave{

    private int idChave;
    private int numeroChave;
    private String sala;
    private String bloco;
    private String observacoes;
    private int quantChave;
    private String status;

    public Chave(){}

    public int getIdChave() {
        return idChave;
    }

    public void setIdChave(int id) {
        idChave = id;
    }

    public void setNumeroChave(int numeroChave) {
        this.numeroChave = numeroChave;
    }

    public int getNumeroChave() {
        return numeroChave;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getBloco() {
        return bloco;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setQuantChave(int quant_chave) {
        this.quantChave = quant_chave;
    }

    public int getQuantChave() {
        return quantChave;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
