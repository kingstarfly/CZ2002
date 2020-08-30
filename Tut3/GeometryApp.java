public class GeometryApp {
    public static void main(String[] args) {
        Point p1 = new Point(5,10);
        System.out.printf("X: %d, y: %d, toString: %s\n", p1.getX(), p1.getY(), p1.toString());
        p1.setPoint(1,2);
        System.out.printf("After setPoint, new toString: %s\n", p1.toString());

        Circle c1 = new Circle(5,10,2);
        c1.setRadius(7);
        System.out.printf("X: %d, y: %d, radius: %d, toString: %s, area: %.4f\n", c1.getX(), c1.getY(), c1.getRadius(), c1.toString(), c1.area());

        Cylinder cy1 = new Cylinder(1,2,3,4);
        System.out.printf("Height: %d", cy1.getHeight());
        cy1.setHeight(10);
        System.out.printf("Height: %d", cy1.getHeight());
        System.out.printf("X: %d, y: %d, radius: %d, height: %d, toString: %s, area: %.4f, volume: %.4f\n", cy1.getX(), cy1.getY(), cy1.getRadius(), cy1.getHeight(), cy1.toString(), cy1.area(), cy1.volume());
        
    }
}