package state.solution;

public class Walking implements Mode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Walking)");
        return 4;
    }
}
