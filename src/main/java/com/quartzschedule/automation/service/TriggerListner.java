package com.quartzschedule.automation.service;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;
import org.springframework.stereotype.Component;

@Component
public class TriggerListner implements TriggerListener {
    @Override
    public String getName() {
        return "globalTrigger";
    }

    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("TriggerListner.triggerFired()");
    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        System.out.println("TriggerListner.vetoJobExecution()");
        return false;
    }

    @Override
    public void triggerMisfired(Trigger trigger) {
        System.out.println("TriggerListner.triggerMisfired()");
        String jobName = trigger.getJobKey().getName();
        System.out.println("Job name: " + jobName + " is misfired");

    }

    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context,
            Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println("TriggerListner.triggerComplete()");
        System.out.println(context);
        System.out.println(triggerInstructionCode);
        System.out.println("_____________________________________________________________________________________________________");
    }
}