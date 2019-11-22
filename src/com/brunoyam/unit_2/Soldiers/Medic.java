package com.brunoyam.unit_2.Soldiers;

import com.brunoyam.unit_2.Combat;

public class Medic extends Combat implements Shootable {


    public Medic(int speed, int health, int armor) {
        super(speed, health, armor);
    }

    @Override
    public void shoot(Combat target) {
        target.getShot(25);
    }
}
