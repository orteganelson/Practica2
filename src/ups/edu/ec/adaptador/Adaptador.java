/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.adaptador;

import ups.edu.ec.cuadrado.PiezaCuadrada;
import ups.edu.ec.redondo.PiezaRedonda;

/**
 *
 * @author Usuario
 */
public class Adaptador extends PiezaRedonda{
    private PiezaCuadrada pieza;

    public Adaptador(PiezaCuadrada peg) {
        this.pieza = peg;
    }

    @Override
    public double getRadio() {
        double result;
        // Calcule un radio de círculo mínimo, que pueda ajustarse a esta pieza
        result = (Math.sqrt(Math.pow((pieza.getAncho() / 2), 2) * 2));
        return result;
    }
}
