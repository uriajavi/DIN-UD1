/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * ModelImplementation JUnit test class.
 * @author javi
 */
public class ModelImplementationTest {
    
    private Model model;
    
    @Before
    public void setUp() {
        model=new ModelImplementation();
    }
    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        String greeting= model.getGreeting();
        assertNotNull("Greeting returned by model is null!!!", greeting);
        assertNotEquals("Greeting lentgh is invalid!!!",0,greeting.length());
    }
    
}
