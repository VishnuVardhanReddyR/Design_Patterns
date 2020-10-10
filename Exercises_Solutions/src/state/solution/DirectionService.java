package state.solution;

public class DirectionService {
    private Mode mode;

    public Object getEta(){
       return mode.getEta();
    }

    public Object getDirection(){
       return mode.getDirection();
    }

    public Mode getTravelMode() {
        return mode;
    }

    public void setTravelMode(Mode mode) {
        this.mode = mode;
    }
}
