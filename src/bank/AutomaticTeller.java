package bank;
import java.util.Scanner;

public class AutomaticTeller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Initially, we have " + Customer.getNumberOfCustomers() + " number of customers");

        System.out.println("What is your name?");
        String name = scan.next();

        System.out.println("What is your social security number?");
        long social = scan.nextLong();

        Customer newCustomer = new Customer(name, social);

        System.out.println("What kind of account do you want");
        String type = scan.next();

        newCustomer.defaultAccount.type = type;

        System.out.println("Currently, we have " + Customer.getNumberOfCustomers() + " number of customers");

        Customer anotherCustomer = new Customer("Jane", 456788765);

        System.out.println("Currently, we have " + Customer.getNumberOfCustomers() + " number of customers");
        System.out.println(anotherCustomer.getNumberOfCustomers());


        System.out.println(newCustomer.defaultAccount.owner.getName());


    }


}
