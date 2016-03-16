package com.example.nomis.quantenbillard.gameplay.helperClasses.billardevents;

import com.example.nomis.quantenbillard.gameplay.BillardBowl;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Impulse;

/**
 * Created by nomis on 16.03.2016.
 */
public class CollisionOfTwoBolws extends BillardEvent {
    private BillardBowl bowl1;
    private BillardBowl bowl2;
    int time;

    public CollisionOfTwoBolws(BillardBowl bowl1, BillardBowl bowl2, int time){
        this.bowl1 = bowl1;
        this.bowl2 = bowl2;
        this.time = time;
    }


    @Override
    public void onEvent() {
        Impulse impulse1 = bowl1.getImpulse();
        Impulse impulse2 = bowl2.getImpulse();
        bowl1.collision(impulse2, time);
        bowl2.collision(impulse1, time);
    }
}
