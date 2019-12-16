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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class RecetaTest {
    
    public RecetaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Receta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Receta instance = new Receta();
        instance.setNombre("nom1");
        String expResult = "nom1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Receta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        Receta instance = new Receta();
        instance.setNombre("nom1");
        String expResult = "nom1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getInstrucciones method, of class Receta.
     */
    @Test
    public void testGetInstrucciones() {
        System.out.println("getInstrucciones");
        Receta instance = new Receta();
        instance.setInstrucciones("inst1");
        String expResult = "inst1";
        String result = instance.getInstrucciones();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInstrucciones method, of class Receta.
     */
    @Test
    public void testSetInstrucciones() {
        System.out.println("setInstrucciones");
        Receta instance = new Receta();
        instance.setInstrucciones("inst1");
        String expResult = "inst1";
        String result = instance.getInstrucciones();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLrs method, of class Receta.
     */
    @Test
    public void testGetLrs() {
        System.out.println("getLrs");
        Set<LineaDeReceta> aux = new HashSet();
        aux.add(new LineaDeReceta(new Alimento("nom1", "inst1", "tempC1"), "u1", 3.0F));
        Receta instance = new Receta();
        instance.getLrs().add(new LineaDeReceta(new Alimento("nom1", "inst1", "tempC1"), "u1", 3.0F));
        Set<LineaDeReceta> expResult = aux;
        Set<LineaDeReceta> result = instance.getLrs();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLrs method, of class Receta.
     */
    @Test
    public void testSetLrs() {
        System.out.println("setLrs");
        Set<LineaDeReceta> aux = new HashSet();
        aux.add(new LineaDeReceta(new Alimento("nom2", "inst2", "tempC2"), "u2", 4.0F));
        Receta instance = new Receta();
        instance.getLrs().add(new LineaDeReceta(new Alimento("nom1", "inst1", "tempC1"), "u1", 3.0F));
        instance.setLrs(aux);
        Set<LineaDeReceta> expResult = aux;
        Set<LineaDeReceta> result = instance.getLrs();
        assertEquals(expResult, result);
    }

    /**
     * Test of nuevaLr method, of class Receta.
     */
    @Test
    public void testNuevaLr() {
        System.out.println("nuevaLr");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        String uMedida = "u1";
        float cantidad = 3.0F;
        Receta instance = new Receta();
        boolean expResult = true;
        boolean result = instance.nuevaLr(a, uMedida, cantidad);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Receta.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Receta instance = new Receta();
        instance.setNombre("nom1");
        Receta instance2 = new Receta();
        instance.setNombre("nom2");
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Receta.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Receta instance = new Receta();
        instance.setInstrucciones("inst1");
        instance.setNombre("nom1");
        int expResult = Objects.hash("nom1","inst1");
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Receta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Receta instance = new Receta();
        String nom = "nom1";
        String inst = "inst1";
        Set<LineaDeReceta> lrs = new HashSet();
        LineaDeReceta lr = new LineaDeReceta(new Alimento("nom1", "inst1", "tempC1"), "u1", 3.0F);
        lrs.add(lr);
        instance.setInstrucciones(inst);
        instance.setNombre(nom);
        instance.nuevaLr(new Alimento("nom1", "inst1", "tempC1"), "u1", 3.0F);
        String Str = "Nombre: "+ nom +"\nInstrucciones: "+inst+"\nAlimentos de la receta:\n";
        
        Iterator it = lrs.iterator();
        
        while(it.hasNext()){
            LineaDeReceta aux = (LineaDeReceta)it.next();
            
            Str+= "  - "+aux.toString()+"\n";
        }
        String expResult = Str;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
