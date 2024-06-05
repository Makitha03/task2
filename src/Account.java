public class Account
{
    private double balance;
    public Account()
    {
        this.balance = balance;
    }
    public Account(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }
    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
        else
        {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }
    public void display()
    {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args)
    {
        Account account1 = new Account();
        account1.display();
        account1.deposit(1000.0);
        account1.display();
        account1.withdraw(500.0);
        account1.display();


        Account account2 = new Account(2000.0);
        account2.display();


        account2.withdraw(1500.0);
        account2.display();
    }
}