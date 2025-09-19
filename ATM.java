import java.util.Scanner;
 public class ATM {
    public static void main(String[] args) {
        int balance = 10000; // Initial balance
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Withdraw
                    System.out.print("Enter Your Amount: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 2: // Deposit
                    System.out.print("Enter Your Amount:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful! Your new balance is: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 4: // Exit
                    System.out.println("\n👉Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0); // Terminate the program
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
