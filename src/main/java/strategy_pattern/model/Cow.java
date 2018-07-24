package strategy_pattern.model;

import strategy_pattern.strategy.CantFly;

public class Cow extends Animal {

    public Cow(){
        this.setNumberOfLegs(4);
        this.setSound("Mooo");
        this.setFly(new CantFly());
    }
}
