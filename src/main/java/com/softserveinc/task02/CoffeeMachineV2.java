package com.softserveinc.task02;

import com.softserveinc.task01.CoffeeMachineV1;

public class CoffeeMachineV2 extends CoffeeMachineV1 {
    protected final int milkReservoirCapacity;

    private int milk;

    public CoffeeMachineV2(int coffeeBeanStorageCapacity, int waterReservoirCapacity, int wasteCoffeeBeanCapacity, int milkReservoirCapacity) {
        super(coffeeBeanStorageCapacity, waterReservoirCapacity, wasteCoffeeBeanCapacity);
        this.milkReservoirCapacity = milkReservoirCapacity;
    }

    public void addMilk(int milk) {
        this.milk = Math.min(milk + this.milk, milkReservoirCapacity);
    }

    public int getMilk() {
        return milk;
    }
    public boolean makeCappuccino() {
        if (makeEspresso() == false) {
            return false;
        }
        if (milk < 85) {
            System.err.println("Not enough milk");
            return false;
        }
        milk = milk - 85;
//      milk -= 85; - alternative variant
        return true;
    }

    public boolean makeLatte() {
        if (makeEspresso() == false) {
            return false;
        }
        if (milk <150) {
            System.err.println("Not enough milk");
            return false;
        }
        milk = milk - 150;
        return true;
    }
}

