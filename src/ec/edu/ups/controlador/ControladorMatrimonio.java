/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Matrimonio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorMatrimonio extends Controlador<Matrimonio> {

    @Override
    public boolean validar(Matrimonio objeto) {
        if(objeto.getContrayente1().getTipo().equals("Contrayente: ")&&
                objeto.getContrayente2().getTipo().equals("Contrayente: ")){
            if(objeto.getContrayente1().getEstadoCivil()!="Casado"&& 
                    objeto.getContrayente2().getEstadoCivil()!="Casado"){
            return true;
            }        
        }        
        return false;       
    }

    @Override
    public int generarId() {
         List<Matrimonio> tm = new ArrayList();
        for ( Matrimonio matrimonio : super.getListaG()) {
            Matrimonio m = (Matrimonio) matrimonio;
            tm.add(m);

        }

        if (tm.size() > 0 && tm != null) {
            return tm.get(tm.size() - 1).getCodigo() + 1;
        } else {
            return 1;
        }       
    }
    
}
