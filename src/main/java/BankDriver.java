public class BankDriver {
    public static void main(String[] args) {

        //Create Customer Objects
        Customer customer1= new Customer("C001", "Jake Peralta", "jakeperalta@gmail.com", "225-5432");
        Customer customer2= new Customer("C002", "Amy Santiago", "amysantiago@outlook.com", "234-7939");

        //Create BankAccount Objects
        BankAccount acc1= new BankAccount("A001", 500.00, "12/10/2010");
        BankAccount acc2= new BankAccount("A002", 25000.00, "9/7/2018");

        //Assign accounts to customers
        customer1.setAccount(acc1);
        customer2.setAccount(acc2);

        //Deposit
        acc1.deposit(1000.00);
        System.out.println ("Account 1 balance: " + acc1.getBalance());

        acc2.deposit(500.00);
        System.out.println("Account 2 balance: " +acc2.getBalance());


        //Withdraw
        acc1.withdraw(40.00);
        acc2.withdraw(100);

        //Equals
        BankAccount acc3= new BankAccount ("C001", 8000.00, "12/10/2006");
        System.out.println("acc1 equals acc3?" + acc1.equals(acc3));

        //Print detail of a customer and their accounts
        System.out.println("Customer Details: ");
        System.out.println(customer1);
        System.out.println(customer2);

    }
}
