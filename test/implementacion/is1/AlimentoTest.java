/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.Objects;
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
public class AlimentoTest {
    
    public AlimentoTest() {
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
     * Test of getNombre method, of class Alimento.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        String expResult = "nom1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Alimento.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nom2";
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        instance.setNombre(nombre);
        String expResult = nombre;
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDesc method, of class Alimento.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        String expResult = "desc1";
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDesc method, of class Alimento.
     */
    @Test
    public void testSetDesc() {
        System.out.println("setDesc");
        String desc = "desc2";
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        instance.setDesc(desc);
        String expResult = desc;
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTempC method, of class Alimento.
     */
    @Test
    public void testGetTempC() {
        System.out.println("getTempC");
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        String expResult = "tempC1";
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTempC method, of class Alimento.
     */
    @Test
    public void testSetTempC() {
        System.out.println("setTempC");
        String tempC = "tempC2";
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        instance.setDesc(tempC);
        String expResult = tempC;
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Alimento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        Alimento instance2 = new Alimento("nom1", "desc1", "tempC1");
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Alimento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        int expResult = Objects.hash("nom1");
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Alimento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alimento instance = new Alimento("nom1", "desc1", "tempC1");
        String Str = new String();
        Str = "Nombre: "+ "nom1" + "\nDescripcion: "+ "desc1" +"\nTemporada de Consumo: "+"tempC1";
        String expResult = Str;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
