package br.com.securekeys.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class Logs{

    private int IdLogs;
    private int IdUser;
    private String username;
    private Timestamp DtLogin;
    private Timestamp DtLogout;

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

    public void setDtLogin(Timestamp dtLogin) {
        DtLogin = dtLogin;
    }

    public Timestamp getDtLogin() {
        return DtLogin;
    }

    public void setDtLogout(Timestamp dtLogout) {
        DtLogout = dtLogout;
    }

    public Timestamp getDtLogout() {
        return DtLogout;
    }
}
