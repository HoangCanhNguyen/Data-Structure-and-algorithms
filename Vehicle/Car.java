package Vehicle;

public class Car extends Vehicle {
    int windows = 4;
    public Car(String id, String user) {
        super(id,user);
    }    
    void show(String title) {
        super.show(title);
        System.out.println("So cua la: " + windows);
    }
}