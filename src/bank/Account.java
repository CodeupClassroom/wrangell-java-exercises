package bank;

public class Account {
    double balance;
    String type;
    long accountNumber;
    Customer owner;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("You successfully deposited " + amount);
        System.out.println(balance());
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public String balance() {
        return "Your current balance is: " + balance;
    }
}
