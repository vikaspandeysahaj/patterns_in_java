package adapter_pattern.adapters;


import adapter_pattern.models.TV;

public class TVAdapter implements Remote {

    private TV tv;

    public TVAdapter(TV ac) {
        this.tv = ac;
    }

    public void onButtonPressed() {
        this.tv.on();
    }

    public void offButtonPressed() {
        this.tv.off();
    }

    public void upButtonPressed() {
        this.tv.increaseVolume();
    }

    public void downButtonPressed() {
        this.tv.decreaseVolume();
    }
}
