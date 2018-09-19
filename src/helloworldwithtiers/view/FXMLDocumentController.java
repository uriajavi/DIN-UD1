/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Controller class for JavaFX view implementation of hello world with tiers 
 * exercise. It contains the event handler for the ActionEvent on the view's button. 
 * @author javi
 */
public class FXMLDocumentController {
    /**
     * Reference to Label control of the UI.
     */
    @FXML
    private Label label;
    /**
     * String object containing the greeting to be shown when button is clicked.
     */
    private String greeting;
    /**
     * Setter for greeting attribute.
     * @param greeting 
     */
    public void setGreeting(String greeting){
        this.greeting=greeting;
    }
    /**
     * Action event handler for the button in the UI. It shows the greeting using
     * the label control.
     * @param event 
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText(greeting);
    }
}
