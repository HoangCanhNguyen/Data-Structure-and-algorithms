package geometry;

public class Circle extends Point {
    float radius;
    public Circle(float x, float y, float radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double getSize() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void show(String string) {
        System.out.println(string);
        System.out.println(xAxis + " " + yAxis + " " + getSize());
    }
}