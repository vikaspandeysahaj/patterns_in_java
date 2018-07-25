package decorator_pattern;

public class run {
    public static void main(String[] agrs){
        Car car = new MusicSystem(new CenterLock(new AirBag(new BaseCar())));

        System.out.println(car.getDescription());
        System.out.println(car.getCost());

        Car car1 = new MusicSystem(new CenterLock(new BaseCar()));
        System.out.println(car1.getDescription());
        System.out.println(car1.getCost());
    }
}
