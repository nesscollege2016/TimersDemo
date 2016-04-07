package edu.tomer.ness;

import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Dev on 07/04/2016.
 */
public class MyTimerTask extends TimerTask {
    private String[] names = {"Dani", "Evgeny", "Amos", "Tal", "Erez", "Tal", "Anni", "Lior", "David", "Orel"};
    private int[] counter = new int[names.length];
    private Random rand = new Random();
    private int times = 0;

    private Timer timer;

    //Constructor
    public MyTimerTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        int r = rand.nextInt(names.length);
        counter[r]+=1;
        System.out.println(names[r]);
        if (times % 100 == 0 && times > 0){
           printResults();
           System.out.println("\n\n=================\n\n");
        }
        times++;
    }


    private void printResults() {
        int i = 0;
        for (String name : names) {
            System.out.println(name + ": " + counter[i++]);
        }
        System.out.println(sumArr(counter));
    }



    private int sumArr(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
