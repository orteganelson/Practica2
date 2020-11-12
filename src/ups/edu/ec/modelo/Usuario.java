/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String clave;
    private List<Telefono> listaTelefonos;

    public Usuario(int id, String cedula, String nombre, String apellido, String correo, String clave) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clave = clave;
        listaTelefonos = new ArrayList<>();        
    }
    
    public Usuario() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
            
    public List<Telefono> getListaTelefonos() {
        return listaTelefonos;
    }
    
    public void agregarTelefono(Telefono telefono){
        this.listaTelefonos.add(telefono);
    }
    
    public Telefono buscarTelefono(Telefono tlfBuscar){
        return this.listaTelefonos.stream().filter(t -> t.getNumero().equals(tlfBuscar.getNumero())).findFirst().get();
    }
    
    public void actualizarTelefono(Telefono tlfNuevo){
        var tlfActualizar = listaTelefonos.stream().filter(t -> t.getCodigo() == tlfNuevo.getCodigo()).findFirst().get();
        int index = listaTelefonos.indexOf(tlfActualizar);
        listaTelefonos.set(index, tlfNuevo);
    }
    
    public void eliminarTelefono(int codigo){
        var tlfEliminar = listaTelefonos.stream().filter(telefono -> telefono.getCodigo() == codigo).findFirst().get();
        listaTelefonos.remove(tlfEliminar);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.apellido);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", cedula=" + cedula +
                ", nombre=" + nombre + ", apellido=" + apellido +
                ", correo=" + correo + ", clave=" + clave +
                ", listaTelefonos=" + listaTelefonos + '}';
    }
                     
}
