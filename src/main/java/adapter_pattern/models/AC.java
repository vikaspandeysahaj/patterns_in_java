package adapter_pattern.models;

public class AC {

    private int currentTemp = 10;

    public void on(){
        System.out.println("AC is now on");
    }

    public void off(){
        System.out.println("AC is now off");
    }

    public void increaseTemp(){
        currentTemp= currentTemp + 1;
        System.out.println("AC Temp. is now: "+ this.currentTemp);
    }

    public void decreaseTemp(){
        currentTemp= currentTemp - 1;
        System.out.println("AC Temp. is now: "+ this.currentTemp);
    }
}
