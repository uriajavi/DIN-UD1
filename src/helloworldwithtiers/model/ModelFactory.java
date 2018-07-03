/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

/**
 * Model factory that provides a method to get a model implementation.
 * @author javi
 */
public class ModelFactory {
    /**
     * Get a Model implementation
     * @return the Model implementation
     */
    public static Model getModel(){
        return new ModelImplementation();
    }
    
}
