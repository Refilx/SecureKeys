package classes;

import java.time.LocalDateTime;

public class HistoricoChave {

    private String nome;
    private int numeroChave;
    private String observacoes;
    private String status;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechamento;

    public HistoricoChave() {}

    public boolean verifyChave(int quantChave){
        if(quantChave > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroChave(int numeroChave) {
        this.numeroChave = numeroChave;
    }

    public int getNumeroChave() {
        return numeroChave;
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

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }
}
