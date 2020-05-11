package Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle a;
        a = new Car("ABCDER","Nguyen Hoang Canh");
        a.show(">> Hello Car");
        if (a instanceof Truck) System.out.println("oke nhe");
        else System.out.println("DD hieu");

    }
}