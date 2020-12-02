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
public class Alumno extends Persona{
    private Curso curso;
    private String aula;
    
    public Alumno(String cedula, String nombre, String apellido,
            int edad, String direccion, Curso curso, String aula) {
        super(cedula, nombre, apellido, edad, direccion);
        this.curso = curso;
        this.aula = aula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{curso=").append(curso);
        sb.append(", aula=").append(aula);
        sb.append('}');
        return sb.toString();
    }
   
    
    
}
