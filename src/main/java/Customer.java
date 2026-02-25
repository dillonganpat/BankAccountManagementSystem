public class Customer {

    //Attributes
    public String customerID;
    public String name;
    public String email;
    public String telephone;
    public BankAccount account;


    //Constructors
    //New Customer
    public Customer (String customerID, String name, String email, String telephone){
        this.customerID= customerID;
        this.name= name;
        this.email= email;
        this.telephone= telephone;
    }

    //Existing Customer
    public Customer (String customerID, String name, String email, String telephone, BankAccount account){
        this.customerID= customerID;
        this.name=name;
        this.email= email;
        this.telephone= telephone;
        this.account= account;
    }

    //Methods
    //Acessors
    public String getCustomerID(){
        return customerID;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getTelephone(){
        return telephone;
    }

    public BankAccount getAccount(){
        return account;
    }

    //Mutators
    public void setAccount(BankAccount account){
        this.account=account;
    }

    public boolean hasAccount (){
        return account != null;
    }

    public double getTotalBalance(){
        if (!hasAccount()){
            return 0;
        }
        return account.getBalance();
    }


    //toString
    public String toString(){
        return "Customer ID: " + customerID +"\n" + "Name: " + name +"\n" + "Email: " + email + "\n" + "Telephone: " + telephone;
    }


}


