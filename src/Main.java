public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());


        Customer secondcCustomer = new Customer("Bob", "bob@user.com");
        System.out.println(secondcCustomer.getName());
        System.out.println(secondcCustomer.getCreditLimit());
        System.out.println(secondcCustomer.getEmailAddress());


        Customer thirdCustomer = new Customer("test", 80000, "test@emailcom");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
    }
}
