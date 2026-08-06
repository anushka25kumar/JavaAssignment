import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        String number = input.nextLine();

        System.out.print("Enter Base Pay: ");
        String pay = input.nextLine();

        System.out.print("Enter Incentive: ");
        String incentive = input.nextLine();

        // String to Wrapper Objects
        Integer employeeNumber = Integer.valueOf(number);
        Double basePay = Double.valueOf(pay);
        Double incentiveAmount = Double.valueOf(incentive);

        if (basePay < 0 || incentiveAmount < 0) {
            System.out.println("Invalid Pay or Incentive Amount.");
        } else {
            double finalSalary = basePay + incentiveAmount;

            System.out.println("\nEmployee Number : " + employeeNumber);
            System.out.println("Base Pay        : " + basePay);
            System.out.println("Incentive       : " + incentiveAmount);
            System.out.println("Final Salary    : " + finalSalary);
        }

        input.close();
    }
}
/* Enter Employee Number: 205
Enter Base Pay: 45000
Enter Incentive: 5000

Employee Number : 205
Base Pay        : 45000.0
Incentive       : 5000.0
Final Salary    : 50000.0 */
