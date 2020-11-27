/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.AutoridadCivil;
/**
 *
 * @author Usuario
 */
public class ControladorAutoridadCivil extends Controlador<AutoridadCivil> {
  private AutoridadCivil autoridadCivil;
    @Override
    public boolean validar(AutoridadCivil objeto) {
        if(objeto.getTipo().equals("Autoridad")){
        return true;
        }
        return false;
       
    }

    @Override
    public int generarId() {
        return 0;
       
    }
     public boolean iniciarSesion(String correo, String contrasenia) {

        for (AutoridadCivil usuario : super.getListaGenerica()) {
            AutoridadCivil u = (AutoridadCivil) usuario;
            if (u.getCorreo().equals(correo) && u.getContrasenia().equals(contrasenia)) {
                this.autoridadCivil = u;
                return true;
            }

        }
        return false;
    }

    public AutoridadCivil getAutoridad() {
        return autoridadCivil;
    }

    public void setAutoridad(AutoridadCivil autoridadCivil) {
        this.autoridadCivil = autoridadCivil;
    }
    
}
