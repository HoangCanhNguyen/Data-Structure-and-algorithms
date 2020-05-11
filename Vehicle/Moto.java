package Vehicle;

public class Moto extends Vehicle {
    boolean roof = false;
    public Moto(String id, String user) {
        super(id,user);
    }
    void show(String title) {
        super.show(title);
        if (roof) System.out.println("Co mai che");
        else System.out.println("Khong co mai che");
    }
}