package edu.tomer.ness;


import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
       Timer timer = new Timer();
       HelloWorldTask task = new HelloWorldTask();
       timer.scheduleAtFixedRate(task, 0, 2, 20);


    }
}
