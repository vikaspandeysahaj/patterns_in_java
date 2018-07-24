package abstract_factory_pattern;

import abstract_factory_pattern.factory.ComputerFactory;
import abstract_factory_pattern.factory.LaptopFactory;
import abstract_factory_pattern.factory.PCFactory;
import abstract_factory_pattern.models.Computer;

public class run {

    public static void main(String[] argv){

        Computer pc = ComputerFactory.createComputer(new PCFactory("2.4 GHz","2 GB", "500GB"));
        Computer laptop = ComputerFactory.createComputer(new LaptopFactory("2.4 GHz","2 GB", "500GB"));

        pc.printInfo();
        laptop.printInfo();
    }
}
