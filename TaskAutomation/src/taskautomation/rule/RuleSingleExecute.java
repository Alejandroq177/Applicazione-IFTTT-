/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.rule;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import taskautomation.trigger.Trigger;
import taskautomation.azioni.Action;

/**
 *
 * @author alessandro
 */
public class RuleSingleExecute extends Rule implements Serializable{
    
    private boolean alreadyFired; 

    public RuleSingleExecute(String name, Trigger trigger, Action action, boolean active) {
        super(name, trigger, action, active);
        alreadyFired = false;
    }

    @Override
    public void checkRule() {
        if (this.isActive() && !alreadyFired) {
            if (this.verifyTrigger()) {
                this.executeAction();
                this.alreadyFired = true;
            }
        } 
    }
}
