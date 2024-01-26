/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.azioni.actionFactory;

import taskautomation.azioni.Action;
import taskautomation.azioni.AddValueToCounterDecorator;

/**
 *
 * @author Alejandro
 */
public class AddValueToCounterFactory implements ActionFactory{

    @Override
    public Action create(Action action) {
        return new AddValueToCounterDecorator(action);
    }
    
}
