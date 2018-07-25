package adapter_pattern.adapters;

import adapter_pattern.models.Door;

public class DoorAdapter implements Remote {

    private Door door;

    public DoorAdapter(Door door) {
        this.door = door;
    }

    public void onButtonPressed() {
        this.door.open();
    }

    public void offButtonPressed() {
        this.door.close();
    }

    public void upButtonPressed() {
        System.out.println("up button function not supported");
    }

    public void downButtonPressed() {
        System.out.println("down button function not supported");
    }
}
