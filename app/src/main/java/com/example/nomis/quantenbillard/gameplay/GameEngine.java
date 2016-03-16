package com.example.nomis.quantenbillard.gameplay;

import com.example.nomis.quantenbillard.gameplay.billardTable.BillardTable;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Clock;
import com.example.nomis.quantenbillard.gameplay.helperClasses.billardevents.BillardEvent;

/**
 * Created by nomis on 15.03.2016.
 */
public class GameEngine {
    private Clock clock;
    private BillardTable table;

    public GameEngine (Clock clock, BillardTable table){
        this.clock = clock;
        this.table = table;
    }

    public void runGame(){
        boolean abort = false;
        double intervalStart = System.currentTimeMillis();
        while (!abort){
            if(intervalIsOver(intervalStart)){
                intervalStart = System.currentTimeMillis();
                clock.countOneUp();
                if (table.isBillardEvent(clock.getTime())){
                    BillardEvent[] billardEvents = table.getBillardEvents(clock.getTime());
                    for (BillardEvent event : billardEvents) {

                    }
                }
            }
        }
    }

    private boolean intervalIsOver(double intervalStart) {
        return System.currentTimeMillis()-intervalStart >= Clock.TIME_UNIT_SIZE;
    }
}
