package state_machine_pattern.state;

public class OpenState implements State {
    public void execute() {
        System.out.println("machine is Open ");
    }
}
