package com.brunoyam.unit_2;

public abstract class Combat {
    protected int fuel;
    private int armor;
    private int health;
    private int speed;

    public Combat(int speed, int health, int armor) {
        this.armor = armor;
        this.speed = speed;
        this.health = health;
    }

    public void getShot(int damage) {
        int left = this.getHealth() - damage;
        this.setHealth(left);


    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
