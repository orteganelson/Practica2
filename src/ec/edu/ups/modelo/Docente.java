/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona {

    private String titulo;
    private String tipo;    
    private Usuario usuario;
    private Curso curso;

    public Docente(String cedula, String nombre, String apellido,
            int edad, String direccion) {
        super(cedula, nombre, apellido, edad, direccion);
    }

    public Docente(String cedula, String nombre, String apellido,
            int edad, String direccion, String titulo, String tipo) {
        super(cedula, nombre, apellido, edad, direccion);
        this.titulo = titulo;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Docente{titulo=").append(titulo);
        sb.append(", tipo=").append(tipo);
        sb.append(", curso=").append(curso);
        sb.append('}');
        return sb.toString();
    }

}
