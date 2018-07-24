package abstract_factory_pattern.models;

public abstract class Computer {
    private String CPU;
    private String RAM;
    private String HDD;

    public abstract void printInfo();

    public Computer(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }


}
