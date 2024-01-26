/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.action;

/**
 *
 * @author Alejandro
 */


import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import taskautomation.azioni.BasicAction;
import taskautomation.azioni.DisplayMessageDecorator;


/**
 *
 * @author alessandro
 */
public class DisplayMessageDecoratorIT{
    
    private DisplayMessageDecorator instance;
    
    @Before
    public void setUp() {
        instance = new DisplayMessageDecorator("Ciao mondo!" ,new BasicAction());
    }


    @Test
    public void testGetMessage() {
        String expResult = "Ciao mondo!";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMessage() {
        String expResult = "Nuovo messaggio inserito";
        instance.setMessage("Nuovo messaggio inserito");
        assertEquals(expResult, instance.getMessage());
    }
    
    @Test
    public void testToString() {
        String expResult = "Display message: \"Test to String\"\n";
        instance.setMessage("Test to String");
        assertEquals(expResult, instance.toString());
    }
    
}