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
public class Registro {
    public Set<comidaDiaria>lcd;
    public Set<Alimento>lda;
    public Set<Receta>ldr;
    public Set<GrupoAlimentos>lga;
    
    public Registro (){
        lcd = new HashSet();
        lda = new HashSet();
        ldr = new HashSet();
        lga = new HashSet();
        lda.add(new Alimento("Ajo","Pese a su “mala fama” por ser un ingrediente fuerte y que nos deja un aliento peculiar, el ajo tiene un gran valor a nivel nutritivo "
                           + "y además estamos ante un alimento que tiene muy pocas calorías, todo esto unido a que tiene mucha vitamina C, vitamina B6 y manganeso.", "Todo el año"));
        lda.add(new Alimento("Cebolla","Perfecta para evitar los problemas circulatorios, combatir el colesterol "
                           + "y la hipertensión y si esto fuera poco además es un ingrediente diurético.", "Todo el año."));
        lda.add(new Alimento("Remolacha","Gran fuente de hierro, ayuda a prevenir enfermedades.", "Todo el año."));
        lda.add(new Alimento("Zanahoria","Destaca en especial por su vitamina A y sus carotenoides, además son fuente de potasio, de fósforo, de magnesio, de yodo y de calcio.", 
                             "Todo el año pero especialmente en Junio"));
        lda.add(new Alimento("Huevo","Ricos en proteínas de alto valor biológico, contiene todos los aminoácidos esenciales.", "Todo el año."));
        lda.add(new Alimento("Lenteja", "Una estupenda fuente de proteína de origen vegetal, además de su tan nombrado hierro son ricas también en potasio, fósforo y calcio.",
                             "Otoño."));
        lda.add(new Alimento("Garbanzo","Son fuente de vitaminas del grupo B destacando la B9, el ácido fólico y además de vitamina A y algo de vitamina C. "
                           + "También nos aporta minerales como el calcio, el hierro, el yodo, el magnesio, el potasio, el sodio, el selenio o el zinc.","Otoño."));
        lda.add(new Alimento("Arroz","Posee una elevada posición entre los cereales al considerar su aporte energético en calorías, así como en proteínas. No contiene gluten.",
                             "Otoño-Invierno."));
        lda.add(new Alimento("Patata","Es una buena fuente de energía, con alto contenido en folato, vitamina C, vitaminas del grupo B, hierro y potasio.","Primavera-Verano"));
        lda.add(new Alimento("Tomate","Es rico en vitaminas y minerales, además nos aporta vitamina C y es un gran antioxidante natural. "
                           + "También destaca en vitamina A, vitamina K, en hierro y en potasio.","Octubre y Junio"));
    }
    
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
    
    public SortedSet<comidaDiaria> getComidas(GregorianCalendar inicio, GregorianCalendar fin){
        Iterator it = lcd.iterator();
        SortedSet <comidaDiaria> aux = new TreeSet();
        
        while(it.hasNext()){
            comidaDiaria cd = (comidaDiaria)it.next();
            
            if(cd.getFecha().after(inicio) && cd.getFecha().before(fin)){
                aux.add(cd);
            }
        }
        return aux;
    }
}
