package br.com.securekeys.model;

import java.util.Date;

public class Logs{

    private int IdUser;
    private String username;
    private Date DtLog;

    public Logs() {}

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setUsername(String nome) {
        this.username = nome;
    }

    // Pega o nome de um usuário existente da Classe Usuario
    public void getUsername(Usuario usuario) {
        usuario.getUsername();
    }

    public void setDtLog(Date dtLog) {
        DtLog = dtLog;
    }

    public Date getDtLog() {
        return DtLog;
    }
}
