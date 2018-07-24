package state_machine_pattern.state;

public class CloseState implements State {

    public void execute() {
        System.out.println("machine is closed ");
    }
}
