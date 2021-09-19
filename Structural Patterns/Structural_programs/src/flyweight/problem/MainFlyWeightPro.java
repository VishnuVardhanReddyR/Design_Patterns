package flyweight.problem;

public class MainFlyWeightPro {
    public static void main(String[] args){
        var service = new PointService();
        for(var point : service.getPoints()){
            point.draw();
        }
    }
}
