package factory_pattern.factory;

import factory_pattern.models.Computer;
import factory_pattern.models.Laptop;
import factory_pattern.models.PC;

public class ComputerFactory {

    public static Computer createComputer(ComputerType computerType, String CPU, String RAM, String HDD){
        Computer computer = null;
        if(computerType == ComputerType.LAPTOP){
            computer = new Laptop(CPU, RAM, HDD);
        }else if(computerType == ComputerType.PC) {
            computer = new PC(CPU, RAM, HDD);
        }

        return computer;
    }
}
