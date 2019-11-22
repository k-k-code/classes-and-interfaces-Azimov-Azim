package com.brunoyam.unit_2.Soldiers;

import com.brunoyam.unit_2.Combat;

public class Trooper extends Combat implements Shootable {
    private int damage;

    public Trooper(int speed, int health, int armor, int damage) {
        super(speed, health, armor);
        this.damage = damage;

    }


    @Override
    public void shoot(Combat target) {
        target.getShot(25);

    }
}

