/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.action;

import java.io.File;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import taskautomation.azioni.BasicAction;
import taskautomation.azioni.PlayAudioDecorator;

/**
 *
 * @author Alejandro
 */
public class PlayAudioDecoratorIT {
    private PlayAudioDecorator instance;
    private String pathFile;
    
    @Before
    public void setUp() {
        pathFile = "C:\\Users\\Alejandro\\Documents\\NetBeansProjects\\task_automation\\TaskAutomation1\\tests\\taskautomation\\action\\TestFiles\\file_example_WAV.wav";
        File provaFile = new File(pathFile);
        instance = new PlayAudioDecorator(provaFile ,new BasicAction());
    }
    
    @Test
    public void testExecuteAction(){
        System.out.println("executeAction");
        instance.executeAction();
    }
    
    @Test
    public void testToString() {
        String expResult = "Play Audio: " + pathFile + "\n";
        assertEquals(expResult, instance.toString());
    }
    
    

}
