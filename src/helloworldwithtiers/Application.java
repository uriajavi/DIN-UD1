/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers;

import helloworldwithtiers.controller.Controller;
import helloworldwithtiers.model.ModelFactory;
import helloworldwithtiers.view.ViewFactory;

/**
 * Hello world application class. This application is an example for illustrating
 * how to use interfaces, factories and unit test in a development.
 * @author javi
 */
public class Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Controller().run(ViewFactory.getView(),ModelFactory.getModel());
    }
    
}
