import java.util.Scanner;


public class IT extends Engineer {
  int overtime;

  IT(String name, String birthDay, String homeTown, int salaryScale, int overtime) {
    super(name, birthDay, homeTown, salaryScale);
    this.overtime = overtime;
  }

  public void showDetail(String t) {
    super.showDetail(t);
    System.out.print("So gio lam them: " + overtime);
    System.out.print("Luong: " + getIncome());
  }
  public void Input(String t) {
    super.Input(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so gio lam them: ");
    overtime = scanner.nextInt();
  }

  public double getIncome() {
    return super.getIncome() + overtime * 35000;
  }
}