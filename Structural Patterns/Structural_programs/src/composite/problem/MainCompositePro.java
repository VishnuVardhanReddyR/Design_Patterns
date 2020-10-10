package composite.problem;

public class MainCompositePro {
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
        // We will get an error because the method is expecting a shape not the group. our group and shape classes are completely differen.
        //they have nothing in common. So with this structure we cannot add a group inside a group.
        //replace group class with object class in the addShape method of group class.
        //Because in java every directly or indirectly extends the object class. we can pass any kinds of objects here.
    }
}
