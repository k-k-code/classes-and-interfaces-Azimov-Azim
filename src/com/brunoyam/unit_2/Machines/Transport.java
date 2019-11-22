package com.brunoyam.unit_2.Machines;

import com.brunoyam.unit_2.Combat;
import com.brunoyam.unit_2.Soldiers.Shootable;

public class Transport extends Combat implements Shootable {
    public Transport(int speed, int health, int armor, int fuel) {
        super(speed, health, armor);
        this.fuel = fuel;
    }

    @Override
    public void shoot(Combat target) {
        target.getShot(20);
    }
}
