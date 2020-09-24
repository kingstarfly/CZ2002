public class Triangle extends Polygon {
    public Triangle(String theName, float theWidth, float theHeight) {
        super(theName, theWidth, theHeight);
        this.polytype = KindOfPolygon.POLY_TRIANG;
    }

    public float calArea() {
        return (float)0.5 * this.height * this.width;
    }
}
