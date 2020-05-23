import java.util.Scanner;

public class Miner extends Worker {
  double seniorityAllowance;

  Miner(String name, String birthDay, String homeTown, int level, double loan, double seniorityAllowance) {
    super(name, birthDay, homeTown, level, loan);
    this.seniorityAllowance = seniorityAllowance;
  }

  public void showDetail(String t) {
    super.showDetail(t);
    System.out.println("Che do tham nien: " + seniorityAllowance);
    System.out.println("Luong: " + getIncome());
  }

  public double getIncome() {
    return super.getIncome() + seniorityAllowance;
  }

  public void Input(String t) {
    super.Input(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap gia tri tham nien: ");
    seniorityAllowance = scanner.nextDouble();
  }
}