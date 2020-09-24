public class TestPolygon {
    // static binding below
    // public void printArea(Rectangle r) {
    //     System.out.println("Retangle " + r.getName() + " - area = " + r.calArea());
    // }

    // public void printArea(Triangle t) {
    //     System.out.println("Triangle " + t.getName() + " - area = " + t.calArea());
    // }

    // dynamic binding below
    public void printArea(Polygon p) {
        System.out.println(p.getPolytype() + " " + p.getName() + " - area = " + p.calArea());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("r1", 5, 10);
        Triangle t1 = new Triangle("t1", 5, 10);

        TestPolygon tester = new TestPolygon();
        tester.printArea(r1);
        tester.printArea(t1);
    }
}
