/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.GregorianCalendar;
import java.util.SortedSet;
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
public class ControladorTest {
    
    public ControladorTest() {
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
     * Test of crearReceta method, of class Controlador.
     */
    @Test
    public void testCrearReceta() {
        System.out.println("crearReceta");
        Controlador instance = new Controlador();
        instance.crearReceta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inNomInstReceta method, of class Controlador.
     */
    @Test
    public void testInNomInstReceta() {
        System.out.println("inNomInstReceta");
        String nom = "";
        String inst = "";
        Controlador instance = new Controlador();
        instance.inNomInstReceta(nom, inst);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirAlimentoReceta method, of class Controlador.
     */
    @Test
    public void testAñadirAlimentoReceta() {
        System.out.println("a\u00f1adirAlimentoReceta");
        String nomAlimento = "";
        String uMedida = "";
        float cantidad = 0.0F;
        Controlador instance = new Controlador();
        boolean expResult = false;
        boolean result = instance.añadirAlimentoReceta(nomAlimento, uMedida, cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarReceta method, of class Controlador.
     */
    @Test
    public void testConfirmarReceta() {
        System.out.println("confirmarReceta");
        Controlador instance = new Controlador();
        boolean expResult = false;
        boolean result = instance.confirmarReceta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inNomReceta method, of class Controlador.
     */
    @Test
    public void testInNomReceta() {
        System.out.println("inNomReceta");
        String nom = "";
        Controlador instance = new Controlador();
        String expResult = "";
        String result = instance.inNomReceta(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirGrupoAlimentos method, of class Controlador.
     */
    @Test
    public void testAñadirGrupoAlimentos() {
        System.out.println("a\u00f1adirGrupoAlimentos");
        Controlador instance = new Controlador();
        instance.añadirGrupoAlimentos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inNomDescGA method, of class Controlador.
     */
    @Test
    public void testInNomDescGA() {
        System.out.println("inNomDescGA");
        String nom = "";
        String desc = "";
        Controlador instance = new Controlador();
        instance.inNomDescGA(nom, desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirAlimento method, of class Controlador.
     */
    @Test
    public void testAñadirAlimento() {
        System.out.println("a\u00f1adirAlimento");
        String nomAlimento = "";
        Controlador instance = new Controlador();
        boolean expResult = false;
        boolean result = instance.añadirAlimento(nomAlimento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarGrupo method, of class Controlador.
     */
    @Test
    public void testConfirmarGrupo() {
        System.out.println("confirmarGrupo");
        Controlador instance = new Controlador();
        boolean expResult = false;
        boolean result = instance.confirmarGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inNomGA method, of class Controlador.
     */
    @Test
    public void testInNomGA() {
        System.out.println("inNomGA");
        String nom = "";
        Controlador instance = new Controlador();
        String expResult = "";
        String result = instance.inNomGA(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarBorradoGA method, of class Controlador.
     */
    @Test
    public void testConfirmarBorradoGA() {
        System.out.println("confirmarBorradoGA");
        Controlador instance = new Controlador();
        instance.confirmarBorradoGA();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAlimentoGA method, of class Controlador.
     */
    @Test
    public void testEliminarAlimentoGA() {
        System.out.println("eliminarAlimentoGA");
        String nomAlimento = "";
        Controlador instance = new Controlador();
        String expResult = "";
        String result = instance.eliminarAlimentoGA(nomAlimento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarBorradoA method, of class Controlador.
     */
    @Test
    public void testConfirmarBorradoA() {
        System.out.println("confirmarBorradoA");
        Controlador instance = new Controlador();
        instance.confirmarBorradoA();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inFechas method, of class Controlador.
     */
    @Test
    public void testInFechas() {
        System.out.println("inFechas");
        GregorianCalendar inicio = null;
        GregorianCalendar fin = null;
        Controlador instance = new Controlador();
        String expResult = "";
        String result = instance.inFechas(inicio, fin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registroComida method, of class Controlador.
     */
    @Test
    public void testRegistroComida() {
        System.out.println("registroComida");
        Controlador instance = new Controlador();
        instance.registroComida();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inNomComida method, of class Controlador.
     */
    @Test
    public void testInNomComida() {
        System.out.println("inNomComida");
        String nom = "";
        Controlador instance = new Controlador();
        instance.inNomComida(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirReceta method, of class Controlador.
     */
    @Test
    public void testAñadirReceta() {
        System.out.println("a\u00f1adirReceta");
        String nomReceta = "";
        Controlador instance = new Controlador();
        boolean expResult = false;
        boolean result = instance.añadirReceta(nomReceta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarComida method, of class Controlador.
     */
    @Test
    public void testConfirmarComida() {
        System.out.println("confirmarComida");
        Controlador instance = new Controlador();
        boolean expResult = false;
        boolean result = instance.confirmarComida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCds method, of class Controlador.
     */
    @Test
    public void testGetCds() {
        System.out.println("getCds");
        Controlador instance = new Controlador();
        SortedSet<comidaDiaria> expResult = null;
        SortedSet<comidaDiaria> result = instance.getCds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCds method, of class Controlador.
     */
    @Test
    public void testSetCds() {
        System.out.println("setCds");
        SortedSet<comidaDiaria> cds = null;
        Controlador instance = new Controlador();
        instance.setCds(cds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCd method, of class Controlador.
     */
    @Test
    public void testGetCd() {
        System.out.println("getCd");
        Controlador instance = new Controlador();
        comidaDiaria expResult = null;
        comidaDiaria result = instance.getCd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCd method, of class Controlador.
     */
    @Test
    public void testSetCd() {
        System.out.println("setCd");
        comidaDiaria cd = null;
        Controlador instance = new Controlador();
        instance.setCd(cd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getR method, of class Controlador.
     */
    @Test
    public void testGetR() {
        System.out.println("getR");
        Controlador instance = new Controlador();
        Receta expResult = null;
        Receta result = instance.getR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setR method, of class Controlador.
     */
    @Test
    public void testSetR() {
        System.out.println("setR");
        Receta r = null;
        Controlador instance = new Controlador();
        instance.setR(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getA method, of class Controlador.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        Controlador instance = new Controlador();
        Alimento expResult = null;
        Alimento result = instance.getA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setA method, of class Controlador.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        Alimento a = null;
        Controlador instance = new Controlador();
        instance.setA(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGa method, of class Controlador.
     */
    @Test
    public void testGetGa() {
        System.out.println("getGa");
        Controlador instance = new Controlador();
        GrupoAlimentos expResult = null;
        GrupoAlimentos result = instance.getGa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGa method, of class Controlador.
     */
    @Test
    public void testSetGa() {
        System.out.println("setGa");
        GrupoAlimentos ga = null;
        Controlador instance = new Controlador();
        instance.setGa(ga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistro method, of class Controlador.
     */
    @Test
    public void testGetRegistro() {
        System.out.println("getRegistro");
        Controlador instance = new Controlador();
        Registro expResult = null;
        Registro result = instance.getRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistro method, of class Controlador.
     */
    @Test
    public void testSetRegistro() {
        System.out.println("setRegistro");
        Registro registro = null;
        Controlador instance = new Controlador();
        instance.setRegistro(registro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
