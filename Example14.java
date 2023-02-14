import java.util.Scanner;

class GrossSalary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Salary = 0, DA = 0, HRA = 0, GrossSalary = 0;
        System.out.println("Enter Basic Salary Amount : ");
        Salary = sc.nextFloat();

        if (Salary <= 10000) {
            HRA = (67 * Salary) / 100;
            DA = (78 * Salary) / 100;
            GrossSalary = Salary + HRA + DA;
        } else if (Salary > 10000 && Salary < 20000) {
            HRA = (70 * Salary) / 100;
            DA = (80 * Salary) / 100;
            GrossSalary = Salary + HRA + DA;
        } else {
            HRA = (73 * Salary) / 100;
            DA = (87 * Salary) / 100;
            GrossSalary = Salary + HRA + DA;
        }

        System.out.println("Gross Salary  is : " + GrossSalary);

    }
}