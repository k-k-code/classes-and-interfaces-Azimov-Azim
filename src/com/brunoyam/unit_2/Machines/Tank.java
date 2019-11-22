package com.brunoyam.unit_2.Machines;

import com.brunoyam.unit_2.Combat;
import com.brunoyam.unit_2.Soldiers.Shootable;

public class Tank extends Combat implements Shootable {


    public Tank(int speed, int health, int armor, int damage, int fuel) {
        super(speed, health, armor);
        this.fuel = fuel;

    }

    @Override
    public void getShot(int damage) {
        int left = this.getHealth() - damage;
        this.setHealth(left);


    }


    @Override
    public void shoot(Combat target) {
        target.getShot(15);
    }
}




