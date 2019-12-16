/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.Calendar;
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
public class comidaDiariaTest {
    
    public comidaDiariaTest() {
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
     * Test of getNombre method, of class comidaDiaria.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        comidaDiaria instance = new comidaDiaria();
        instance.setNombre("Manuel");
        String expResult = "Manuel";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class comidaDiaria.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Manuel";
        comidaDiaria instance = new comidaDiaria();
        instance.setNombre(nombre);
        
        assertEquals(nombre, instance.getNombre());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRs method, of class comidaDiaria.
     */
    @Test
    public void testGetRs() {
        System.out.println("getRs");
        comidaDiaria instance = new comidaDiaria();
        Set<Receta> expResult = null;
        Set<Receta> result = instance.getRs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRs method, of class comidaDiaria.
     */
    @Test
    public void testSetRs() {
        System.out.println("setRs");
        Set<Receta> rs = null;
        comidaDiaria instance = new comidaDiaria();
        instance.setRs(rs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class comidaDiaria.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        comidaDiaria instance = new comidaDiaria();
        Calendar expResult = null;
        Calendar result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class comidaDiaria.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        comidaDiaria instance = new comidaDiaria();
        instance.setFecha();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirReceta method, of class comidaDiaria.
     */
    @Test
    public void testAñadirReceta() {
        System.out.println("a\u00f1adirReceta");
        Receta r = null;
        comidaDiaria instance = new comidaDiaria();
        boolean expResult = false;
        boolean result = instance.añadirReceta(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class comidaDiaria.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object o = null;
        comidaDiaria instance = new comidaDiaria();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class comidaDiaria.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        comidaDiaria instance = new comidaDiaria();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class comidaDiaria.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        comidaDiaria instance = new comidaDiaria();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TOD review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class comidaDiaria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        comidaDiaria instance = new comidaDiaria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
