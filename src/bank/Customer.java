package bank;

public class Customer {
    private String name;
    private long social;

    // if you don't add public/private/protected
    // then visibility defaults to the package
    Account defaultAccount;

    private static int numberOfCustomers = 0;

    // constructor
    public Customer(String name, long social) {
        this.name = name;
        this.social = social;
        defaultAccount = new Account();
        defaultAccount.owner = this;
        numberOfCustomers++;
    }

    // getter
    // gets the name of the instance
    // the absence of "static" means instance
    // instance means this object
    public String getName() {
        return name;
    }

    // static methods mean you're asking questions
    // or telling answers to the class
    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }
}
