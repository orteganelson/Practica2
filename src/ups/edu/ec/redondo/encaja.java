/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.redondo;

/**
 *
 * @author Usuario
 */
public class encaja {
    private double radio;

    public encaja(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean encajar(PiezaRedonda pieza) {
        boolean result;
        result = (this.getRadio() >= pieza.getRadio());
        return result;
    }
}
