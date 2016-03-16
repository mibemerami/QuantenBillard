package com.example.nomis.quantenbillard.gameplay.helperClasses.billardevents;

import com.example.nomis.quantenbillard.gameplay.BillardObject;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Impulse;

/**
 * Created by nomis on 15.03.2016.
 */
public class Collision extends BillardEvent {
    BillardObject[] collidingObjects;
    int time;

    public Collision (BillardObject[] collidingObjects, int time){
        this.collidingObjects = collidingObjects;
        this.time = time;
    }

    @Override
    public void onEvent() {
    }
}
