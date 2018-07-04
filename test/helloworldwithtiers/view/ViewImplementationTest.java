/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ViewImplementation JUnit test class.
 * @author javi
 */
public class ViewImplementationTest {
    /**
     * Attributes for changing testable System.out stream.
     */
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    /**
     * Object to test.
     */
    private View view;
    
    @Before
    public void setUp() {
        //Replace System.out stream
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
        view=new ViewImplementation();
    }
    
    @After
    public void tearDown() {
        //Restore System.out stream
        System.setOut(systemOut);
    }

    /**
     * Test of showGreeting method, of class ViewImplementation.
     */
    @Test
    public void testShowGreeting() {
        String greeting="Hello";
        view.showGreeting(greeting);
        //Note that println(), used inside showGreeting,
        //adds a new line control character at the end of the string
        assertEquals("Shown greeting is not correct!!!",
                       greeting+"\n",testOut.toString());
    }
    
}
