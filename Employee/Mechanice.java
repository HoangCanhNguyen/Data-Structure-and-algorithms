import java.util.Scanner;

public class Mechanice extends Worker {
  String activity;

  Mechanice(String name, String birthDay, String homeTown, int level, double loan, String activity) {
    super(name, birthDay, homeTown, level, loan);
    this.activity = activity;
  }

  public void showDetail(String t) {
    super.showDetail(t);
    System.out.print("Che do cong viec: " + activity);
    System.out.print("Luong: " + getIncome());
  }

  public void Input(String t) {
    super.Input(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap che do cong viec: ");
    activity = scanner.nextLine();
  }
}