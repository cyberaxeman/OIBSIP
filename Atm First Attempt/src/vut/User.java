package vut;

/**
 * A class to store the user details
 * @author Teboho
 */
public class User {
    
    private String userID;
    private String name;
    private String surname;
    private String pin;
    private double accBalance;
    private double savBalance;

    
    /**
     * Set the object to default values
     */
    public User() {
        this("none", "none", "none", "none", 
                0.00, 0.00);

    }

    /**
     * Create an object with the given data
     * @param userID The ID o the user
     * @param name The name of the user
     * @param surname The surname of the user
     * @param pin The pin of the user
     * @param accBalance Main account balance
     * @param savBalance Savings account balance
     */
    public User(String userID, String name, String surname, String pin, 
            double accBalance, double savBalance) {
        
        setUserID(userID);
        setName(name);
        setSurname(surname);
        setPin(pin);
        setAccBalance(accBalance);
        setSavBalance(savBalance);
    
    }
    
    /**
     * Change the user ID
     * @param userID The ID of the user
     */
    public void setUserID(String userID){
        this.userID = userID;
    }
    
    /**
     * Change the user name
     * @param name The name of the user
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Change the surname of the user
     * @param surname The surname of the user
     */
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    /**
     * Change the user pin
     * @param pin The pin of the user
     */
    public void setPin(String pin){
        this.pin = pin;
    
    }
    
    
    private void setAccBalance(double accBalance){
        this.accBalance = accBalance;
        
    }
    
   
    private void setSavBalance(double savBalance){
       this.savBalance = savBalance;
    }
    
    /**
     * Return the ID of the user
     * @return The user ID
     */
    public String getUserID(){
        return userID;
    }
    
    /**
     * Return the name of the user
     * @return The name of the user
     */
    public String getName(){
        return name;
    }
    
    /**
     * Return the surname of the user
     * @return The surname of the user
     */
    public String getSurname(){
        return surname;
    }
    
    /**
     * Return the user pin
     * @return The pin of the user
     */
    public String getPin(){
        return pin;
    }
    
    /**
     * Return the main account balance
     * @return The main account balance
     */
    public double getAccBalance(){
        return accBalance;
    }
    
    /**
     * Return the savings account balance
     * @return The savings account balance
     */
    public double getSavBalance(){
        return savBalance;
    }
    
    
    @Override
    public String toString(){
        return getClass().getName() + "UserID: " + userID + ", Full Name: "
                + surname +  " "+ name + ", Main Acc: " + accBalance + ", Savings acc: "
                + savBalance + ", Pin: " + pin;
        
    }

}
