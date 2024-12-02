package vut;
import java.util.Scanner;

/**
 * The main class of the project
 * @author Teboho
 */
public class UserTest {
    

    
    public static void main(String[] args) {
        
        boolean access = true;
        Scanner input = new Scanner(System.in);
        
        //users
        User teboho = new User("001", "Teboho", "Selepe", 
                "1234", 2000.00,1000.00);
        
        
        Account userAcc = new Account(teboho.getAccBalance(),
                teboho.getSavBalance());
        
        System.out.println("Welcome to Bank of Africa");
        System.out.print("Enter User ID: ");
        String userID = input.next();
        System.out.print("Enter Pin: ");
        String userPin = input.next();
        
        if (userID.matches(teboho.getUserID()) && 
                userPin.matches(teboho.getPin())){
            
            while (access){
                System.out.println("---------------------------------");
                System.out.println("\t\tATM Menu");
                System.out.println("1. Transaction History");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Check Balance");
                System.out.println("6. Quit");
                System.out.print("Select the option: ");
                int option = input.nextInt();
                
                switch(option){
                    
                    case 1:
                        System.out.println("---------------------------------");
                        System.out.println("\t\tTransaction Histoty");
                        userAcc.getTransactionHistory().printHistory();
                        
                        break;
                    case 2:
                        System.out.println("---------------------------------");
                        System.out.println("\t\tDeposit to:");
                        System.out.println("1. Main Account");
                        System.out.println("2. Savings");
                        System.out.print("Select the option: ");
                        int op = input.nextInt();
                        
                        System.out.print("Enter amount: ");
                        int amount = input.nextInt();
                        
                    switch (op) {
                        case 1 -> {
                            userAcc.deposit(amount);
                            System.out.println("Done");
                        }
                        case 2 -> {
                            userAcc.depositSavings(amount);
                            System.out.println("Done");
                        }
                        default -> System.out.println("Invalid option");
                    }
                        break;


                    case 3:
                        System.out.println("---------------------------------");
                        System.out.println("\t\tWithdraw:");
                        System.out.print("Enter amount: ");
                        int am = input.nextInt();
                        userAcc.withdraw(am);
                        break;
                        
                    case 4:
                        System.out.println("---------------------------------");
                        System.out.println("\t\tTransfer From:");
                        System.out.println("1. Main Account");
                        System.out.println("2. Savings");
                        System.out.print("Select the option: ");
                        int opt = input.nextInt();
                        
                        System.out.print("Enter amount: ");
                        int amt = input.nextInt();
                        
                        switch (opt) {
                        case 1 -> {
                            userAcc.transfer(amt);
                            System.out.println("Done");
                        }
                        case 2 -> {
                            userAcc.transferSavings(amt);
                            System.out.println("Done");
                        }
                        default -> System.out.println("Invalid option");
                        
                    }
                        break;
                        
                    case 5:
                        System.out.println("---------------------------------");
                        System.out.println("\t\tAccount Balance:");
                        System.out.println("Main Account: " + userAcc.getAccBalance());
                        System.out.println("Savings Account: " + userAcc.getSavBalance());
                        
                        break;
                        
                    case 6:
                        System.out.println("""
                                           Thank you for using our bank.
                                           See you soon, Bye.""");
                        access = false;
                        break;
                        
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                        
                }
            }
        } else {
            System.out.println("Invalid User ID or PIN. Exiting." );
        }  
    }
    
}
