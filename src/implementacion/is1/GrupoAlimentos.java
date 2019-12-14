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
    
    public GrupoAlimentos(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
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
<<<<<<< HEAD
<<<<<<< HEAD
        
        exito = la.add(a);
        
=======
        
        exito = la.add(a);
        
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
=======
        
        exito = la.add(a);
        
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
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
    
<<<<<<< HEAD
<<<<<<< HEAD
    @Override
=======
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
=======
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
    public boolean equals(Object o){
        GrupoAlimentos ga = (GrupoAlimentos) o;
        
        return this.getNombre().equals(ga.getNombre());
    }
    
<<<<<<< HEAD
<<<<<<< HEAD
    @Override
    public int hashCode(){
=======
      public int hashCode(){
        
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
=======
      public int hashCode(){
        
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
        return Objects.hash(this.nombre);
    }
    
    
<<<<<<< HEAD
<<<<<<< HEAD
    @Override
=======
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
=======
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
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
