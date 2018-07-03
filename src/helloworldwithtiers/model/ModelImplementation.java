/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

/**
 * A Model implementation.
 * @author javi
 */
public class ModelImplementation implements Model{
    /**
     * Get a greeting.
     * @return a String representing the greeting
     */

    @Override
    public String getGreeting() {
        return "Hello World!! This is an application with tiers, factories and interfaces!!";
    }
    
}
