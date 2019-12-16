/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.Objects;

/**
 *
 * @author eugen
 */
public class Alimento {

   
    public String nombre;
    private String desc;
    private String tempC;
    
    
    public Alimento(String nombre, String desc, String tempC){
        this.nombre = nombre;
        this.desc = desc;
        this.tempC = tempC;
    }
    
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
    }
    
    public boolean equals(Object o){
        
        Alimento a = (Alimento)o;
        
        return this.getNombre().equals(a.getNombre());
    }
    
    public int hashCode(){
        
        return Objects.hash(this.nombre);
    }
    
   
    public String toString(){
        
        String Str = new String();
        
        Str = "Nombre: "+ this.getNombre() + "\nDescripcion: "+ this.getDesc() +"\nTemporada de Consumo: "+this.getTempC();
        
        return Str;
    }
}
