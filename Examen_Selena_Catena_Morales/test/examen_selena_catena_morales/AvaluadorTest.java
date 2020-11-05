/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_selena_catena_morales;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author selena_3
 */
public class AvaluadorTest {
    
    private Avaluador instance;
    
    public AvaluadorTest() {
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
        
    Assert.assertEquals(5.0,instance.mitjanaSiSupera(new Estudiant("Selena", 5.0, 5.0, 5.0)),0.001 );
    Assert.assertEquals(10.0,instance.mitjanaSiSupera(new Estudiant("Maribel", 10.0, 10.0, 10.0)),0.001 );
    Assert.assertEquals(0.0,instance.mitjanaSiSupera(new Estudiant("Ana", 3.0, 3.0, 3.0)),0.001 );
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    
    @Test
    public void testMitjana() throws Exception {
    Assert.assertEquals(5.0,instance.mitjana(new Estudiant("Selena", 5.0, 5.0, 5.0)),0.001 ); 
    Assert.assertEquals(10.0,instance.mitjana(new Estudiant("Maribel", 10.0, 10.0, 10.0)),0.001 );
    Assert.assertEquals(3.0,instance.mitjana(new Estudiant("Ana", 3.0, 3.0, 3.0)),0.001 );
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        
        Estudiant [] alumnes = new Estudiant[] {new Estudiant("Selena", 5.0, 6.0, 7.0), 
                                                new Estudiant("Maribel", 10.0, 10.0, 10.0),
                                                new Estudiant("Ana", 3.0, 3.0, 3.0)};
        
        Estudiant [] alumnes1 = new Estudiant[] {new Estudiant("Ainoa", 9.0, 9.0, 9.0), 
                                                new Estudiant("Maribel", 1.0, 1.0, 1.0),
                                                new Estudiant("Andrea",5.0, 5.0, 5.0)};
                
        Estudiant [] alumnes2 = new Estudiant[] {new Estudiant("Ainoa", 2.0, 2.0, 2.0), 
                                                new Estudiant("Maribel", 1.0, 1.0, 1.0),
                                                new Estudiant("Andrea",5.0, 5.0, 5.0)};
        
       Assert.assertEquals(alumnes[1],instance.millorEstudiantPerNotaMitjana(alumnes));
       Assert.assertEquals(alumnes1[0],instance.millorEstudiantPerNotaMitjana(alumnes1));
       Assert.assertEquals(alumnes2[2],instance.millorEstudiantPerNotaMitjana(alumnes2));
    
}
}
