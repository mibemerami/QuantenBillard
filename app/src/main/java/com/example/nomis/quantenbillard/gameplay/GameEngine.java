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
    private double intervalStart;

    public GameEngine (Clock clock, BillardTable table){
        this.clock = clock;
        this.table = table;
    }

    public void runGame(){
        boolean abort = false;
        intervalStart = System.currentTimeMillis();
        while (!abort){
            if(intervalIsOver()){
                startNewInterval();
                clock.countOneUp();
                if (table.isBillardEvent(clock.getTime())){
                    handleEvents();
                }
            }
        }
    }

        private void startNewInterval(){
            intervalStart = System.currentTimeMillis();
        }

        private void handleEvents() {
            BillardEvent[] billardEvents = table.getBillardEvents(clock.getTime());
            for (BillardEvent event : billardEvents) {
                event.onEvent();
            }
        }

        private boolean intervalIsOver() {
            return System.currentTimeMillis()-intervalStart >= Clock.TIME_UNIT_SIZE;
        }
}
