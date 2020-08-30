public class Cylinder extends Circle{
    protected int height;
    
    public Cylinder(int x, int y, int radius, int height) {
        super(x,y,radius);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public String toString() {
        return String.format("[%d, %d, %d, %d]", this.x, this.y, this.radius, this.height);
    }

    // area function is same as Circle

    public double volume() {
        return this.area() * height;
    }
}