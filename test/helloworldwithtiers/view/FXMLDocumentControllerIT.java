/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import javafx.stage.Stage;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.base.NodeMatchers.isVisible;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

/**
 * TestFX class for Hello World With Tiers JavaFX view interaction.
 * @author jmarturi
 */
public class FXMLDocumentControllerIT extends ApplicationTest{
    private final String GREETING="Hola Mundo!!!";
    /**
     * Starts application to be tested.
     * @param stage Primary Stage object
     * @throws Exception If there is any error
     */
    @Override 
    public void start(Stage stage) throws Exception {
       JavaFXViewImplementation myapp=
               new JavaFXViewImplementation();
       myapp.setGreeting(GREETING);
       myapp.start(stage);
       
    }
    /**
     * Test test that user's manager view is opened when button Aceptar is 
     * clicked
    */ 
    @Test
    public void testLabelHasGreeting() {
        verifyThat("#label", hasText(GREETING));
    }

    @Test
    public void testButtonClick(){
        clickOn("#button");
        verifyThat("#label", hasText(GREETING+GREETING));
    }
}
