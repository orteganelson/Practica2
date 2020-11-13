/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class ControladorUsuario extends Controlador{
    
    public ControladorUsuario() {
    }
    
    @Override
    public int cargarCodigo() {
        if (findAll().size() > 0) {
            return findAll().size() + 1;
        } else {
            return 1;
        }

    }

    public Usuario iniciarSesion(String correo, String clave) {
        for (var usuario : (List<Usuario>) findAll()) {
            if (usuario.getCorreo().equals(correo) && usuario.getClave().equals(clave)) {
                return usuario;

            }

        }
        return null;
    }

    public Usuario readCedula(Usuario usuarioBuscar) {
        var copiaListaUsuarios = (List<Usuario>) List.copyOf(findAll());
        return copiaListaUsuarios.stream().filter(usuario -> usuario.getCedula().equals(usuarioBuscar.getCedula())).findFirst().get();
    }

    public Usuario readNumero(Telefono telefonoBuscar) {
        for (var usuario : (List<Usuario>) findAll()) {
            if (usuario.buscarTelefono(telefonoBuscar) != null) {
                return usuario;
            }

        }
        return null;
    }
    
}
