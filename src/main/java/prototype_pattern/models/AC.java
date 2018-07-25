package prototype_pattern.models;

public class AC implements Equipment {

    private String brand;
    private String size;

    public AC(String brand, String size){
        this.brand = brand;
        this.size = size;
    }

    public void printInfo(){

        System.out.println("AC brand: "+ this.brand);
        System.out.println("AC size: "+ this.size);
        System.out.println("AC Stored in memory location: "+ this.hashCode());
    }

    public Equipment makeClone() {

        System.out.println("Cloning AC");
        try {
            return (AC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
