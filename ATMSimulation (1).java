package P12;
import java.util.Scanner;

public class ATMSimulation {
    private static final int CORRECT_PIN = 1234;
    private static int balance = 1000;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // PIN verification with 3 attempts
        for (int attempts = 3; attempts > 0; attempts--) {
            System.out.print("Enter PIN: ");
            if (scanner.hasNextInt()) {
                int pin = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                if (pin == CORRECT_PIN) {
                    System.out.println("Login successful!");
                    atmMenu(scanner);
                    break;
                } else {
                    System.out.println("Wrong PIN! Attempts left: " + (attempts - 1));
                    if (attempts == 1) {
                        System.out.println("Account locked. Too many failed attempts.");
                    }
                }
            } else {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.nextLine(); // Clear invalid input
                attempts++; // Don't count invalid input as an attempt
            }
        }
        scanner.close();
    }
    
    private static void atmMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n==== ATM Menu ====");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");
            System.out.print("Choice: ");
            
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        handleDeposit(scanner);
                        break;
                        
                    case 2:
                        handleWithdrawal(scanner);
                        break;
                        
                    case 3:
                        checkBalance();
                        break;
                        
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;
                        
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
    
    private static void handleDeposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        if (scanner.hasNextInt()) {
            int amount = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (amount <= 0) {
                System.out.println("Invalid amount! Try again.");
            } else {
                deposit(amount);
            }
        } else {
            System.out.println("Invalid amount! Please enter a number.");
            scanner.nextLine(); // Clear invalid input
        }
    }
    
    private static void handleWithdrawal(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        if (scanner.hasNextInt()) {
            int amount = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (amount <= 0) {
                System.out.println("Invalid amount! Try again.");
            } else {
                withdraw(amount);
            }
        } else {
            System.out.println("Invalid amount! Please enter a number.");
            scanner.nextLine(); // Clear invalid input
        }
    }
    
    private static void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }
    
    private static void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
    
    private static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
}