package adapter_pattern.adapters;

import adapter_pattern.models.AC;

public class ACAdapter implements Remote {

    private AC ac;

    public ACAdapter(AC ac) {
        this.ac = ac;
    }

    public void onButtonPressed() {
        this.ac.on();
    }

    public void offButtonPressed() {
        this.ac.off();
    }

    public void upButtonPressed() {
        this.ac.increaseTemp();
    }

    public void downButtonPressed() {
        this.ac.decreaseTemp();
    }
}
