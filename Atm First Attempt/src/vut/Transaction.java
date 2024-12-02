package vut;

/**
 * A class to store transactions
 * @author Teboho
 */
public class Transaction {
    
    private String type;
    private double amount;
    
    /**
     * Set the object to default values
     */
    public Transaction(){
        this("none", 00.0);
        
    }
    
    /**
     * Create an object with the given data
     * @param type Transaction type
     * @param amount Amount in the transaction 
     */
    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
    
    @Override
    public String toString(){
        return type + " R" + amount;
    }
    
    
    
}
