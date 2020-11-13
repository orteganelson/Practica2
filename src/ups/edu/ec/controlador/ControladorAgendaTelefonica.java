/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author Usuario
 */
public class ControladorAgendaTelefonica <Lis>{
    private List<Lis> lista;

    public ControladorAgendaTelefonica() {
        lista = new ArrayList<>();
    }

    public void create(Lis obj){
        lista.add(obj);
    }
    
    public Optional<Lis> read(Predicate<Lis> pr){
        return lista.stream().filter(pr).findFirst();
    }
    
    
    public boolean update(Lis obj, Lis objetoNuevo){
        int posicion = lista.indexOf(obj);
        lista.set(posicion, objetoNuevo);
        return false;
    }
    
    public boolean delete(Lis obj){
        if(lista.contains(obj)){
            lista.remove(obj);
            return true;
        }
        return false;
    }
    
    public List<Lis> findAll(){
        return lista;
    }
}
