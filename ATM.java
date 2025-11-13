import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin = 2812; // default PIN
        int enteredPin;
        double balance = 1000.00; // starting balance
        int option;
        double amount;

        System.out.println("=================================");
        System.out.println("      Welcome to Simple ATM      ");
        System.out.println("=================================");
        System.out.print("Enter your 4-digit PIN: ");
        enteredPin = input.nextInt();

        if (enteredPin == pin) {
            System.out.println("\nLogin successful!\n");

            do {
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                option = input.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Your current balance is: N" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: N");
                        amount = input.nextDouble();
                        if (amount > 0) {
                            balance += amount;
                            System.out.println("Deposit successful! New balance: N" + balance);
                        } else {
                            System.out.println("Invalid deposit amount!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: N");
                        amount = input.nextDouble();
                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                            System.out.println("Withdrawal successful! Remaining balance: N" + balance);
                        } else if (amount > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            System.out.println("Invalid withdrawal amount!");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using Simple ATM!");
                        break;

                    default:
                        System.out.println("Invalid option, please try again.");
                }
                System.out.println();
            } while (option != 4);
        } else {
            System.out.println("Incorrect PIN. Access denied!");
        }

        input.close();
    }
}