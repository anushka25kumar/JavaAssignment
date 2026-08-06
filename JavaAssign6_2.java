import java.util.Scanner;

class FoodOrder {
    String buyerName;
    String foodName;

    FoodOrder(String buyerName, String foodName) {
        this.buyerName = buyerName;
        this.foodName = foodName;
    }

    class OrderInfo {
        void showOrder() {
            System.out.println("\nFood Order Information");
            System.out.println("Customer : " + buyerName);
            System.out.println("Food Selected : " + foodName);
        }
    }
}

interface DeliveryStatus {
    void checkStatus();
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter buyer name: ");
        String buyer = input.nextLine();

        System.out.print("Enter food name: ");
        String food = input.nextLine();

        FoodOrder foodOrder = new FoodOrder(buyer, food);
        FoodOrder.OrderInfo orderInfo = foodOrder.new OrderInfo();
        orderInfo.showOrder();

        DeliveryStatus delivery = new DeliveryStatus() {
            public void checkStatus() {
                System.out.println("Your food order is on the way.");
            }
        };

        delivery.checkStatus();

        input.close();
    }
}
/* Enter buyer name: Anushka
Enter food name: Pizza

Food Order Information
Customer : Anushka
Food Selected : Pizza
Your food order is on the way. */
