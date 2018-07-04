/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.controller;

import helloworldwithtiers.model.ModelFactory;
import helloworldwithtiers.view.ViewFactory;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Controller integration test class.
 * @author javi
 */
public class ControllerIT {
    /**
     * Attributes for changing testable System.out stream.
     */
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    
    private Controller controller;

    @Before
    public void setUp() {
        controller=new Controller();
        //Replace System.out stream
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    
    @After
    public void tearDown() {
        //Restore System.out stream
        System.setOut(systemOut);
    }
    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        String greeting=ModelFactory.getModel().getGreeting();
        ViewFactory.getView().showGreeting(greeting);
        assertEquals("Shown greeting is not correct!!!",
                    greeting+"\n",testOut.toString());
    }
    
}
