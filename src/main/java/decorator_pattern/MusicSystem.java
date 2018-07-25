package decorator_pattern;

public class MusicSystem extends CarDecorator {
    public MusicSystem(Car newCar) {
        super(newCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Music System";
    }

    @Override
    public double getCost() {
        return super.getCost()+ 10000;
    }
}
