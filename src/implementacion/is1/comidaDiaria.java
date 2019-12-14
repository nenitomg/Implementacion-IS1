/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;



/**
 *
 * @author eugen
 */
public class comidaDiaria {
    private String nombre;
    private Calendar fecha;
    private Set <Receta> rs;
    
    
    public comidaDiaria(String nombre){
        this.nombre = nombre;
        
        this.fecha = new GregorianCalendar();
        
        this.rs = new HashSet();
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Receta> getRs() {
        return rs;
    }

    public void setRs(Set<Receta> rs) {
        this.rs = rs;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public boolean añadirReceta(Receta r){
        
        boolean exito;
        
        exito = this.rs.add(r);
        
        return exito;
        
        
    
    }
    
    public int compareTo(Object o){
        comidaDiaria cd = (comidaDiaria) o;
        
        return this.getFecha().compareTo(cd.getFecha());
    }
    
    
    public boolean equals(Object o){
        
        
        comidaDiaria cd = (comidaDiaria) o;

        return this.getFecha().equals(cd.getFecha());
        
    }
    
    public int hashCode(){
       
        
        return Objects.hash(this.nombre,this.fecha);
    }
    
    public String toString(){
        
        String Str = new String();
        
        Str = "Nombre: "+this.getNombre()+"\nFecha: "+this.getFecha().get(Calendar.DATE)+"/"+this.getFecha().get(Calendar.MONTH)+"/"+this.getFecha().get(Calendar.YEAR)+"\n";
        
        Str+="Lista De Recetas: \n";
        
        Iterator it = rs.iterator();
        
        
        while(it.hasNext()){
            
            Receta r = (Receta) it.next();
            
            Str+= "  - "+r.toString()+"\n";
        }
        
        return Str;
    }
}
