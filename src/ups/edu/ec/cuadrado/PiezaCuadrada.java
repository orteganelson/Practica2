/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.cuadrado;

/**
 *
 * @author Usuario
 */
public class PiezaCuadrada {
     private double ancho;

    public PiezaCuadrada(double width) {
        this.ancho = width;
    }

    public double getAncho() {
        return ancho;
    }

    public double getCuadrado() {
        double result;
        result = Math.pow(this.ancho, 2);
        return result;
    }
}
