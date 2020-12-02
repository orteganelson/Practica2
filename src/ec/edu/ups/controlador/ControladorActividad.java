    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Actividad;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Usuario
 */
public class ControladorActividad extends Controlador<Actividad> {

    private Pattern patron;
    private Matcher corpus;

    public ControladorActividad(String ruta) {
        super(ruta);
    }

    @Override
    public boolean validar(Actividad objeto) {
        return true;

    }

    @Override
    public int generarId() {
        List<Actividad> temp = new ArrayList();
        for (Actividad a : super.getLista()) {
            Actividad m = (Actividad) a;
            temp.add(m);

        }

        if (temp.size() > 0 && temp != null) {
            return temp.get(temp.size() - 1).getCodigo() + 1;
        } else {
            return 1;
        }

    }

    public void ingresarRegex(String regex) {
        patron = Pattern.compile(regex);
    }

    public Set<String> obtenerUrl(String texto) {

        Set<String> resultado = new HashSet();
        corpus = patron.matcher(texto);

        while (corpus.find()) {
            resultado.add(corpus.group(0));
        }
        return resultado;

    }

    public List<Actividad> actividades() {

        List<Actividad> lista = new ArrayList();
        Actividad actividad;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            actividad = (Actividad) i.next();
            lista.add(actividad);

        }
        return lista;

    }

}
