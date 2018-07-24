package strategy_pattern.model;

import strategy_pattern.strategy.CantFly;

public class Dog extends Animal {

    public Dog(){
        this.setNumberOfLegs(4);
        this.setSound("Barking");
        this.setFly(new CantFly());
    }
}
