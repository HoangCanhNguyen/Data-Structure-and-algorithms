import java.util.Scanner;

public class Worker extends Employee {
  String name;
  String birthDay;
  String homwTown;
  int level;
  double loan;

  Worker(String name, String birthDay, String homeTown, int level, double loan) {
    super(name,birthDay,homeTown);
    this.level = level;
    this.loan = loan;
  }

  public void showDetail(String t) {
    super.showDetail(t);
    System.out.println("Cap bac: " + level);
    System.out.println("Tro cap: " + loan);
    System.out.println("Thu nhap " + getIncome());
  }
  
  public double getIncome() {
    return (level >= 1 && level <=7) ? 1050000 + (level - 1) * 500000 + loan : 1050000;
  }

  public void Input(String t) {
    super.Input(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap cap bac: ");
    level = scanner.nextInt();
    System.out.print("Nhap phu cap: ");
    loan = scanner.nextDouble();
  }
}