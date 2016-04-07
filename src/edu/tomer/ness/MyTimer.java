package edu.tomer.ness;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Dev on 07/04/2016.
 */
public class MyTimer extends Timer {

    public void scheduleAtFixedRate(TimerTask task, long delay, long period, int numberOfTimes) {

        TimerTask stoppingTask =
                new MyStoppingTimerTask(task, this, numberOfTimes);
        scheduleAtFixedRate(stoppingTask, delay, period);
    }
}
