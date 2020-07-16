import java.util.Random;
public class BankAccount {
    // member variables
    private String accountNumber;
    private double checkingsBalance;
    private double savingsBalance;
    
    // static variables
    public static int totalBanksBankAccounts;
    public static double totalBanksMoney;
    
    //constructor
    public BankAccount() {
        this.accountNumber = BankAccount.populateRandomBankAccount();
        this.checkingsBalance = 0;
        this.savingsBalance = 0;
        totalBanksBankAccounts++;
        totalBanksMoney += (this.checkingsBalance + this.savingsBalance);
    }
    private static String populateRandomBankAccount() {
        String newAccount = "";
        Random number = new Random();
        for(int index = 0; index < 11; index++) {
            newAccount += number.nextInt(10);
        }
        return newAccount;
    }

    //getters
    public double getCheckingsBalance() {
        return this.checkingsBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void depositMoney(double depositAmount, String selectedAccount) {
        if(selectedAccount == "checkingsBalance") {
            System.out.println(String.format("Checking Account Balance: %.2f, Deposit Amount: %.2f", this.checkingsBalance, depositAmount));
            this.checkingsBalance += depositAmount;
            System.out.println(String.format("Checking Account Balance: %.2f, Your deposit of %.2f was successful!", this.checkingsBalance, depositAmount));
            BankAccount.totalBanksMoney += depositAmount;
        } 
        else if(selectedAccount.equals("savingsBalance")) {
            System.out.println(String.format("Saving Account Balance: %.2f, Deposit Amount: %.2f", this.savingsBalance, depositAmount));
            this.savingsBalance += depositAmount;
            System.out.println(String.format("Saving Account Balance: %.2f, Your deposit of %.2f was successful!", this.savingsBalance, depositAmount));
            BankAccount.totalBanksMoney += depositAmount;
        }
        else {
            System.out.println("Not a valid Account");
        }
    }

    public void withdrawlMoney(double withdrawlAmount, String selectedAccount) {
        boolean amountAvailable = false;
        if(selectedAccount.equals("checkingsBalance")) {
            if(this.checkingsBalance - withdrawlAmount > 0){
                amountAvailable = true;
                System.out.println(String.format("Checking Account Balance: %.2f, Withdrawl Amount: %.2f", this.checkingsBalance, withdrawlAmount));
                this.checkingsBalance -= withdrawlAmount;
                System.out.println(String.format("Checking Account Balance: %.2f, Your withdrawl of %.2f was successful!", this.checkingsBalance, withdrawlAmount));
            } else {
                System.out.println(String.format("Checking Account Balance: %.2f, Your withdrawl of %.2f was unsuccessful!", this.checkingsBalance, withdrawlAmount));
            }
        } else if(selectedAccount == "savingsBalance") {
            if(this.savingsBalance - withdrawlAmount > 0) {
                amountAvailable = true;
                System.out.println(String.format("Saving Account Balance: %.2f, Withdrawl Amount: %.2f", this.savingsBalance, withdrawlAmount));
                this.savingsBalance -= withdrawlAmount;
                System.out.println(String.format("Saving Account Balance: %.2f, Your withdrawl of %.2f was successful!", this.savingsBalance, withdrawlAmount));
            } else {
                System.out.println(String.format("Saving Account Balance: %.2f, Your withdrawl of %.2f was Unsuccessful!", this.savingsBalance, withdrawlAmount));
            }
        } else {
            System.out.println("Not a valid Account");
        }
        if(amountAvailable) {
            System.out.println(String.format("Bank Reserve Balance: %.2f, Before withdrawl of %.2f !", BankAccount.totalBanksMoney, withdrawlAmount));            
            BankAccount.totalBanksMoney -= withdrawlAmount;
            System.out.println(String.format("Bank Reserve Balance: %.2f, After withdrawl of %.2f !", BankAccount.totalBanksMoney, withdrawlAmount));            
        }
    }

    public void displayAccount() {
        System.out.println(String.format("Checkings Account: %.2f, Savings Account: %.2f, Bank Account Number: %s", this.checkingsBalance, this.savingsBalance, this.accountNumber));
    }

}