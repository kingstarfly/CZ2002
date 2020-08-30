public class Circle extends Point{

    protected int radius;
    static final double PI = 3.1459;

    public Circle(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }

    public void setRadius(int rad) {
        this.radius = rad;
    }

    public int getRadius() {
        return this.radius;
    }

    public String toString() {
        return String.format("[%d, %d, %d]", this.x, this.y, this.radius);
    }

    public double area() {
        return PI*this.radius*this.radius;
    }
    
}