/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Acer
 */
public class SingletonJoystick{
    private static Joystick UnicoJoystick;
    
    private SingletonJoystick () {
        
    }

    
    public static synchronized Joystick getInstancia ( ) {
        if (UnicoJoystick == null)
            UnicoJoystick = Joystick.getInstancia();        
        return (UnicoJoystick);
    }
    
}
