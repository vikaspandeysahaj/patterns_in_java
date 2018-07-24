package state_machine_pattern;

import state_machine_pattern.state.CloseState;
import state_machine_pattern.state.State;

public class Machine {

    private State currentState;

    Machine(){
        this.changeCurrentState(new CloseState());
    }

    public State getCurrentState() {
        return currentState;
    }

    public void changeCurrentState(State state) {
        this.currentState = state;
    }


}
