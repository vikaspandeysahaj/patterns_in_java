package adapter_pattern;


import adapter_pattern.adapters.ACAdapter;
import adapter_pattern.adapters.DoorAdapter;
import adapter_pattern.adapters.Remote;
import adapter_pattern.adapters.TVAdapter;
import adapter_pattern.models.AC;
import adapter_pattern.models.Door;
import adapter_pattern.models.TV;

public class UniversalRemote {

    public static void main(String[] args){


        Remote[] remotes = { new ACAdapter(new AC()), new TVAdapter(new TV()), new DoorAdapter(new Door()) };

        for (Remote remote : remotes) {
            remote.onButtonPressed();
            remote.upButtonPressed();
            remote.downButtonPressed();
            remote.offButtonPressed();
        }

    }
}
