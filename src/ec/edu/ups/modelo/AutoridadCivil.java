/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;


/**
 *
 * @author Usuario
 */
public class AutoridadCivil extends Persona{
    
    private String cargo;
    private String correo;
    private String contrasenia;

    public AutoridadCivil(String cargo, String correo, String contrasenia, 
            String nombre, String apellido, String cedula, String direccion, 
            String genero, Date fechaNacimiento, String tipo, String estadoCivil) {
        super(nombre, apellido, cedula, direccion, genero, fechaNacimiento, tipo, estadoCivil);
        this.cargo = cargo;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}