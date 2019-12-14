/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eugen
 */
public class Registro {
    public HashSet<comidaDiaria>lcd;
    public HashSet<Alimento>lda;
    public HashSet<Receta>ldr;
    public HashSet<GrupoAlimentos>lga;
    
    public boolean nuevoGrupoAlimento(GrupoAlimentos ga){
        return lga.add(ga);
    }
    
    public boolean borrarGrupoAlimento(GrupoAlimentos ga){
        return lga.remove(ga);
    }
    
    public GrupoAlimentos getGrupoAlimentos(String nom){
        Iterator it = lga.iterator();
        
        while(it.hasNext()){
            GrupoAlimentos aux = (GrupoAlimentos)it.next();
            
            if(aux.getNombre().equals(nom)){
                return aux;
            }
        }
        return null;
    }
    
    public Alimento getAlimento(String nom){
        Iterator it = lda.iterator();
        
        while(it.hasNext()){
            Alimento aux = (Alimento)it.next();
            
            if(aux.getNombre().equals(nom)){
                return aux;
            }
        }
        return null;
    }
    
    public boolean nuevaReceta(Receta r){
        return ldr.add(r);
    }
    
    public Receta getReceta(String nomReceta){
        Iterator it = ldr.iterator();
        
        while(it.hasNext()){
            Receta aux = (Receta)it.next();
            
            if(aux.getNombre().equals(nomReceta)){
                return aux;
            }
        }
        return null;
    }
    
    public boolean añadirComida(comidaDiaria cd){
        return lcd.add(cd);
    }
    
    public List<comidaDiaria> getComidas(GregorianCalendar inicio, GregorianCalendar fin){
        Iterator it = lcd.iterator();
        List <comidaDiaria> aux = null;
        
        while(it.hasNext()){
            comidaDiaria cd = (comidaDiaria)it.next();
            
            if(inicio.before(cd.getFecha())&&fin.after(cd.getFecha())){
                if(aux.add(cd)==false){
                    throw new Error("Error al añadir comida diaria a la lista auxiliar (Registro)");
                }
            }
        }
        return aux;
    }
    
}
