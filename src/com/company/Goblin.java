package com.company;

public class Goblin extends Character {
    public Goblin(int posX, int posY) {
        super(posX, posY);
    }

    public Goblin() {
    }

    @Override
    public int getStepSize() {
        return 20;
    }
}
