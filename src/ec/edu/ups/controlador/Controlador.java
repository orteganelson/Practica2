/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.*;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author Usuario
 */
public abstract class Controlador<E>{
    private List<E> listaG;

    public Controlador() {
    }
    
    public Controlador(List<E> listaG) {
        this.listaG = listaG;
    }
    public List<E> getListaG() {
        return listaG;
    }

    public void setListaG(List<E> listaG) {
        this.listaG = listaG;
    }
    public boolean crear(E objeto) {

        if (validar(objeto) == true) {
            return listaG.add(objeto);
        }
        return false;

    }
    public abstract boolean validar(E objeto);

    public abstract int generarId();

    public Optional<E> buscar(E comparar) {
        return listaG.stream().filter(objeto -> objeto.equals(comparar)).findFirst();

    }

    public int posicion(E objetoC) {
        for (int i = 0; i < listaG.size() ; i++) {
            E objetoL = listaG.get(i);
            if (objetoL.equals(objetoC)) {
                return i;
            }
        }
        return -1;

    }

    public boolean eliminar(E objeto) {
        Optional<E> buscar = buscar(objeto);
        E objetoE = buscar.get();
        if (objetoE != null) {
            System.out.println("Verdadero");
            return listaG.remove(objetoE);

        }
        System.out.println("Falso");
        return false;

    }

    public boolean actualizar(E objetoA) {
        int pos = posicion(objetoA);
        if (pos >=0) {
            listaG.set(pos, objetoA);
            System.out.println("True");
            return true;

        }
        System.out.println("false");
        return false;

    }

    public void cargarDatos(String ruta)throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream archivo = new FileInputStream(ruta);
        ObjectInputStream datos = new ObjectInputStream(archivo);
        listaG= (List<E>) datos.readObject();
    }
    public void guardarDatos(String ruta)throws FileNotFoundException, IOException, ClassNotFoundException{
        FileOutputStream archivo= new FileOutputStream(ruta);
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(listaG);
    }
    public List<E> getLista() {
        return listaG;
    }

    public void setLista(List<E> lista) {
        this.listaG= lista;
    }
    
}