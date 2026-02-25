public class BankAccount {

    //Attributes
    public String accountNumber;
    public double balance;
    public String dateOpened;

    //Constructor
    public BankAccount(String accountNumber, double balance, String dateOpened) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateOpened = dateOpened;
    }

    //Accessors
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public boolean equals (Object obj){
        if (obj instanceof BankAccount){
            BankAccount other = (BankAccount) obj;
            return this.accountNumber.equals(other.accountNumber);
        }
        return false;
    }

    //toString
    public String toString (){
        return "Account Number: " +accountNumber + "\n" + "Balance: $" + balance + "\n" + "Date Opened: " +dateOpened;
    }


}
