/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eugen
 */
public class GrupoAlimentos {
    private String nombre;
    private String descripcion;
    public List<Alimento>la;
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void añadirAlimento(Alimento a){
        
    }
    
    public void eliminarAlimento(Alimento a){
    
    }
    
    //Devuelve nulo si no lo encuentra en caso contrario el alimento
    public Alimento getAlimento(String nomAlimento){
        Iterator it = la.iterator();
        
        while(it.hasNext()){
            Alimento aux = (Alimento)it.next();
            if(aux.getNombre().equals(nomAlimento)){
                return aux;
            }  
        }
        
        return null;
    }
}
