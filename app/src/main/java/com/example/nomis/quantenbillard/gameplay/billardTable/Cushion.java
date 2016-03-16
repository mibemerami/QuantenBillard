package com.example.nomis.quantenbillard.gameplay.billardTable;

import com.example.nomis.quantenbillard.gameplay.BillardBowl;
import com.example.nomis.quantenbillard.gameplay.BillardObject;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Position;

/**
 * Created by nomis on 15.03.2016.
 */
public class Cushion extends BillardObject{
    private int length;
    private Position position; //position of the top left

    public Cushion(Position position, int length){
        this.position = position;
        this.length = length;
    }

    public void collision(BillardBowl bowl){

    }

    @Override
    public Position getPosition() {
        return position;
    }
}
