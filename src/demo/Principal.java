/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import ups.edu.ec.cuadrado.PiezaCuadrada;
import ups.edu.ec.redondo.PiezaRedonda;
import ups.edu.ec.adaptador.Adaptador;
import ups.edu.ec.redondo.encaja;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        // pieza redonda en agujero redondo encaja
        encaja hole = new encaja(5);
        PiezaRedonda rpeg = new PiezaRedonda(5);
        if (hole.encajar(rpeg)) {
            System.out.println("La pieza redonda de radio 5 encaja en el agujero redondo de radio 5.");
        }

        PiezaCuadrada piezaPeq = new PiezaCuadrada(2);
        PiezaCuadrada piezaGra = new PiezaCuadrada(20);
        // hole.encajar(piezaPeq); // No va a compilar

        // El Adaptador soluciona el problema
        Adaptador AdaptadorPiezaPeq = new Adaptador(piezaPeq);
        Adaptador AdaptadorPiezaGra = new Adaptador(piezaGra);
        if (hole.encajar(AdaptadorPiezaPeq)) {
            System.out.println("La pieza cuadrada de ancho 2 encaja en el agujero redondo de radio 5.");
        }
        if (!hole.encajar(AdaptadorPiezaGra)) {
            System.out.println("La pieza cuadrada de ancho 20 no encaja en el orificio redondo de radio 5.");
        }
    }
    
}
