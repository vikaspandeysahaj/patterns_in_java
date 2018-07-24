package abstract_factory_pattern.factory;

import abstract_factory_pattern.models.Computer;

public abstract class ComputerAbstractFactory {

    protected String CPU;
    protected String RAM;
    protected String HDD;
    public abstract Computer createComputer();

}
