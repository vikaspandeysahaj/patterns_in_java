package strategy_pattern.model;

import strategy_pattern.strategy.CanFly;

public class Parrot extends Animal {

    public Parrot(){
        this.setNumberOfLegs(2);
        this.setSound("squawk");
        this.setFly(new CanFly());
    }
}
