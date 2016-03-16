package com.example.nomis.quantenbillard.gameplay.helperClasses;

/**
 * Created by nomis on 12.03.2016.
 */
public class Impulse {
    private int x;
    private int y;
    private int startTime;

    public Impulse(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getStartTime() {
        return startTime;
    }

    public void addNewImpulse(Impulse newImpulse) {
        x += newImpulse.getX();
        y += newImpulse.getY();
    }
}
