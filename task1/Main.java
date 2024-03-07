import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mhaa", "jensen","mhaa1234"));
        printCustomers(customers); //har kaldt den med min arrayliste
    }
    public static void printCustomers(ArrayList<Customer> customers) {

        for ( Customer customer:customers)
            System.out.println(customer);

    }

}
