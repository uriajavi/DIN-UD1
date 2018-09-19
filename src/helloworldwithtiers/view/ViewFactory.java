/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

/**
 * View factory that provides a method to get a View implementation.
 * @author javi
 */
public class ViewFactory {
    /**
     * Get a View implementation
     * @return the View implementation
     */
    public static View getView(){
        //Uncomment to show text ui implementation
        //return new ViewImplementation();
        return new JavaFXViewImplementation();
    }
    
}
