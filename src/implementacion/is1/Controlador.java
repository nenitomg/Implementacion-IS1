/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.*;

/**
 *
 * @author eugen
 */
public class Controlador {

    SortedSet <comidaDiaria> cds;
    public comidaDiaria cd;
    public Receta r;
    public Alimento a;
    public GrupoAlimentos ga;
    public Registro registro;
    
    public Controlador (){
        registro = new Registro();
    }
    
    public void crearReceta(){
        r = new Receta();
    }
    
    public void inNomInstReceta(String nom,String inst){
        r.setNombre(nom);
        r.setInstrucciones(inst);
    }
    
    public void añadirAlimentoReceta(String nomAlimento, String uMedida, float cantidad){
        a = registro.getAlimento(nomAlimento);
        r.nuevaLr(a, uMedida, cantidad);
    }
    
    public boolean confirmarReceta(){
        return registro.nuevaReceta(r);
    }
    
    public String inNomReceta(String nom){
        r = registro.getReceta(nom);
        return r.toString();
    }
    
    public void añadirGrupoAlimentos(){
        ga = new GrupoAlimentos();
    }
    
    public void inNomDescGA(String nom, String desc){
        ga.setDescripcion(desc);
        ga.setNombre(nom);
    }
    
    public boolean añadirAlimento(String nomAlimento){
        a = registro.getAlimento(nomAlimento);
        if(a == null){
            return false;
        }else{
            ga.añadirAlimento(a);
            return true;
        }
    }
    
    public boolean confirmarGrupo(){
        return registro.nuevoGrupoAlimento(ga);  
    }
    
    public void inNomGA(String nom){
        ga = registro.getGrupoAlimentos(nom);
    }
    
    public void confirmarBorradoGA(){
        registro.borrarGrupoAlimento(ga);
    }
    
    public boolean eliminarAlimentoGA(String nomAlimento){
        a = ga.getAlimento(nomAlimento);
        if(a == null){
            return false;
        }else{
            ga.añadirAlimento(a);
            return true;
        }
    }
    
    public void confirmarBorradoA(){
        ga.eliminarAlimento(a);
    }
    
    public String inFechas(GregorianCalendar inicio, GregorianCalendar fin){
        cds = registro.getComidas(inicio, fin);
        if (cds.isEmpty()){
            return "No Hay ninguna comida entre esas fechas";
        }else{
            String s = "";
            Iterator it = cds.iterator();
            while(it.hasNext()){
               s += it.next().toString() + "\n"; 
            }
            return s;
        }
    }
    
    public void registroComida(){
        cd = new comidaDiaria();
    }
    
    public void inNomComida(String nom){
        cd.setNombre(nom);
        cd.setFecha();
    }
    
    public void añadirReceta(String nomReceta){
        r = registro.getReceta(nomReceta);
        cd.añadirReceta(r);
    }
    
    public void confirmarComida(){
        registro.añadirComida(cd);
    }
}
