package adapter_pattern.models;

public class TV {
    private int currentVolume = 10;

    public void on(){
        System.out.println("TV is now on");
    }

    public void off(){
        System.out.println("TV is now off");
    }

    public void increaseVolume(){
        currentVolume= currentVolume + 1;
        System.out.println("TV volume is now: "+ this.currentVolume);
    }

    public void decreaseVolume(){
        currentVolume= currentVolume - 1;
        System.out.println("AC volume is now: "+ this.currentVolume);
    }
}
