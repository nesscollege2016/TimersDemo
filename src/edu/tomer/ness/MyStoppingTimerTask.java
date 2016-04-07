package edu.tomer.ness;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Dev on 07/04/2016.
 */
public class MyStoppingTimerTask extends TimerTask {
    private TimerTask task;
    private Timer timer;
    private int numberOfTimes;

    private int counter = 0;
    //Constructor
    public MyStoppingTimerTask(TimerTask task, Timer timer, int numberOfTimes) {
        this.task = task;
        this.timer = timer;
        this.numberOfTimes = numberOfTimes;
    }

    public void run() {
        task.run();
        counter++;
        if (counter == numberOfTimes)
            timer.cancel();
    }
}
