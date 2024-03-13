package br.com.securekeys.model;

import java.util.Date;

public class Usuario extends Pessoa{

    private int IdUser;
    private String username;
    private String password;
    private String role;
    private Date DtRegistro;

    public Usuario(){}

    public void registrarChave(){
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public int getIdUser() {
        return IdUser;
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
    public void setDtRegistro(Date dtRegistro) {
        DtRegistro = dtRegistro;
    }

    @Override
    public Date getDtRegistro() {
        return DtRegistro;
    }
}
