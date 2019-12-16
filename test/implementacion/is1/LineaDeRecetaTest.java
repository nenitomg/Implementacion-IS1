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
public class LineaDeRecetaTest {
    
    public LineaDeRecetaTest() {
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
     * Test of getuMedida method, of class LineaDeReceta.
     */
    @Test
    public void testGetuMedida() {
        System.out.println("getuMedida");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        String expResult = "u1";
        String result = instance.getuMedida();
        assertEquals(expResult, result);
    }

    /**
     * Test of setuMedida method, of class LineaDeReceta.
     */
    @Test
    public void testSetuMedida() {
        System.out.println("setuMedida");
        String uMedida = "u2";
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        instance.setuMedida(uMedida);
        String expResult = "u2";
        String result = instance.getuMedida();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCantidad method, of class LineaDeReceta.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        float expResult = 3.0F;
        float result = instance.getCantidad();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setCantidad method, of class LineaDeReceta.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        float cantidad = 2.0F;
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        instance.setCantidad(cantidad);
        float expResult = 2.0F;
        float result = instance.getCantidad();
        assertEquals(expResult, result, 0.0);  
    }

    /**
     * Test of getAlimento method, of class LineaDeReceta.
     */
    @Test
    public void testGetAlimento() {
        System.out.println("getAlimento");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        Alimento expResult = a;
        Alimento result = instance.getAlimento();
        assertEquals(expResult, result);   
    }

    /**
     * Test of setAlimento method, of class LineaDeReceta.
     */
    @Test
    public void testSetAlimento() {
        System.out.println("setAlimento");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        Alimento b = new Alimento("nom2", "inst2", "tempC2");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        instance.setAlimento(b);
        Alimento expResult = b;
        Alimento result = instance.getAlimento();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class LineaDeReceta.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        Alimento b = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance2 = new LineaDeReceta(b, "u1", 3.0F);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class LineaDeReceta.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        int expResult = Objects.hash(a.getNombre(),"u1",3.0F);
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class LineaDeReceta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alimento a = new Alimento("nom1", "inst1", "tempC1");
        LineaDeReceta instance = new LineaDeReceta(a, "u1", 3.0F);
        String expResult = "Alimento: \n"+ a.toString()+"\nCantidad: "+instance.getCantidad()+" "+instance.getuMedida();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
