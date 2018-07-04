/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Application Integration test class. It's nearly the same as the ControllerIT so
 * it would be enough with that test class.
 * @author javi
 */
public class ApplicationIT {
    /**
     * Attributes for changing testable System.out stream.
     */
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUp() {
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
     * Test of main method, of class Application.
     */
    @Test
    public void testMain() {
        String greeting="Hello World!! This is an application with tiers, factories and interfaces!!";
        Application.main(new String[0]);
        assertEquals("Shown greeting is not correct!!!",
                    greeting+"\n",testOut.toString());
        
    }
    
}
