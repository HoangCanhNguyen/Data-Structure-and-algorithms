package Vehicle;

public class Truck extends Vehicle {
    int windows = 3;
    public Truck(String id, String user) {  
        super(id,user);
    }
    void show(String title) {
        super.show(title);
        System.out.println("So cua la: " + windows);

    }
}