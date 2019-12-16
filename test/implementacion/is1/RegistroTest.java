/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.GregorianCalendar;
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
public class RegistroTest {
    
    public RegistroTest() {
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
     * Test of nuevoGrupoAlimento method, of class Registro.
     */
    @Test
    public void testNuevoGrupoAlimento() {
        System.out.println("nuevoGrupoAlimento");
        GrupoAlimentos ga = new GrupoAlimentos();
        ga.setNombre("nom1");
        ga.setDescripcion("desc1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        ga.añadirAlimento(a);
        Registro instance = new Registro();
        boolean expResult = true;
        boolean result = instance.nuevoGrupoAlimento(ga);
        assertEquals(expResult, result);
    }

    /**
     * Test of borrarGrupoAlimento method, of class Registro.
     */
    @Test
    public void testBorrarGrupoAlimento() {
        System.out.println("borrarGrupoAlimento");
        GrupoAlimentos ga = new GrupoAlimentos();
        ga.setNombre("nom1");
        ga.setDescripcion("desc1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        ga.añadirAlimento(a);
        Registro instance = new Registro();
        boolean expResult = true;
        boolean result = instance.borrarGrupoAlimento(ga);
        assertEquals(expResult, result);
    }

    /**
     * Test of getGrupoAlimentos method, of class Registro.
     */
    @Test
    public void testGetGrupoAlimentos() {
        System.out.println("getGrupoAlimentos");
        String nom = "nom1";
        GrupoAlimentos ga = new GrupoAlimentos();
        ga.setNombre(nom);
        ga.setDescripcion("desc1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        ga.añadirAlimento(a);
        Registro instance = new Registro();
        instance.nuevoGrupoAlimento(ga);
        GrupoAlimentos expResult = ga;
        GrupoAlimentos result = instance.getGrupoAlimentos(nom);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlimento method, of class Registro.
     */
    @Test
    public void testGetAlimento() {
        System.out.println("getAlimento");
        String nom = "Ajo";
        Registro instance = new Registro();
        Alimento expResult = new Alimento("Ajo","Pese a su “mala fama” por ser un ingrediente fuerte y que nos deja un aliento peculiar, el ajo tiene un gran valor a nivel nutritivo "
                           + "y además estamos ante un alimento que tiene muy pocas calorías, todo esto unido a que tiene mucha vitamina C, vitamina B6 y manganeso.", "Todo el año");
        Alimento result = instance.getAlimento(nom);
        assertEquals(expResult, result);
    }

    /**
     * Test of nuevaReceta method, of class Registro.
     */
    @Test
    public void testNuevaReceta() {
        System.out.println("nuevaReceta");
        Receta r = new Receta();
        r.setNombre("nom1");
        r.setInstrucciones("inst1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        r.nuevaLr(a, "u1", 3);
        Registro instance = new Registro();
        boolean expResult = true;
        boolean result = instance.nuevaReceta(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of getReceta method, of class Registro.
     */
    @Test
    public void testGetReceta() {
        System.out.println("getReceta");
        String nomReceta = "nom1";
        Receta r = new Receta();
        r.setNombre(nomReceta);
        r.setInstrucciones("inst1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        r.nuevaLr(a, "u1", 3);
        Registro instance = new Registro();
        instance.nuevaReceta(r);
        Receta expResult = r;
        Receta result = instance.getReceta(nomReceta);
        assertEquals(expResult, result);
    }

    /**
     * Test of añadirComida method, of class Registro.
     */
    @Test
    public void testAñadirComida() {
        System.out.println("añadirComida");
        comidaDiaria cd = new comidaDiaria();
        cd.setNombre("nom1");
        cd.setFecha();
        Receta r = new Receta();
        r.setNombre("nom1");
        r.setInstrucciones("inst1");
        Alimento a = new Alimento("nom1", "desc1", "tempC1");
        r.nuevaLr(a, "u1", 3);
        cd.añadirReceta(r);
        Registro instance = new Registro();
        boolean expResult = true;
        boolean result = instance.añadirComida(cd);
        assertEquals(expResult, result);
    }

    /**
     * Test of getComidas method, of class Registro.
     */
    @Test
    public void testGetComidas() {
        System.out.println("getComidas");
        GregorianCalendar inicio = new GregorianCalendar(10, 15, 2019);
        GregorianCalendar fin = new GregorianCalendar(10, 11, 2022);
        SortedSet<comidaDiaria> cds = new TreeSet();
        comidaDiaria cd = new comidaDiaria();
        cd.setFecha();
        cds.add(cd);
        Registro instance = new Registro();
        instance.añadirComida(cd);
        SortedSet<comidaDiaria> expResult = cds;
        SortedSet<comidaDiaria> result = instance.getComidas(inicio, fin);
        assertEquals(expResult, result);
    }
    
}
