import java.util.Scanner;
class RestaurantBilling {
static int count = 0;
static double calculateBill(double amount) {
count++;
return amount;
}
static double calculateBill(double amount, double packing)
{
count++;
return amount + packing;
}
static double calculateBill(double amount, double packing,
double delivery) {
count++;
return amount + packing + delivery;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Restaurant Billing");
System.out.print("Enter dine-in amount: ");
double dinein = sc.nextDouble();
System.out.println("Dine-in Bill = " +
calculateBill(dinein));
System.out.print("Enter takeaway amount: ");
double takeaway = sc.nextDouble();
System.out.print("Enter packing charge: ");
double packing = sc.nextDouble();
System.out.println("Takeaway Bill = " +
calculateBill(takeaway, packing));
System.out.print("Enter delivery amount: ");
double delivery = sc.nextDouble();
System.out.print("Enter packing charge: ");
double pack = sc.nextDouble();
System.out.print("Enter delivery charge: ");
double charge = sc.nextDouble();
System.out.println("Delivery Bill = " +
calculateBill(delivery, pack, charge));
System.out.println("Total Orders = " + count);
sc.close();
}
}
/* Restaurant Billing
Enter dine-in amount: 500
Dine-in Bill = 500.0

Enter takeaway amount: 700
Enter packing charge: 50
Takeaway Bill = 750.0

Enter delivery amount: 800
Enter packing charge: 40
Enter delivery charge: 60
Delivery Bill = 900.0

Total Orders = 3 */
