package com.example.nomis.quantenbillard.gameplay;

import com.example.nomis.quantenbillard.gameplay.helperClasses.Impulse;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Position;
import com.example.nomis.quantenbillard.gameplay.helperClasses.Psi;

/**
 * Created by nomis on 12.03.2016.
 */
public class BillardBowl extends BillardObject{
    private float a;
    private float masse;
    private Impulse impulse;
    private Position lastMeasuredPosition;

    public BillardBowl(float a, float masse, Position startPosition, Impulse startImpulse){
        this.a = a;
        this.masse = masse;
        this.lastMeasuredPosition = startPosition;
        this.impulse = startImpulse;
    }
    
    public Position getPosition(int time){
        Psi psi = getPsi(time);
        return getPositionFromSuperposition(psi);
    }

        private Position getPositionFromSuperposition(Psi psi) {
            return new Position(1,1); //dummy-object
        }

    public Psi getPsi(int time){
        return absTotalPsi((time - impulse.getStartTime()), a, masse, impulse.getX(), impulse.getX());
    }

        private Psi absTotalPsi(int time, float a, float masse, int x, int x1) {
            return new Psi(); //dummy-object
        }

    public void collision(Impulse impulse, int time){
        adjustImpulse(impulse);
    }

        private void adjustImpulse(Impulse impulse) {
            this.impulse.addNewImpulse(impulse);
        }

    public Impulse getImpulse(){
        return impulse;
    }

    @Override
    public Position getPosition() {
        return lastMeasuredPosition;
    }
}
