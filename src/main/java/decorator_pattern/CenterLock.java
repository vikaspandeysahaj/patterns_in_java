package decorator_pattern;

public class CenterLock extends CarDecorator {
    public CenterLock(Car newCar) {
        super(newCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Center lock";
    }

    @Override
    public double getCost() {
        return super.getCost() +  15000.00;
    }
}
