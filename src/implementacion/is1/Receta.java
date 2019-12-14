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
public class Receta {
    private String nombre;
    private String instrucciones;  
    private Set<LineaDeReceta>lrs;
    
    public Receta(String nombre, String instrucciones){
        this.nombre = nombre;
        this.instrucciones = instrucciones;
        this.lrs = new HashSet();
    }
<<<<<<< HEAD
<<<<<<< HEAD

    public Receta() {
        
    }
=======
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
    
    public String getNombre() {
        return nombre;
    }
<<<<<<< HEAD

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

=======

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Set<LineaDeReceta> getLrs() {
        return lrs;
    }

    public void setLrs(Set<LineaDeReceta> lrs) {
        this.lrs = lrs;
    }
<<<<<<< HEAD
    
    public boolean nuevaLr(Alimento a, String uMedida, float cantidad){
        boolean exito;
        
        LineaDeReceta lr = new LineaDeReceta(a,uMedida,cantidad);
        
        exito = lrs.add(lr);
        
        return exito;
    }
    
    @Override
    public boolean equals(Object o){
        Receta r = (Receta) o;
        return this.getNombre().equals(r.getNombre());
    }
    
    @Override
    public int hashCode(){
=======
    
    public boolean nuevaLr(Alimento a, String uMedida, float cantidad){
        boolean exito;
        
        LineaDeReceta lr = new LineaDeReceta(a,uMedida,cantidad);
        
        exito = lrs.add(lr);
        
        return exito;
        
        
    
    }
    
    public boolean equals(Object o){
        
        Receta r = (Receta) o;
        
        return this.getNombre().equals(r.getNombre());
    }
    
          public int hashCode(){
        
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
        return Objects.hash(this.nombre,this.instrucciones);
    }
    
    
 
    
<<<<<<< HEAD
    @Override
=======
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
=======
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Set<LineaDeReceta> getLrs() {
        return lrs;
    }

    public void setLrs(Set<LineaDeReceta> lrs) {
        this.lrs = lrs;
    }
    
    public boolean nuevaLr(Alimento a, String uMedida, float cantidad){
        boolean exito;
        
        LineaDeReceta lr = new LineaDeReceta(a,uMedida,cantidad);
        
        exito = lrs.add(lr);
        
        return exito;
        
        
    
    }
    
    public boolean equals(Object o){
        
        Receta r = (Receta) o;
        
        return this.getNombre().equals(r.getNombre());
    }
    
          public int hashCode(){
        
        return Objects.hash(this.nombre,this.instrucciones);
    }
    
    
 
    
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
    public String toString(){
        String Str = new String();
        
        Str = "Nombre: "+this.getNombre()+"\nInstrucciones: "+this.getInstrucciones()+"\nAlimentos de la receta:\n";
        
        Iterator it = this.getLrs().iterator();
        
        while(it.hasNext()){
            LineaDeReceta lr = (LineaDeReceta)it.next();
            
            Str+= "  - "+lr.toString()+"\n";
        }
<<<<<<< HEAD
<<<<<<< HEAD
   
=======
        
        
        
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
=======
        
        
        
>>>>>>> cf561aed30b290081c77c1bc66ca700d608a88d9
        return Str;
    }
}
