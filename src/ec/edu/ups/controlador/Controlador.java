/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Usuario
 * @param <E>
 */
public abstract class Controlador<E> {

    private String ruta;
    private List<E> lista;

    public Controlador(String ruta) {
        lista = new ArrayList();
        this.ruta = ruta;


    }
    
    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }

    public void cargarDatos() throws ClassNotFoundException, IOException {
        ObjectInputStream datos = null;
        try {
            File f = new File(ruta);
            FileInputStream a = new FileInputStream(f);
            datos = new ObjectInputStream(a);

            lista = (List<E>) datos.readObject();

        } catch (IOException e) {

        }

    }

    public void guardarDatos(String ruta) throws IOException {
        ObjectOutputStream datos = null;
        File f = new File(ruta);
        FileOutputStream archivo = new FileOutputStream(f);
        datos = new ObjectOutputStream(archivo);
        datos.writeObject(lista);

    }

    public boolean crear(E obj) {

        if (validar(obj) == true) {
            return lista.add(obj);
        }
        return false;

    }

    public Optional<E> buscar(E comparar) {
        return lista.stream().filter(objeto -> objeto.equals(comparar)).findFirst();

    }

    public int posicion(E objeto) {
        for (int i = 0; i < lista.size(); i++) {
            E objetoL = lista.get(i);
            if (objetoL.equals(objeto)) {
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
            return lista.remove(objetoE);

        }
        System.out.println("Falso");
        return false;

    }

    public boolean actualizar(E objeto2) {
        int pos = posicion(objeto2);
        if (pos >= 0) {
            lista.set(pos, objeto2);
            System.out.println("TRUE");
            return true;

        }
        System.out.println("FALSE");
        return false;

    }

    public abstract boolean validar(E objeto);

    public abstract int generarId();

    

}
