import java.util.Scanner;

public class Staff extends Employee {
  String name;
  String birthDay;
  String homwTown;
  String job;

  Staff(String name, String birthDay, String homeTown, String job) {
    super(name, birthDay, homeTown);
    this.job = job;
  }

  public void showDeital(String t) {
    super.showDetail(t);
    System.out.println("Loai hinh cong viec: " + job);
    System.out.println("Luong: " + getIncome());

  }

  public void Input(String t) {
    super.Input(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap loai hinh cong viec: ");
    job = scanner.nextLine();
  }

  public double getIncome() {
    if (job.equals("Van phong")) return 3500000;
    else if (job.equals("Bao ve")) return 3200000;
    else return 2700000;
  }
}