package flyweight.implementation;

public class Point {
    private int x;  // 4 bytes
    private int y;  // 4 bytes
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw(){
        System.out.printf("%s at (%d,%d)", icon.getType(),x,y);
    }

    {/* In this class we shall have attributes such as x&y coordinates, that is where on the map we gonna render this point.
    We should also know the
    */}

}
