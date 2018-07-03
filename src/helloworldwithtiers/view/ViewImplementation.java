/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

/**
 * A View implementation.
 * @author javi
 */
public class ViewImplementation implements View{
    /**
     * Show a greeting.
     * @param greeting A String containing the greeting.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
