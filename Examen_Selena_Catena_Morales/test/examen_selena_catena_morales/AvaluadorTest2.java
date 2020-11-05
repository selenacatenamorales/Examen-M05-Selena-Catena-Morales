/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_selena_catena_morales;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author selena_3
 */
@RunWith(Parameterized.class)
public class AvaluadorTest2 {
    
    private Avaluador instance;
    
    public AvaluadorTest2() {
       
    }
    @Parameterized.Parameter(0)
    public Estudiant estudiant0;  //parametre 1

   
    @Parameterized.Parameter(1)
    public double mitjana;  //paraemtre 2
     @Parameterized.Parameters
public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            { new Estudiant("Selena", 5.0, 5.0, 5.0),5.0}, 
            { new Estudiant("Maribel", 10.0, 10.0, 10.0),10.0},
            {  new Estudiant("Ana", 2.0, 2.0, 2.0),0.0},
            {new Estudiant ("Ainoa", 1.0, 1.0, 1.0), 0.0},
            {new Estudiant ("Pepe", 0.0, 10.0, 2.0), 0.0},
            {new Estudiant ("Carlos", 0.0, 0.0, 0.0), 0.0},
            {new Estudiant ("Inma", 5.0, 5.0, 10.0), 6.666},
            {new Estudiant ("Merce", 10.0, 10.0, 10.0), 10.0},
            {new Estudiant ("Encarni", 1.0, 1.0, 1.0), 0.0},
            {new Estudiant ("Tere", 2.0, 2.0, 2.0), 0.0},
            {new Estudiant ("Andrea", 0.0, 0.0, 0.0), 0.0},
            {new Estudiant ("Tania", 1.5, 10.0, 5.0), 0.0},
            {new Estudiant ("Esther", 4.0, 4.0, 4.0), 0.0},
            {new Estudiant ("Pilar", 7.0, 7.0, 7.0), 7.0},
            {new Estudiant ("Lucia", 1.0, 9.0, 7.0), 0.0}
                
                           
        };
    return Arrays.asList(data);
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inciant test ....");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant test....");
    }
    
    @Before
    public void setUp() {
        instance= new Avaluador();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
 
    
    @Test
    public void testMitjanaSiSupera() throws Exception {
         Assert.assertEquals(mitjana, instance.mitjanaSiSupera(estudiant0), 0.001);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
  
    
}
