package prototype_pattern;

import prototype_pattern.models.AC;
import prototype_pattern.models.Fan;

public class run {
    public static void main(String[] args){

        AC ac = new AC("LG", "5L");
        ac.printInfo();

        AC clonedAc = (AC)ac.makeClone();
        clonedAc.printInfo();


        Fan fan = new Fan("Bajaj", "Small");
        fan.printInfo();

        Fan clonedFan = (Fan)fan.makeClone();
        clonedFan.printInfo();

    }
}
