package br.com.securekeys.model;

import java.util.Date;

public class Logs{

    private int IdLogs;
    private int IdUser;
    private String username;
    private Date DtLog;

    public Logs() {}

    public int getIdLogs() {
        return IdLogs;
    }

    public void setIdLogs(int idLogs) {
        IdLogs = idLogs;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setUsername(String nome) {
        username = nome;
    }

    // Possívelmente haverá futuras alterações
    public String getUsername() {
        return username;
    }

    public void setDtLog(Date dtLog) {
        DtLog = dtLog;
    }

    public Date getDtLog() {
        return DtLog;
    }
}
