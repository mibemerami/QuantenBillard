package com.example.nomis.quantenbillard.gameplay.billardTable;

import com.example.nomis.quantenbillard.gameplay.BillardBowl;
import com.example.nomis.quantenbillard.gameplay.BillardObject;
import com.example.nomis.quantenbillard.gameplay.Queue;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Position;
import com.example.nomis.quantenbillard.gameplay.helperClasses.billardevents.BillardEvent;

import java.util.List;

/**
 * Created by nomis on 13.03.2016.
 */
public class BillardTable extends BillardObject {
    private Position position; //Position of the top, left. Should usualy be (0,0)
    Cushion[] cushions;
    Hole[] holes;
    List<BillardBowl> bowls;
    Queue queue;

    public BillardTable () {

    }

    public boolean isBillardEvent(int time){
        return false;
    }

    public BillardEvent[] getBillardEvents(int time){
        return new BillardEvent[2]; //dummy
    }

    @Override
    public Position getPosition() {
        return position;
    }
}
