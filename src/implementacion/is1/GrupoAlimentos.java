/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author eugen
 */
public class GrupoAlimentos {
    
    private String nombre;
    private String descripcion;
    public Set<Alimento> la;
    
    public GrupoAlimentos(){
        this.la = new HashSet();   
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean añadirAlimento(Alimento a){
        boolean exito;
        
        exito = la.add(a);
        
        return exito;
    }
    
    public boolean eliminarAlimento(Alimento a){
        
        boolean exito;
        
        exito = la.remove(a);
        
        return exito;
    
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
    
    public boolean equals(Object o){
        GrupoAlimentos ga = (GrupoAlimentos) o;
        
        return this.getNombre().equals(ga.getNombre());
    }
    
      public int hashCode(){
        
        return Objects.hash(this.nombre);
    }
    
    
    public String toString(){
        
        String Str = new String();
        
        Str = "Nombre: "+this.getNombre()+"\nDescripcion: "+this.getDescripcion()+"\n";
        
        Str += "Lista de Alimentos: \n";
        
        Iterator it = this.la.iterator();
        
        
        while(it.hasNext()){
            
            Alimento a = (Alimento) it.next();
            
            Str+="  - "+a.toString()+"\n";
        }
        
        return Str;
    }
}
