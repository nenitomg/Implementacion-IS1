/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.List;

/**
 *
 * @author eugen
 */
public class Receta {
    private String nombre;
    private String instrucciones;
    public List<LineaDeReceta>lrs;

    
    public String getNombre(){
        return this.nombre;
    }
    
    @Override
    public String toString(){
        return null;
    }
    
    public void nuevaLr(Alimento a, String uMedida, float cantidad){
    
    }
}
