class Account {
    int accountNo;
    String holderName;
    double amount;

    // Default Constructor
    Account() {
        accountNo = 0;
        holderName = "Unknown";
        amount = 0.0;
    }

    // Parameterized Constructor
    Account(int a, String h, double am) {
        accountNo = a;
        holderName = h;
        amount = am;
    }

    // Copy Constructor
    Account(Account obj) {
        accountNo = obj.accountNo;
        holderName = obj.holderName;
        amount = obj.amount;
    }

    void display() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Amount: " + amount);
        System.out.println();
    }

    public static void main(String[] args) {

        Account account1 = new Account();

        Account account2 = new Account(1001, "Anushka", 6500);

        Account account3 = new Account(account2);

        System.out.println("Default Constructor:");
        account1.display();

        System.out.println("Parameterized Constructor:");
        account2.display();

        System.out.println("Copy Constructor:");
        account3.display();
    }
}
/* Default Constructor:
Account Number: 0
Account Holder: Unknown
Amount: 0.0

Parameterized Constructor:
Account Number: 1001
Account Holder: Anushka
Amount: 6500.0

Copy Constructor:
Account Number: 1001
Account Holder: Anushka
Amount: 6500.0 */
