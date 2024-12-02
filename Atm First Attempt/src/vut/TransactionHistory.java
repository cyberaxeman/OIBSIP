package vut;

import java.util.ArrayList;
import java.util.List;

/**
 * create a class to store transaction history
 * @author Teboho
 */
public class TransactionHistory {
    
    private List<Transaction> transactions;

    /**
     * Set the object to default values
     */
    public TransactionHistory() {
        transactions = new ArrayList<>();
    }

    /**
     * Add transaction to the list
     * @param transaction The transaction
     */
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    /**
     * Display the history in the screen
     */
    public void printHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}
    

