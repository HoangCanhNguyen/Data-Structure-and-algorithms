import java.util.Scanner;

public class Employee {
  String name;
  String birthDay;
  String homeTown;

  public Employee(String name, String birthDay, String homeTown) {
    this.name = name;
    this.birthDay = birthDay;
    this.homeTown = homeTown;
  }

  public void showDetail(String t) {
    System.out.println(t);
    System.out.println("Ho ten: " + name);
    System.out.println("Ngay sinh " + birthDay);
    System.out.println("Que quan: " + homeTown);
  }

  public void showList(int index) {
    System.out.printf("\n|%5d|%20s|%10s|%20s|%15.2f", index,name,birthDay,homeTown,getIncome());
  }

  public double getIncome() {
    return 0;
  }

  public void Input(String t) {
    System.out.println(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ho ten: ");
    name = scanner.nextLine();
    System.out.print("Nhap ngay sinh: ");
    name = scanner.nextLine();
    System.out.print("Nhap que quan: ");
    name = scanner.nextLine();
  }
}