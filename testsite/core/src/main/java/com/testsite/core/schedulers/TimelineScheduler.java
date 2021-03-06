package com.testsite.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.testsite.core.service.PhoneDirectoryInterface;
import com.testsite.core.service.SchedulerConfig;


@Component(immediate = true, service = Runnable.class)
@Designate(ocd = SchedulerConfig.class)
public class TimelineScheduler implements Runnable {

    // Logger
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    // Custom parameter that is to be read from the configuration
    private String customParameter;

    // Id of the scheduler based on its name
    private int schedulerId;

    // Scheduler instance injected
    @Reference
    private Scheduler scheduler;

    @Reference
    PhoneDirectoryInterface timelineservice;
    
    /**
     * Activate method to initialize stuff
     * 
     * @param schedulerConfiguration
     */
    @Activate
    protected void activate(SchedulerConfig schedulerConfiguration) {
        schedulerId = schedulerConfiguration.name().hashCode();
        customParameter = schedulerConfiguration.customParameter();
    }

    /**
     * Modifies the scheduler id on modification
     * 
     * @param schedulerConfiguration
     */
    @Modified
    protected void modified(SchedulerConfig schedulerConfiguration) {
        // Removing scheduler
        removeScheduler();
        // Updating the scheduler id
        schedulerId = schedulerConfiguration.name().hashCode();
        // Again adding the scheduler
        addScheduler(schedulerConfiguration);
    }

    /**
     * This method deactivates the scheduler and removes it
     * 
     * @param schedulerConfiguration
     */
    @Deactivate
    protected void deactivate(SchedulerConfig schedulerConfiguration) {
        // Removing the scheduler
        removeScheduler();
    }

    /**
     * This method removes the scheduler
     */
    private void removeScheduler() {
        log.info("Removing scheduler: {}", schedulerId);
        // Unscheduling/removing the scheduler
        scheduler.unschedule(String.valueOf(schedulerId));
    }

    /**
     * This method adds the scheduler
     * 
     * @param schedulerConfiguration
     */
    private void addScheduler(SchedulerConfig schedulerConfiguration) {
        // Check if the scheduler is enabled
        if (schedulerConfiguration.enabled()) {
            // Scheduler option takes the cron expression as a parameter and run accordingly
            ScheduleOptions scheduleOptions = scheduler.EXPR(schedulerConfiguration.cronExpression());

            // Adding some parameters
            scheduleOptions.name(schedulerConfiguration.name());
            scheduleOptions.canRunConcurrently(false);

            // Scheduling the job
            scheduler.schedule(this, scheduleOptions);
            log.info("Scheduler added");
        } else {
            log.info("Scheduler is disabled");
        }
    }

    /**
     * Overridden run method to execute Job
     */
    @Override
    public void run() {
        log.info("Custom Scheduler is now running using the passed custom paratmeter, customParameter {}",
                customParameter);
        
        timelineservice.getPhoneDetails();

    }
}