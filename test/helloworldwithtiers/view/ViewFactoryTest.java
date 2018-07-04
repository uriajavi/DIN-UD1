/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ViewFactory JUnit test class.
 * @author javi
 */
public class ViewFactoryTest {
    /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetView() {
        assertNotNull("ViewFactory returns a null View object!!!", 
                ViewFactory.getView());
        
    }
    
}
