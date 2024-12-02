package vut;

/**
 * A class to store the account details
 * @author Teboho
 */
public class Account {
    
    private double accBalance;
    private double savBalance;
    private TransactionHistory transactionHistory;;
    
    /**
     * Set the object to default values
     */
    public Account(){
        this(0.00, 0.00);
    }
    
    /**
     * Create an object with the given data
     * @param accBalance The main account balance
     * @param savBalance The savings account balance
     */
    public Account(double accBalance, double savBalance){
        setAccBalance(accBalance);
        setSavBalance(savBalance);
        this.transactionHistory = new TransactionHistory();
    }
    
    /**
     * Return the Main account balance
     * @return The main account balance
     */
    public double getAccBalance(){
        return accBalance;
    }
    
    /**
     * Return the Savings account balance
     * @return The savings account balance
     */
    public double getSavBalance(){
        return savBalance;
    }
    
    private void setAccBalance(double accBalance){
        this.accBalance = accBalance;
    }
    private void setSavBalance(double savBalance){
        this.savBalance = savBalance;
    }
    
    /**
     * Withdraw the amount
     * @param amount The amount that will be withdrawn
     */
    public void withdraw(double amount){
        if (amount <= accBalance){
            accBalance = accBalance - amount;
            System.out.println("Available balance: " + accBalance);
            transactionHistory.addTransaction(new Transaction("Withdraw", amount));
        } else {
            System.out.println("Invalid, the amount cannot be greater than the available balance");
        }
    }
    
    /**
     * Deposit the amount to the main account
     * @param amount The amount to be deposited
     */
    public void deposit(double amount){
        if (amount > 0){
            accBalance = accBalance + amount;
            System.out.println("Available balance: " + accBalance);
            transactionHistory.addTransaction(new Transaction("Deposit", amount));
        } else {
            System.out.println("Invalid, the amount cannot be negative");
        }
    }
    
   /**
    * Deposit the amount to the savings account
    * @param amount The amount to be deposited
    */
    public void depositSavings(double amount){
        if (amount > 0){
            savBalance = savBalance + amount;
            System.out.println("Available balance: " + savBalance);
            transactionHistory.addTransaction(new Transaction("Deposit", amount));
        } else {
            System.out.println("Invalid, the amount cannot be negative");
        }
    }
    
    /**
     * Transfer the amount from the main to savings
     * @param amount The amount to be transferred
     */
    public void transfer(double amount){
        if (amount <= accBalance){
            accBalance = accBalance - amount;
            savBalance = savBalance + amount; 
            transactionHistory.addTransaction(new Transaction("Transfer", amount));
        }
    }
    /**
     * Transfer the amount from the savings to the main
     * @param amount The amount to be transferred
     */
    public void transferSavings(double amount){
        if (amount <= savBalance){
            savBalance = savBalance - amount;
            accBalance = accBalance + amount;
            transactionHistory.addTransaction(new Transaction("Transfer", amount));
        }
    }
    
    /**
     * Return the Transaction history
     * @return The Transaction history
     */
    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "Main Account: " + accBalance + "Savings: "
                + savBalance;
    }
}
