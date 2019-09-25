/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.controller;

import helloworldwithtiers.model.Model;
import helloworldwithtiers.view.View;
import java.util.logging.Logger;

/**
 * Controller class for Hello World application with tiers.
 * @author javi
 */
public class Controller {
    private static final Logger LOGGER
            =Logger.getLogger("helloworldwithtiers.controller.Controller");
    /**
     * This method executes the application's logic. Namely, it orders the view 
     * to show a greeting got from the model.
     * @param view the view object
     * @param model the model object
     */
    public void run(View view, Model model) {
        try{
            LOGGER.info("Starting run method.");
            view.showGreeting(model.getGreeting());
            LOGGER.info("Ending run method.");
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
    
}
