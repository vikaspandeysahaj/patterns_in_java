package factory_pattern.models;

public class Laptop extends Computer {

    public Laptop(String CPU, String RAM, String HDD) {
        super(CPU, RAM, HDD);
    }

    public void printInfo(){
        System.out.println("Laptop Config - CPU: "+ getCPU() + ", RAM: "+ getRAM()+ ", HDD: "+ getHDD());
    }
}
