/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.rule;

import java.io.Serializable;
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

    public boolean isAlreadyFired() {
        return alreadyFired;
    }

    public void setAlreadyFired(boolean alreadyFired) {
        this.alreadyFired = alreadyFired;
    }

    @Override
    public void checkRule() {
        if (this.isActive() && !this.isAlreadyFired()) {
            if (this.verifyTrigger()) {
                this.executeAction();
                this.setAlreadyFired(true);
            }
        } 
    }
}
