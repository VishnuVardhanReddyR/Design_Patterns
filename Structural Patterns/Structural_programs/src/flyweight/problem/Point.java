package flyweight.problem;

public class Point {
    private int x;  // 4 bytes
    private int y;  // 4 bytes
    private PointType type;  // 4 bytes
    private byte[] icon;  // 20 KB -> 20 MB

    public Point(int x, int y, PointType type, byte[] icon) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.icon = icon;
    }

    public void draw(){
        System.out.printf("%s at (%d,%d)", type,x,y);
    }

    {/* In this class we shall have attributes such as x&y coordinates, that is where on the map we gonna render this point.
    We should also know the
    */}

}
