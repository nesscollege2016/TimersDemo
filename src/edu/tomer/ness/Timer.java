package edu.tomer.ness;

import java.util.TimerTask;

/**
 * Created by Dev on 07/04/2016.
 */
public class Timer extends java.util.Timer {

    public void scheduleAtFixedRate(TimerTask task,
                                    long delay,
                                    long period,
                                    int numOfTimes) {
        StoppingTimerTask t = new StoppingTimerTask(numOfTimes, this, task);
        scheduleAtFixedRate(t, delay, period);

    }
}
