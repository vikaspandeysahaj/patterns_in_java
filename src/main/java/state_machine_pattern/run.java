package state_machine_pattern;

import state_machine_pattern.state.OnHoldState;
import state_machine_pattern.state.OpenState;

public class run {

    public static void main(String[] argv){

        Machine objMachine = new Machine();
        objMachine.getCurrentState().execute();

        objMachine.changeCurrentState(new OpenState());
        objMachine.getCurrentState().execute();

        objMachine.changeCurrentState(new OnHoldState());
        objMachine.getCurrentState().execute();
    }
}
