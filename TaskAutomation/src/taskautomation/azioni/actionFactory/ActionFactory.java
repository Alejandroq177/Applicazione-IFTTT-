/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.azioni.actionFactory;

import taskautomation.azioni.*;

/**
 * ActionFactory class for creating Action objects.
 * 
 * @author Alejandro
 */
public interface ActionFactory{

    Action create(Action action);
}