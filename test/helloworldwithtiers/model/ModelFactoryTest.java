/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Model Factory JUnit test class
 * @author javi
 */
public class ModelFactoryTest {
    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        assertNotNull("ModelFactory returns a null Model object!!!", 
                ModelFactory.getModel());
    }
    
}
