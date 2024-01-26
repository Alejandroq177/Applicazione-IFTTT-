/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.azioni.actionFactory;

import taskautomation.azioni.Action;
import taskautomation.azioni.ExecuteProgramDecorator;

/**
 *
 * @author Alejandro
 */
public class ExecuteProgramFactory implements ActionFactory{

    @Override
    public Action create(Action action) {
        return new ExecuteProgramDecorator(action);
    }
    
}
