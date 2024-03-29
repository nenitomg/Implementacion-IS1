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
public class LineaDeReceta {

    
    private String uMedida;
    private float cantidad;
    public Alimento a;
    
    
    public LineaDeReceta(Alimento a, String uMedida, float cantidad){
        this.a = a;
        this.uMedida = uMedida;
        this.cantidad = cantidad;
    }
    
    public String getuMedida() {
        return uMedida;
    }

    public void setuMedida(String uMedida) {
        this.uMedida = uMedida;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Alimento getAlimento() {
        return a;
    }

    public void setAlimento(Alimento a) {
        this.a = a;
    }
    
    public boolean equals(Object o){
        
        LineaDeReceta lr = (LineaDeReceta)o;
        
        return this.getAlimento().equals(lr.getAlimento());
    }
    
          public int hashCode(){
        return Objects.hash(this.a.nombre,this.cantidad,this.uMedida);
          }
    
       
    public String toString(){
        
        String Str = new String();
        
        Str = "Alimento: \n"+ this.getAlimento().toString()+"\nCantidad: "+this.getCantidad()+" "+this.getuMedida();
        return Str;
    }
}
