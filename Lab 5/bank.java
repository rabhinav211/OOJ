import java.util.Scanner;

class Account {
    String name;
    int accountNumber;
    double balance = 0;
    Scanner scanner = new Scanner(System.in);

    Account(String accountType) {
        System.out.println("Creating a new " + accountType + " account");
        System.out.print("Enter name: ");
        this.name = scanner.next();
        System.out.print("Enter account number: ");
        this.accountNumber = scanner.nextInt();
    }

    void deposit() {
        System.out.print("Enter deposit amount: ");
        balance += scanner.nextDouble();
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double withdrawal = scanner.nextDouble();
        if (withdrawal <= balance) {
            balance -= withdrawal;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    void performMenuActions() {
        int choice;
        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting the menu. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}

class SavingsAccount extends Account {
    int interestRate = 5;

    SavingsAccount() {
        super("Savings");
    }

    void compoundInterest(int time) {
        balance *= Math.pow((1 + (interestRate / 100.0)), time);
        System.out.println("Compound interest applied. Current balance: " + balance);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = -100;

    CurrentAccount() {
        super("Current");
    }

    void issueCheque() {
        System.out.print("Enter cheque amount: ");
        double chequeAmount = scanner.nextDouble();
        if (chequeAmount <= balance && (balance - chequeAmount) >= overdraftLimit) {
            balance -= chequeAmount;
            System.out.println("Cheque issued successfully. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds to issue the cheque");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking App");

        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        Account selectedAccount = null;

        System.out.println("\nSelect an account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int accountTypeChoice = scanner.nextInt();

        if (accountTypeChoice == 1) {
            selectedAccount = savingsAccount;
        } else if (accountTypeChoice == 2) {
            selectedAccount = currentAccount;
        } else {
            System.out.println("Invalid choice. Exiting.");
            System.exit(0);
        }

        selectedAccount.performMenuActions();

        scanner.close();
    }
}
