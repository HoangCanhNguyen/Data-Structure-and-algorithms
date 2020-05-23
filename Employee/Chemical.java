import java.util.Scanner;

public class Chemical extends Engineer {
  double toxicAllowance;

  Chemical(String name, String birthDay, String homeTown, int salaryScale, double toxicAllowance) {
    super(name, birthDay, homeTown, salaryScale);
    this.toxicAllowance = toxicAllowance;
  }

  public void showDetail(String t) {
    super.showDetail(t);
    System.out.print("Tro cap doc hai " + toxicAllowance);
    System.out.print("Luong: " + getIncome());
  }

  public void Input(String t) {
    super.Input(t);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap phu cap doc hai: ");
    toxicAllowance = scanner.nextInt();
  }

  public double getIncome() {
    return super.getIncome() + toxicAllowance;
  }
}