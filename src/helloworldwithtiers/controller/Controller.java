/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.controller;

import helloworldwithtiers.model.Model;
import helloworldwithtiers.view.View;

/**
 * Controller class for Hello World application with tiers.
 * @author javi
 */
public class Controller {
    /**
     * This method executes the application's logic. Namely, it orders the view 
     * to show a greeting got from the model.
     * @param view the view object
     * @param model the model object
     */
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
    
}
