package factory_pattern.models;

public class PC extends Computer {

    public PC(String CPU, String RAM, String HDD) {
        super(CPU, RAM, HDD);
    }

    public void printInfo(){
        System.out.println("PC Config - CPU: "+ getCPU() + ", RAM: "+ getRAM()+ ", HDD: "+ getHDD());
    }
}
