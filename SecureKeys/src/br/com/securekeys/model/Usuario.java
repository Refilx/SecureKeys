package br.com.securekeys.model;

import java.time.LocalDateTime;

public class Usuario extends Pessoa{

    private String username;
    private String password;
    private String role;
    private LocalDateTime DtRegistro;

    public Usuario(){}

    public void registrarChave(){


    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void setDtRegistro(LocalDateTime dtRegistro) {
        DtRegistro = dtRegistro;
    }

    @Override
    public LocalDateTime getDtRegistro() {
        return DtRegistro;
    }
}
