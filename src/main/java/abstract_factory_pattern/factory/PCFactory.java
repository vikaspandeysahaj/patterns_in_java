package abstract_factory_pattern.factory;

import abstract_factory_pattern.models.Computer;
import abstract_factory_pattern.models.PC;

public class PCFactory extends ComputerAbstractFactory {

    public PCFactory(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public Computer createComputer() {
        return new PC(this.CPU, this.RAM,this.HDD);
    }
}
