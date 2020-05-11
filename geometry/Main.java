package geometry;

public class Main {
    public static void main(String[] args) {
        Point point[] = new Point[6];
        point[0] = new Point(3.5, 5.4);
        point[1] = new Line(-3.7, 2.5, 7.8, -9.2);

        for (int i = 0; i<6; i++) {
            point[i].show("Doi tuong: " + point[i].getClass().getName() + " ");
        }
    }
}