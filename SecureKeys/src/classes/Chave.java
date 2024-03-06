package classes;

public class Chave{

    private int numeroChave;
    private String sala;
    private int quantChave;
    private String status;

    public Chave(){}

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
