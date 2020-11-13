/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 * @param <L>
 */
public abstract class Controlador<L> {
    private List<L> listaGenerica;

    public Controlador() {
        listaGenerica = new ArrayList<>();
    }

    public boolean create(L objCrear) {
        if (!listaGenerica.contains(objCrear)) {
            return listaGenerica.add(objCrear);
        }
        return false;
    }

    public L read(L objBuscar) {
        if (listaGenerica.contains(objBuscar)) {
            return (L) listaGenerica.stream().filter(objeto -> objeto.equals(objBuscar)).findFirst().get();
        } else 
            return null;

    }

    public L update(L objAnterior, L objNuevo) {
        int index = listaGenerica.indexOf(objAnterior);
        return listaGenerica.set(index, objNuevo);
    }

    public boolean delete(L objEliminar) {
        return listaGenerica.remove(objEliminar);
    }

    public List<L> findAll() {
        return listaGenerica;
    }

    public abstract int cargarCodigo();
}
