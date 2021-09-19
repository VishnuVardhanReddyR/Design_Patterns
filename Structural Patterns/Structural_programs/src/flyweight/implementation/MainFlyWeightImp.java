package flyweight.implementation;

public class MainFlyWeightImp {
    public static void main(String[] args){
        var service = new PointService(new PointIconFactory());
        for(var point : service.getPoints()){
            point.draw();
        }
    }
}
