package composite.implementation;

public class MainCompositeImp {
    public static void main(String[] args){
        var group1 = new Group();
        group1.addShape(new Shape()); //square
        group1.addShape(new Shape()); //square

        var group2 = new Group();
        group2.addShape(new Shape()); //circle
        group2.addShape(new Shape()); //circle

        var group = new Group();
        group.addShape(group1);
        group.addShape(group2);
        group.render();
        group.move();
    }
}
