package br.com.securekeys.model;

import java.time.LocalDateTime;

public class Logs{

    private int IdUser;
    private LocalDateTime DtLog;

    public Logs() {}

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public int getIdUser() {
        return IdUser;
    }

    // Pega o nome de um usuário existente da Classe Usuario
    public void getUsername(Usuario usuario) {
        usuario.getUsername();
    }

    public void setDtLog(LocalDateTime dtLog) {
        DtLog = dtLog;
    }

    public LocalDateTime getDtLog() {
        return DtLog;
    }
}
