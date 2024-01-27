/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskautomation.rule;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import taskautomation.azioni.Action;
import taskautomation.trigger.Trigger;

/**
 *
 * @author Alejandro
 */
public class RuleWithSleep extends Rule implements Serializable{
    private boolean alreadyFired; 
    private TemporalAmount sleepingPeriod;
    private LocalTime lastFired;

    public RuleWithSleep(String name, Trigger trigger, Action action, boolean active, TemporalAmount sleepingPeriod) {
        super(name, trigger, action, active);
        this.alreadyFired = false;
        this.sleepingPeriod = sleepingPeriod;
        this.lastFired = null;
    }

    public boolean isAlreadyFired() {
        return alreadyFired;
    }

    public void setAlreadyFired(boolean alreadyFired) {
        this.alreadyFired = alreadyFired;
    }

    public TemporalAmount getSleepingPeriod() {
        return sleepingPeriod;
    }

    public void setSleepingPeriod(TemporalAmount sleepingPeriod) {
        this.sleepingPeriod = sleepingPeriod;
    }

    public LocalTime getLastFired() {
        return lastFired;
    }

    public void setLastFired(LocalTime lastFired) {
        this.lastFired = lastFired;
    }
    
    @Override
    public void checkRule() {
        if (this.isActive()) {
            if (alreadyFired) {
                if ((LocalTime.now().isAfter(this.getLastFired().plus(sleepingPeriod)) && this.verifyTrigger())) {
                    this.executeAction();
                    this.lastFired = LocalTime.now();
                }
            } else {
                if (this.verifyTrigger()) {
                    this.executeAction();
                    this.setLastFired( LocalTime.now());
                    this.setAlreadyFired(true);
                }
            }
        }
    }
    
    
}
