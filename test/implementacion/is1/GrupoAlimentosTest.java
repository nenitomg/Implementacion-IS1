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
public class GrupoAlimentosTest {
    
    public GrupoAlimentosTest() {
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
     * Test of getNombre method, of class GrupoAlimentos.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.setNombre("nom1");
        String expResult = "nom1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class GrupoAlimentos.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.setNombre("nom1");
        String expResult = "nom1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescripcion method, of class GrupoAlimentos.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.setDescripcion("desc1");
        String expResult = "desc1";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class GrupoAlimentos.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.setDescripcion("desc1");
        String expResult = "desc1";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of añadirAlimento method, of class GrupoAlimentos.
     */
    @Test
    public void testAñadirAlimento() {
        System.out.println("a\u00f1adirAlimento");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        GrupoAlimentos instance = new GrupoAlimentos();
        boolean expResult = true;
        boolean result = instance.añadirAlimento(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarAlimento method, of class GrupoAlimentos.
     */
    @Test
    public void testEliminarAlimento() {
        System.out.println("eliminarAlimento");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.añadirAlimento(a);
        boolean expResult = true;
        boolean result = instance.eliminarAlimento(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlimento method, of class GrupoAlimentos.
     */
    @Test
    public void testGetAlimento() {
        System.out.println("getAlimento");
        String nomAlimento = "nom1";
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.añadirAlimento(a);
        Alimento expResult = a;
        Alimento result = instance.getAlimento(nomAlimento);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class GrupoAlimentos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        GrupoAlimentos instance = new GrupoAlimentos();
        GrupoAlimentos instance2 = new GrupoAlimentos();
        instance.setNombre("nom1");
        instance2.setNombre("nom2");
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class GrupoAlimentos.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.setNombre("nom1");
        int expResult = Objects.hash("nom1");
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class GrupoAlimentos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GrupoAlimentos instance = new GrupoAlimentos();
        instance.setNombre("nom1");
        instance.setDescripcion("desc1");
        Set<Alimento> la = new HashSet();
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        la.add(a);
        instance.añadirAlimento(a);
        String Str;
        Str = "Nombre: "+"nom1"+"\nDescripcion: "+"desc1"+"\n";       
        Str += "Lista de Alimentos: \n";        
        Iterator it = la.iterator();
        while(it.hasNext()){  
            Alimento aux = (Alimento) it.next();
            Str+="  - "+aux.toString()+"\n";
        }
        String expResult = Str;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
