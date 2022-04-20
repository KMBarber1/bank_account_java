import java.util.ArrayList;



public class BankAccount {



    // Attributes
    private double checkingBalance;
    private double savingsBalance;



    // Static
    static int accountsCreated = 0;
    static double moneyStored = 0;




    // Constructor
    public BankAccount() {
        this.accountsCreated++;

    }



    // Getter - Checking Account 
    public double getCheckingBalance(){
        return this.checkingBalance;

    }



    // Getter - Savings Account
    public double getSavingsBalance(){
        return this.savingsBalance;

    }



    // Getter - Money Stored
    public double getMoneyStored(){
        return this.moneyStored;

    }



    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void depositMoney(String account, double amount) {
        if(account.equals("checking")){
            this.checkingBalance += amount;
            moneyStored += amount;
        }else if(account.equals("savings")){
            this.savingsBalance += amount;
            moneyStored += amount;
        }else{
            System.out.println("Must be a Checking or Savings Account!");
        }

    } 



    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawMoney(String account, double amount) {
        if(account.equals("checking")){
            if((this.checkingBalance - amount) >= 0) {
                this.checkingBalance -= amount;
                this.moneyStored -= amount; 
            } else {
                System.out.println("Insufficient funds");
            }

        } else if (account.equals("savings")) {
            if((this.savingsBalance - amount) >= 0) {
                this.savingsBalance -= amount;
                this.moneyStored -= amount; 
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Must be a Checking or Savings Account!");
        }

    }


    // Create a method to see the total money from the checking and saving.
    public double getBalanceAndTotal() {
        System.out.println("Checking balance is: " + getCheckingBalance());
        System.out.println("Savings balance is: " + getSavingsBalance());
        System.out.println("Total balance in the bank is : " + (getCheckingBalance() + getSavingsBalance()));
        return this.moneyStored;
    }

}