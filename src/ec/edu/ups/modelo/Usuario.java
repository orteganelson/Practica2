/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
/**
 *
 * @author Usuario
 */
public class Usuario implements Serializable {

    private Docente docente;

    private String rol;

    private String correo;

    private String pass;

    public Usuario(Docente docente, String rol, String correo, String pass) {
        this.docente = docente;
        this.rol = rol;
        this.correo = correo;
        this.pass = pass;
    }

    public Usuario() {

    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "docente=" + docente + ", rol=" + rol + 
                ", correo=" + correo + ", pass=" + pass + '}';
    }

}