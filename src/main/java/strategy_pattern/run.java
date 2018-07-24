package strategy_pattern;

import strategy_pattern.model.Animal;
import strategy_pattern.model.Cow;
import strategy_pattern.model.Dog;
import strategy_pattern.model.Parrot;

public class run {
    public static void main(String[] argv){
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal parrot = new Parrot();

        dog.tryFly();
        cow.tryFly();
        parrot.tryFly();

    }
}
