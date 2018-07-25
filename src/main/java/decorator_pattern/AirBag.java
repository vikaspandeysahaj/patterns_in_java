package decorator_pattern;

public class AirBag extends CarDecorator {

    public AirBag(Car newCar) {
        super(newCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Air Bag";
    }

    @Override
    public double getCost() {
        return super.getCost() + 30000.00;
    }
}
