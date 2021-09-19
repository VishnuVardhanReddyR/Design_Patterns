package state.solution;

public class StateMain {
    public static void main(String[] args){
        var service = new DirectionService();
        service.setTravelMode(new Bicycling());
        service.getDirection();
        service.getEta();
    }
}
