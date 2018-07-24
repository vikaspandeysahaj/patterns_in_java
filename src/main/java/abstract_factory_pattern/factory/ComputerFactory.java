package abstract_factory_pattern.factory;

import abstract_factory_pattern.models.Computer;

public class ComputerFactory {

    public static Computer createComputer(ComputerAbstractFactory caf){
        return caf.createComputer();
    }
}
