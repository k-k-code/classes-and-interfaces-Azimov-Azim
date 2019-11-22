package com.brunoyam.unit_2;

import com.brunoyam.unit_2.Machines.Tank;
import com.brunoyam.unit_2.Machines.Transport;
import com.brunoyam.unit_2.Soldiers.Medic;
import com.brunoyam.unit_2.Soldiers.Sniper;
import com.brunoyam.unit_2.Soldiers.Trooper;

public class Application {

    public static void main(String[] args) {


        Trooper one = new Trooper(5, 100, 5, 20);
        Medic two = new Medic(5, 50, 1);
        Sniper three = new Sniper(3, 75, 5, 40);
        one.shoot(two);
        three.shoot(one);
        System.out.println("Medic: " + two.getHealth());
        System.out.println("Sniper: " + one.getHealth());
        Tank four = new Tank(10, 100, 50, 90, 50);
        Transport five = new Transport(30, 50, 5, 50);
        one.shoot(five);
        System.out.println("Tank:" + five.getHealth());
    }


}
