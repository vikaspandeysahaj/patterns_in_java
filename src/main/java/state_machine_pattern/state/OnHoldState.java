package state_machine_pattern.state;

public class OnHoldState implements State {
    public void execute() {
        System.out.println("machine is on hold ");
    }
}
