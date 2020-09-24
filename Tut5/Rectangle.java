public class Rectangle extends Polygon {
    public Rectangle(String theName, float theWidth, float theHeight) {
        super(theName, theWidth, theHeight);
        this.polytype = KindOfPolygon.POLY_RECT;
    }

    public float calArea() {
        return this.height * this.width;
    }
}
