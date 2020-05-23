import java.util.Scanner;

public class Engineer extends Employee {
  String name;
  String birthDay;
  String homwTown;
  int salaryScale;

  Engineer(String name, String birthDay, String homeTown, int salaryScale) {
    super(name,birthDay,homeTown);
    this.salaryScale = salaryScale;
  }

  public void showDetail(String t) {
     super.showDetail(t);
     System.out.println("He so luong: " + salaryScale);
     System.out.println("Luong: " + getIncome());
  }
  public double getIncome() {
    return salaryScale * 1050000;
  }

  public void Input(String t) {
    super.Input(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("He so luong: ");
    salaryScale = scanner.nextInt();
  }
}