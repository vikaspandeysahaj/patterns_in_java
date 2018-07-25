package decorator_pattern;

public abstract class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car newCar){
        this.car = newCar;
    }

    public String getDescription() {
        return this.car.getDescription();
    }

    public double getCost() {
        return this.car.getCost();
    }
}
