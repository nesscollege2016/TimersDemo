package edu.tomer.ness;

import java.util.TimerTask;

/**
 * Created by Dev on 07/04/2016.
 */
public class StoppingTimerTask extends TimerTask {
    private int numOfTimes;
    private Timer timer;
    private TimerTask task;

    public StoppingTimerTask(int numOfTimes, Timer timer, TimerTask task) {
        this.numOfTimes = numOfTimes;
        this.timer = timer;
        this.task = task;
    }

    int counter = 0;

    @Override
    public void run() {
        task.run();
        counter++;
        if (counter==numOfTimes){
            timer.cancel();
        }
    }
}
