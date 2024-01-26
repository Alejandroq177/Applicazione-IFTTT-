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
public class Rule implements Serializable{
    
    private String name;
    private Trigger trigger;
    private Action action;
    private boolean active; 

    public Rule(String name, Trigger trigger, Action action, boolean active) {
        this.name = name;
        this.trigger = trigger;
        this.action = action;
        this.active = active;
    }
    
    public void addToRuleList(){
        if (!RuleList.getRuleList().addRule(this)){
            // L'aggiunta della regola non è riuscita
            throw new IllegalStateException("Impossibile aggiungere la regola alla lista.");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }
    
    public boolean verifyTrigger(){
        return trigger.verifyTrigger();
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
    
    public void executeAction(){
        action.executeAction();
    }

    public void checkRule() {
        if (this.isActive()) {
            if (this.verifyTrigger()) {
                this.executeAction();
            }
        }
    }
    
    public void toggleActive(){
        this.active = !this.active;
    }
    
    public String getActive() {
        if(this.isActive())
            return "Enable";
        else
            return "Disable";
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
     
}
