import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double balance = 0.0;
    int choice;

    while (true) {
    System.out.println("==== ATM BANK ====");
    System.out.println("1. View your balance ");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");
    System.out.println("Enter a number between 1 - 4");
    
    choice = input.nextInt();
    
    switch (choice){

        case 1:
        System.out.println("Your balance is: " + balance);
        break;

        case 2:
        System.out.print("Enter amount to deposit: $");
        double deposit = input.nextDouble();
        if (deposit > 0) {
           balance += deposit;
           System.out.println("Deposited Successfully");
        } else {
            System.out.println("deposited amount must be positive");
        }
        break;

        case 3:
        System.out.print("Enter amount to withdraw: $");
        double withdraw = input.nextDouble();
        if ( withdraw > balance) {
            System.out.println("unsuffient balance");
        } else if (withdraw <= 0) {
            System.out.println("withdraw must be positive");
        } else{
            balance -= withdraw;
            System.out.println("withdraw successfully");
        }
        break;

        case 4:
        System.out.println("Thank you for using the ATM. Goodbye!");
                    input.close();
                    return;

        default:
        System.out.println("enter number between 1-4 only");


    } 

    

}

    }
}



