/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
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
        instance.getR().setNombre("nom1");
        String expResult = "nom1";
        String result = instance.getR().getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of inNomInstReceta method, of class Controlador.
     */
    @Test
    public void testInNomInstReceta() {
        System.out.println("inNomInstReceta");
        String nom = "nom1";
        String inst = "inst1";
        Receta r = new Receta();
        Controlador instance = new Controlador();
        instance.crearReceta();
        instance.getR().setNombre(nom);
        instance.getR().setInstrucciones(inst);
        instance.inNomInstReceta(nom, inst);
        boolean expResult = true;
        boolean result = instance.getR().getNombre() == nom && instance.getR().getInstrucciones() == inst;
        assertEquals(expResult, result);
    }

    /**
     * Test of añadirAlimentoReceta method, of class Controlador.
     */
    @Test
    public void testAñadirAlimentoReceta() {
        System.out.println("añadirAlimentoReceta");
        String nomAlimento = "Ajo";
        String uMedida = "u1";
        float cantidad = 3.0F;
        Controlador instance = new Controlador();
        instance.crearReceta();
        boolean expResult = true;
        boolean result = instance.añadirAlimentoReceta(nomAlimento, uMedida, cantidad);
        assertEquals(expResult, result);
    }

    /**
     * Test of confirmarReceta method, of class Controlador.
     */
    @Test
    public void testConfirmarReceta() {
        System.out.println("confirmarReceta");
        Controlador instance = new Controlador();
        instance.crearReceta();
        instance.getR().setNombre("nom1");
        boolean expResult = true;
        boolean result = instance.confirmarReceta();
        assertEquals(expResult, result);
    }

    /**
     * Test of inNomReceta method, of class Controlador.
     */
    @Test
    public void testInNomReceta() {
        System.out.println("inNomReceta");
        String nom = "nom1";
        Receta r = new Receta();
        r.setNombre(nom);
        r.setInstrucciones("inst1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        r.nuevaLr(a, "u1", 3);
        Controlador instance = new Controlador();
        instance.setR(r);
        String expResult = r.toString();
        String result = instance.inNomReceta(nom);
        assertEquals(expResult, result);
    }

    /**
     * Test of añadirGrupoAlimentos method, of class Controlador.
     */
    @Test
    public void testAñadirGrupoAlimentos() {
        System.out.println("añadirGrupoAlimentos");
        Controlador instance = new Controlador();
        instance.añadirGrupoAlimentos();
        GrupoAlimentos ga = instance.getGa();
        ga.setNombre("nom1");
        ga.setDescripcion("desc1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        ga.añadirAlimento(a);
        String expResult = "nom1";
        String result = instance.getGa().getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of inNomDescGA method, of class Controlador.
     */
    @Test
    public void testInNomDescGA() {
        System.out.println("inNomDescGA");
        String nom = "nom1";
        String desc = "desc1";
        Controlador instance = new Controlador();
        instance.inNomDescGA(nom, desc);
        boolean expResult = true;
        boolean result = instance.getGa().getNombre() == nom && instance.getGa().getDescripcion() == desc;
        assertEquals(expResult, result);
    }

    /**
     * Test of añadirAlimento method, of class Controlador.
     */
    @Test
    public void testAñadirAlimento() {
        System.out.println("añadirAlimento");
        String nomAlimento = "Ajo";
        Controlador instance = new Controlador();
        boolean expResult = true;
        boolean result = instance.añadirAlimento(nomAlimento);
        assertEquals(expResult, result);
    }

    /**
     * Test of confirmarGrupo method, of class Controlador.
     */
    @Test
    public void testConfirmarGrupo() {
        System.out.println("confirmarGrupo");
        Controlador instance = new Controlador();
        instance.añadirGrupoAlimentos();
        instance.getGa().setNombre("nom1");
        instance.getGa().setDescripcion("desc1");
        boolean expResult = true;
        boolean result = instance.confirmarGrupo();
        assertEquals(expResult, result);
    }

    /**
     * Test of inNomGA method, of class Controlador.
     */
    @Test
    public void testInNomGA() {
        System.out.println("inNomGA");
        String nom = "nom1";
        Controlador instance = new Controlador();
        instance.añadirGrupoAlimentos();
        instance.inNomDescGA(nom, "desc1");
        instance.añadirAlimento("Ajo");
        instance.confirmarGrupo();
        GrupoAlimentos ga = instance.getGa();
        instance.añadirGrupoAlimentos();
        String expResult = ga.toString();
        String result = instance.inNomGA(nom);
        assertEquals(expResult, result);
    }

    /**
     * Test of confirmarBorradoGA method, of class Controlador.
     */
    @Test
    public void testConfirmarBorradoGA() {
        System.out.println("confirmarBorradoGA");
        Controlador instance = new Controlador();
        instance.añadirGrupoAlimentos();
        instance.inNomDescGA("nom1", "desc1");
        instance.añadirAlimento("Ajo");
        instance.confirmarGrupo();
        instance.confirmarBorradoGA();
        GrupoAlimentos expResult = null;
        GrupoAlimentos result = instance.getRegistro().getGrupoAlimentos("nom1");
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarAlimentoGA method, of class Controlador.
     */
    @Test
    public void testEliminarAlimentoGA() {
        System.out.println("eliminarAlimentoGA");
        String nomAlimento = "Ajo";
        Controlador instance = new Controlador();
        instance.añadirGrupoAlimentos();
        instance.inNomDescGA("nom1", "desc1");
        instance.añadirAlimento(nomAlimento);
        instance.confirmarGrupo();
        Alimento a = instance.getRegistro().getAlimento(nomAlimento);
        String expResult = a.toString();
        String result = instance.eliminarAlimentoGA(nomAlimento);
        assertEquals(expResult, result);
    }

    /**
     * Test of confirmarBorradoA method, of class Controlador.
     */
    @Test
    public void testConfirmarBorradoA() {
        System.out.println("confirmarBorradoA");
        Controlador instance = new Controlador();
        String nomAlimento = "Ajo";
        instance.añadirGrupoAlimentos();
        instance.inNomDescGA("nom1", "desc1");
        instance.añadirAlimento(nomAlimento);
        instance.confirmarGrupo();
        instance.eliminarAlimentoGA(nomAlimento);
        instance.confirmarBorradoA();
        Alimento expResult = null;
        Alimento result = instance.getGa().getAlimento(nomAlimento);
        assertEquals(expResult, result);
    }

    /**
     * Test of inFechas method, of class Controlador.
     */
    @Test
    public void testInFechas() {
        System.out.println("inFechas");
        GregorianCalendar inicio = new GregorianCalendar(10, 15, 2019);
        GregorianCalendar fin = new GregorianCalendar(10, 11, 2022);
        Controlador instance = new Controlador();
        SortedSet<comidaDiaria> cds = new TreeSet();
        comidaDiaria cd = new comidaDiaria();
        cds.add(cd);
        instance.setCd(cd);
        instance.confirmarComida();
        String s = "";
        Iterator it = cds.iterator();
        while(it.hasNext()){
            s += it.next().toString() + "\n"; 
        }
        String expResult = s;
        String result = instance.inFechas(inicio, fin);
        assertEquals(expResult, result);
    }

    /**
     * Test of registroComida method, of class Controlador.
     */
    @Test
    public void testRegistroComida() {
        System.out.println("registroComida");
        String nom = "nom1";
        Controlador instance = new Controlador();
        instance.registroComida();
        instance.inNomComida(nom);
        String expResult = nom;
        String result = instance.getCd().getNombre();
        assertEquals(expResult, result);  
    }

    /**
     * Test of inNomComida method, of class Controlador.
     */
    @Test
    public void testInNomComida() {
        System.out.println("inNomComida");
        String nom = "nom1";
        Controlador instance = new Controlador();
        instance.registroComida();
        instance.inNomComida(nom);
        String expResult = nom;
        String result = instance.getCd().getNombre();
        assertEquals(expResult, result); 
    }

    /**
     * Test of añadirReceta method, of class Controlador.
     */
    @Test
    public void testAñadirReceta() {
        System.out.println("añadirReceta");
        String nomReceta = "";
        Controlador instance = new Controlador();
        instance.crearReceta();
        boolean expResult = true;
        boolean result = instance.añadirReceta(nomReceta);
        assertEquals(expResult, result);
    }

    /**
     * Test of confirmarComida method, of class Controlador.
     */
    @Test
    public void testConfirmarComida() {
        System.out.println("confirmarComida");
        Controlador instance = new Controlador();
        instance.registroComida();
        boolean expResult = true;
        boolean result = instance.confirmarComida();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCds method, of class Controlador.
     */
    @Test
    public void testGetCds() {
        System.out.println("getCds");
        Controlador instance = new Controlador();
        SortedSet cds = new TreeSet();
        instance.setCds(cds);
        SortedSet<comidaDiaria> expResult = cds;
        SortedSet<comidaDiaria> result = instance.getCds();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCds method, of class Controlador.
     */
    @Test
    public void testSetCds() {
        System.out.println("setCds");
        Controlador instance = new Controlador();
        SortedSet cds = new TreeSet();
        instance.setCds(cds);
        SortedSet<comidaDiaria> expResult = cds;
        SortedSet<comidaDiaria> result = instance.getCds();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCd method, of class Controlador.
     */
    @Test
    public void testGetCd() {
        System.out.println("getCd");
        Controlador instance = new Controlador();
        comidaDiaria cd = new comidaDiaria();
        instance.setCd(cd);
        comidaDiaria expResult = cd;
        comidaDiaria result = instance.getCd();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCd method, of class Controlador.
     */
    @Test
    public void testSetCd() {
        System.out.println("setCd");
        Controlador instance = new Controlador();
        comidaDiaria cd = new comidaDiaria();
        instance.setCd(cd);
        comidaDiaria expResult = cd;
        comidaDiaria result = instance.getCd();
        assertEquals(expResult, result);
    }

    /**
     * Test of getR method, of class Controlador.
     */
    @Test
    public void testGetR() {
        System.out.println("getR");
        Controlador instance = new Controlador();
        Receta r = new Receta();
        instance.setR(r);
        Receta expResult = r;
        Receta result = instance.getR();
        assertEquals(expResult, result);
    }

    /**
     * Test of setR method, of class Controlador.
     */
    @Test
    public void testSetR() {
        System.out.println("setR");
        Controlador instance = new Controlador();
        Receta r = new Receta();
        instance.setR(r);
        Receta expResult = r;
        Receta result = instance.getR();
        assertEquals(expResult, result);
    }

    /**
     * Test of getA method, of class Controlador.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        Controlador instance = new Controlador();
        Alimento a = new Alimento("nom1","desc1","tempC1");
        instance.setA(a);
        Alimento expResult = a;
        Alimento result = instance.getA();
        assertEquals(expResult, result);
    }

    /**
     * Test of setA method, of class Controlador.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        Controlador instance = new Controlador();
        Alimento a = new Alimento("nom1","desc1","tempC1");
        instance.setA(a);
        Alimento expResult = a;
        Alimento result = instance.getA();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGa method, of class Controlador.
     */
    @Test
    public void testGetGa() {
        System.out.println("getGa");
        Controlador instance = new Controlador();
        GrupoAlimentos ga = new GrupoAlimentos();
        instance.setGa(ga);
        GrupoAlimentos expResult = ga;
        GrupoAlimentos result = instance.getGa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGa method, of class Controlador.
     */
    @Test
    public void testSetGa() {
        System.out.println("setGa");
        Controlador instance = new Controlador();
        GrupoAlimentos ga = new GrupoAlimentos();
        instance.setGa(ga);
        GrupoAlimentos expResult = ga;
        GrupoAlimentos result = instance.getGa();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistro method, of class Controlador.
     */
    @Test
    public void testGetRegistro() {
        System.out.println("getRegistro");
        Controlador instance = new Controlador();
        Registro rg = new Registro();
        instance.setRegistro(rg);
        Registro expResult = rg;
        Registro result = instance.getRegistro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRegistro method, of class Controlador.
     */
    @Test
    public void testSetRegistro() {
        System.out.println("setRegistro");
        Controlador instance = new Controlador();
        Registro rg = new Registro();
        instance.setRegistro(rg);
        Registro expResult = rg;
        Registro result = instance.getRegistro();
        assertEquals(expResult, result);
    }
    
}
