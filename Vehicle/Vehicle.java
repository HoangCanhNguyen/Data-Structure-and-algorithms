package Vehicle;


public class Vehicle {
    String id;
    String user;
    public Vehicle(String id, String user) {
        this.id = id;
        this.user = user;
    }
    void show(String title) {
        System.out.println(title);
        System.out.println("Bien dang ky la: " + id);
        System.out.println("Ten chu xe la: " + user);
    }


}