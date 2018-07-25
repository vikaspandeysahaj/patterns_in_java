package decorator_pattern;

public class BaseCar implements Car {

    public String getDescription() {
        return "Basic Car";
    }

    public double getCost() {
        return 300000.00;
    }
}
