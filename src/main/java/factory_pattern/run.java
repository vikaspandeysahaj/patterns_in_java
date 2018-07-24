package factory_pattern;

import factory_pattern.factory.ComputerFactory;
import factory_pattern.factory.ComputerType;
import factory_pattern.models.Computer;

public class run {

    public static void main(String[] argv){

        Computer pc = ComputerFactory.createComputer(ComputerType.PC,"2.4 GHz","2 GB", "500GB");
        Computer laptop = ComputerFactory.createComputer(ComputerType.LAPTOP,"2.4 GHz","2 GB", "500GB");

        pc.printInfo();
        laptop.printInfo();
    }
}
