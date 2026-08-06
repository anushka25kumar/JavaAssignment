import java.util.Scanner;
class Calculator {
static int count = 0;
static int add(int a, int b) {
count++;
return a + b;
}
static double add(double a, double b) {
count++;
return a + b;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("CALCULATOR");
System.out.print("Enter first integer: ");
int a = sc.nextInt();
System.out.print("Enter second integer: ");
int b = sc.nextInt();
System.out.println("Integer Addition = " + add(a, b));
System.out.print("Enter first decimal number: ");
double x = sc.nextDouble();
System.out.print("Enter second decimal number: ");
double y = sc.nextDouble();
System.out.println("Decimal Addition = " + add(x, y));
System.out.println("Total Calculations = " + count);
sc.close();
}
}
/* CALCULATOR
Enter first integer: 10
Enter second integer: 20
Integer Addition = 30
Enter first decimal number: 12.5
Enter second decimal number: 7.5
Decimal Addition = 20.0
Total Calculations = 2 */
