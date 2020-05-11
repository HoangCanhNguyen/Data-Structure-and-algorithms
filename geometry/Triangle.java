package geometry;

public class Triangle extends Line {
    float x3Axis, y3Axis;
    public Triangle(float x, float y, float x2, float y2, float x3Axis, float y3Axis) {
        super(x,y,x2,y2);
        this.x3Axis = x3Axis;
        this.y3Axis = y3Axis;
    }
    @Override
    public double getSize() {
        double a,b,c,d;
        a = super.getSize();
        b = Math.sqrt(Math.pow(x3Axis - super.xAxis, 2) + Math.pow(y3Axis - super.yAxis, 2));
        c = Math.sqrt(Math.pow(x3Axis - super.x2Axis, 2) + Math.pow(y3Axis - super.y2Axis, 2));
        d = (a+b+c)/2;
        return Math.sqrt(d*(d-a)*(d-b)*(d-c));
    }

    @Override
    public void show(String string) {
        System.out.println(string);
        System.out.println(xAxis + " " + yAxis + " " + x2Axis + " " + y2Axis + " " + x3Axis + " " + y3Axis);

    }
}