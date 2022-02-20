/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joabp
 */
public class MatrizTest {
    
    public MatrizTest() {
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
     * Test of grupos method, of class Matriz.
     */
    @Test
    public void testGrupos() {
        System.out.println("grupos");
        Matriz instance = new Matriz();
        instance.grupos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of materias method, of class Matriz.
     */
    @Test
    public void testMaterias() {
        System.out.println("materias");
        Matriz instance = new Matriz();
        instance.materias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
