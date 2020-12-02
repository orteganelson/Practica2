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
public class Actividad implements Serializable {

    private int codigo;
    private String titulo;
    private String descripcion;
    private String link;
    private Curso curso;

    public Actividad(int codigo, String titulo, String descripcion, String link, Curso curso) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.link = link;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actividad other = (Actividad) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actividad{codigo=").append(codigo);
        sb.append(", titulo=").append(titulo);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", link=").append(link);
        sb.append('}');
        return sb.toString();
    }

}
