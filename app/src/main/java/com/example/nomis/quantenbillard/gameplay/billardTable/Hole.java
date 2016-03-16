package com.example.nomis.quantenbillard.gameplay.billardTable;

import com.example.nomis.quantenbillard.gameplay.BillardBowl;
import com.example.nomis.quantenbillard.gameplay.BillardObject;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Position;

import java.util.List;

/**
 * Created by nomis on 15.03.2016.
 */
public class Hole extends BillardObject {
    int radius;
    Position centerPosition;
    List<BillardBowl> bowls;

    public Hole (int radius, Position centerPosition, List<BillardBowl> bowls){
        this.radius = radius;
        this.centerPosition = centerPosition;
        this.bowls = bowls;
    }

    @Override
    public Position getPosition() {
        return centerPosition;
    }
}
