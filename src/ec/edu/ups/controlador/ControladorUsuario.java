/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Docente;
import ec.edu.ups.modelo.Usuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class ControladorUsuario extends Controlador<Usuario> {
    
    private Usuario usuario;
    
    public ControladorUsuario(String ruta) {
        super(ruta);        
    }
    
    @Override
    public boolean validar(Usuario objeto) {        
        return true;        
    }
    
    @Override
    public int generarId() {
        return 0;        
    }
    
    public List<Usuario> usuarios() {
        
        List<Usuario> lista = new ArrayList();
        Usuario user;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            user = (Usuario) i.next();
            lista.add(user);            
        }
        return lista;        
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public boolean iniciarSesion(String correo, String pass) {        
        for (Usuario user : super.getLista()) {
            Usuario u = (Usuario) user;
            if (u.getCorreo().equals(correo) && u.getPass().equals(pass)) {
                this.usuario = u;
                return true;
            }
        }
        return false;
        
    }
    
    public Usuario buscarUser(Docente docente) {
        
        for (Usuario us : super.getLista()) {
            Usuario user = (Usuario) us;
            if (docente.equals(user.getDocente())) {
                this.usuario = user;                
            }
        }
        return null;        
    }
}
