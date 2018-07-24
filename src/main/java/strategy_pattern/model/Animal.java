package strategy_pattern.model;

import strategy_pattern.strategy.Fly;

public class Animal {

    private int numberOfLegs;
    private String sound;
    private Fly fly;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void tryFly() {
        this.fly.flys();
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }
}
