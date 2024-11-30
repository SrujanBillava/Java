package Assignment;

public class Customer {
    private int id;
    private double balance;
    private String firstName;
    private String lastName;

    public Customer() {
        id=-1;
        balance=-1;
        firstName="N_A";
        lastName="N_A";
    }

    public Customer(int id, double balance, String firstName, String lastName) {
        this.id = id;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{ID=" + id + ", Balance=" + balance +
                ", First Name='" + firstName + "', Last Name='" + lastName + "'}";
    }
}
