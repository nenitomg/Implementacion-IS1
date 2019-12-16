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
    
    public boolean añadirAlimentoReceta(String nomAlimento, String uMedida, float cantidad){
        a = registro.getAlimento(nomAlimento);
        if (a == null){
            return false;
        }else{
            r.nuevaLr(a, uMedida, cantidad);
            return true;
        } 
    }
    
    public boolean confirmarReceta(){
        return registro.nuevaReceta(r);
    }
    
    public String inNomReceta(String nom){
        r = registro.getReceta(nom);
        if (r == null){
            return "No hay ninguna Receta con ese nombre en el Sistema\n";
        }else{
            return r.toString();
        }  
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
    
    public String inNomGA(String nom){
        ga = registro.getGrupoAlimentos(nom);
        if (ga == null){
            return "No hay ningún Grupo de Alimentos con ese nombre en el Sistema\n";
        }else{
            return ga.toString();
        }
    }
    
    public void confirmarBorradoGA(){
        registro.borrarGrupoAlimento(ga);
    }
    
    public String eliminarAlimentoGA(String nomAlimento){
        a = ga.getAlimento(nomAlimento);
        if(a == null){
            return null;
        }else{
            return a.toString();
        }
    }
    
    public void confirmarBorradoA(){
        ga.eliminarAlimento(a);
    }
    
    public String inFechas(GregorianCalendar inicio, GregorianCalendar fin){
        cds = registro.getComidas(inicio, fin);
        if (cds == null){
            return "No hay ninguna comida entre esas fechas\n";
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
    
    public boolean añadirReceta(String nomReceta){
        r = registro.getReceta(nomReceta);
        if (r == null){
            return false;
        }else{
            cd.añadirReceta(r);
            return true;
        }
    }
    
    public boolean confirmarComida(){
        return registro.añadirComida(cd);
    }

    public SortedSet<comidaDiaria> getCds() {
        return cds;
    }

    public void setCds(SortedSet<comidaDiaria> cds) {
        this.cds = cds;
    }

    public comidaDiaria getCd() {
        return cd;
    }

    public void setCd(comidaDiaria cd) {
        this.cd = cd;
    }

    public Receta getR() {
        return r;
    }

    public void setR(Receta r) {
        this.r = r;
    }

    public Alimento getA() {
        return a;
    }

    public void setA(Alimento a) {
        this.a = a;
    }

    public GrupoAlimentos getGa() {
        return ga;
    }

    public void setGa(GrupoAlimentos ga) {
        this.ga = ga;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }
    
    
}
