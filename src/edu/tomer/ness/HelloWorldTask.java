package edu.tomer.ness;

import java.util.TimerTask;

/**
 * Created by Dev on 07/04/2016.
 */
public class HelloWorldTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Ninja school");
        System.out.println("Hafsaka!");
    }
}
