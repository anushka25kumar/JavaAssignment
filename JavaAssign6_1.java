import java.util.Scanner;

class Vehicle {
    String model;
    String registrationNo;

    Vehicle(String model, String registrationNo) {
        this.model = model;
        this.registrationNo = registrationNo;
    }

    class VehicleInfo {
        void showInfo() {
            System.out.println("\nVehicle Information");
            System.out.println("Vehicle Model : " + model);
            System.out.println("Registration No : " + registrationNo);
        }
    }
}

interface Action {
    void execute();
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter vehicle model: ");
        String modelName = input.nextLine();

        System.out.print("Enter registration number: ");
        String regNo = input.nextLine();

        Vehicle car = new Vehicle(modelName, regNo);

        // Using inner class
        Vehicle.VehicleInfo info = car.new VehicleInfo();
        info.showInfo();

        // Anonymous class
        Action startAction = new Action() {
            public void execute() {
                System.out.println("Vehicle is starting...");
            }
        };

        startAction.execute();

        input.close();
    }
}
/* Enter vehicle model: Toyota
Enter registration number: UK07CD5678

Vehicle Information
Vehicle Model : Toyota
Registration No : UK07CD5678
Vehicle is starting... */
