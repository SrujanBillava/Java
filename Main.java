package Assignment;
import Assignment.Customer.* ;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer(3, 2500.00, "Ram", "Singh"),
                new Customer(1, 3000.00, "Ramesh", "Kumar"),
                new Customer(2, 1500.00, "Aditya", "Sen"),
                new Customer(4, 4000.00, "Aman", "Gupta")
        };
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("Before setting: ");
        Customer c1=new Customer();
        System.out.println(c1);
        System.out.println("After setting values: ");
        c1.setId(5);
        c1.setBalance(5000.00);
        c1.setFirstName("Stephen");
        c1.setLastName("Hawking");
        System.out.println(c1);
    }
}
