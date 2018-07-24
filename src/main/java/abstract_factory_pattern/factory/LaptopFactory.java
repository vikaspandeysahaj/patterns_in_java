package abstract_factory_pattern.factory;

import abstract_factory_pattern.models.Computer;
import abstract_factory_pattern.models.Laptop;

public class LaptopFactory extends ComputerAbstractFactory {

    public LaptopFactory(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public Computer createComputer() {
        return new Laptop(this.CPU, this.RAM,this.HDD);
    }
}
