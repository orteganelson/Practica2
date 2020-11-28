/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class ControladorPersona extends Controlador<Persona>{

    @Override
    public boolean validar(Persona objeto) {
        int suma = 0;
        String id = objeto.getCedula();
        if (id.length() == 9) {
            return false;
        } else {
            int a[] = new int[id.length() / 2];
            int b[] = new int[(id.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < id.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(id.charAt(c)));
                c = c + 2;
                if (i < (id.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(id.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(id.charAt(id.length() - 1)))) {
                return true;
            } else if (suma % 10 == 0 && id.charAt(id.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }
        }
        
    }

    @Override
    public int generarId() {
        return 0;
       
    }
    public List<Persona> personas() {

        List<Persona> listaP = new ArrayList();
        Persona persona;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            persona = (Persona) i.next();
            listaP.add(persona);

        }
        return listaP;

    }
    
}
