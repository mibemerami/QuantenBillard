package com.example.nomis.quantenbillard.gameplay.helperClasses;

/**
 * Created by nomis on 12.03.2016.
 */
public class Clock {
    private int time;
    public final static double TIME_UNIT_SIZE = 30; // in milliseconds

    public Clock(){
        time = 0;
    }

    public void countOneUp(){
        time++;
    }

    public void resetTime(){
        time = 0;
    }

    public int getTime(){
        return time;
    }
}
