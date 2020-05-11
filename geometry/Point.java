package geometry;

public class Point {
    double xAxis, yAxis;
    public Point(double xAxis, double yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public double getSize() {
        return 0;
    }

    public void show(String string) {
        System.out.println(string);
        System.out.println("x= " + xAxis + ", y= " + yAxis + getSize());
    }

}