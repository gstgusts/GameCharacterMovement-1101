package com.company;

public abstract class Character {
    private int posX;
    private int posY;
    private int stepSize = 1;

    public Character(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Character() {
        this.posX = 0;
        this.posY = 0;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP -> {
                posY -= getStepSize();
                break;
            }
            case DOWN -> {
                posY += getStepSize();
                break;
            }
            case RIGHT -> {
                posX += getStepSize();
                break;
            }
            case LEFT -> {
                posX -= getStepSize();
                break;
            }
        }
    }

    public String getPosition() {
        return "X: " + posX + ", Y: " + posY;
    }

    public int getStepSize() {
        return stepSize;
    }
}
