package prototype_pattern.models;

public class Fan implements Equipment{
    private String brand;
    private String size;

    public Fan(String brand, String size){
        this.brand = brand;
        this.size = size;
    }

    public void printInfo(){

        System.out.println("Fan brand: "+ this.brand);
        System.out.println("Fan size: "+ this.size);
        System.out.println("Fan Stored in memory location: "+ this.hashCode());
    }


    public Equipment makeClone() {
        System.out.println("Cloning Fan");
        try {
            return (Fan) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
