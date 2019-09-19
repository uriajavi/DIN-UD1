/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class is a JavaFX implementation for the HelloWorldWithTiers exercise.
 * It implements helloworldwithtiers.view.View interface and is a 
 * javafx.application.Application extension.
 * @author javi
 */
public class JavaFXViewImplementation extends Application implements View {
    /**
     * Private static member to store the greeting passed from the model to be
     * shown. It is static because calling to static launch() method creates a 
     * new thread for the JavaFX application and non static member state would
     * not be maintained.
     */
    private String greeting;
    /**
     * Start method called after JavaFX application initialization.
     * @param stage The Stage object for the primary window.
     */
    @Override
    public void start(Stage stage) {
        try{
            //Load node graph from fxml file
            FXMLLoader loader=new FXMLLoader(
                    getClass().getResource("FXMLDocument.fxml"));
            Parent root = (Parent)loader.load();
            //Get controller for graph 
            FXMLDocumentController viewController=
                    ((FXMLDocumentController)loader.getController());
            //Set greeting to be used in JavaFX view controller
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Get a greeting and launches a JavaFX application to show that greeting.
     * @param greeting A String containing the greeting to be shown. 
     */
    @Override
    public void showGreeting(String greeting) {
        //JavaFXViewImplementation.greeting=greeting;
        launch(greeting);
    }
    /**
     * Initialization method for JavaFX app. Stores greeting.  
     */
    @Override
    public void init() throws Exception{
        this.greeting=getParameters().getRaw().get(0);
    }
    /**
     * Greeting setter.
     */
    public void setGreeting(String greeting){
        this.greeting=greeting;
    }
}
