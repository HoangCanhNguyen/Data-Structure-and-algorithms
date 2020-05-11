package geometry;

public class Line extends Point{
    double x2Axis,y2Axis;
    public Line(double x, double y, double x2Axis, double y2Axis) {
        super(x,y);
        this.x2Axis = x2Axis;
        this.y2Axis = y2Axis;
    }

    @Override
    public double getSize() {
        return Math.sqrt(Math.pow(x2Axis - super.xAxis,2) + Math.pow(y2Axis - super.yAxis, 2));
    }

    @Override
    public void show(String string) {
        System.out.println(string);
        System.out.println("x= " + super.xAxis + ", y= " + super.yAxis + ", x2= " + x2Axis + ", y2= " + y2Axis + " Size= " + getSize());
    }
}