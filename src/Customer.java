public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("user", 50000, "user@user.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 40000, emailAddress);
//        this.name = name;
//        this.emailAddress = emailAddress;
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
