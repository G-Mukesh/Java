import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Medicine {
    String name;
    double price;
    int quantity;
    int phonenumber;

    public Medicine(String name, double price, int quantity,int phonenumber) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.phonenumber = phonenumber;
        
    }
}

class Customer {
    String name;
    int phonenumber;
    List<Medicine> purchasedMedicines;

    public Customer(String name,int phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.purchasedMedicines = new ArrayList<>();
    }
}

public class PharmacyManagementSystem {
    static List<Medicine> availableMedicines = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static int transactionId = 1;

    public static void main(String[] args) {
        initializeMedicines();
        takeCustomerDetails();
        displayAvailableMedicines();
        sellMedicines();
        displayTransactionDetails();
    }

    private static void initializeMedicines() {
        availableMedicines.add(new Medicine("Paracetamol", 5.0, 50));
        availableMedicines.add(new Medicine("Aspirin", 3.0, 40));
        availableMedicines.add(new Medicine("Antibiotic", 10.0, 30));
    }

    private static void takeCustomerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of customers:");
        int numCustomers = scanner.nextInt();

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("Enter details for Customer " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.println("Enter phone number : ");
	    int phonenumber = nextInt();
            


            customers.add(new Customer(name,phonenumber));
        }
    }

    private static void displayAvailableMedicines() {
        System.out.println("Available Medicines:");
        for (Medicine medicine : availableMedicines) {
            System.out.println(medicine.name + " - $" + medicine.price + " - Quantity: " + medicine.quantity);
        }
    }

    private static void sellMedicines() {
        Scanner scanner = new Scanner(System.in);

        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.name);
            System.out.println("Available Medicines:");
            displayAvailableMedicines();

            System.out.print("Enter the name of the medicine to purchase: ");
            String medicineName = scanner.next();

            Medicine selectedMedicine = availableMedicines.stream()
                    .filter(medicine -> medicine.name.equals(medicineName))
                    .findFirst()
                    .orElse(null);

            if (selectedMedicine != null) {
                System.out.print("Enter the quantity to purchase: ");
                int quantityToPurchase = scanner.nextInt();

                if (quantityToPurchase <= selectedMedicine.quantity) {
                    selectedMedicine.quantity -= quantityToPurchase;
                    customer.purchasedMedicines.add(new Medicine(selectedMedicine.name, selectedMedicine.price, quantityToPurchase));
                    System.out.println("Medicine purchased successfully!");
                } else {
                    System.out.println("Insufficient stock. Please try again.");
                }
            } else {
                System.out.println("Medicine not found. Please try again.");
            }
        }
    }

    private static void displayTransactionDetails() {
        System.out.println("\nTransaction Details:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.name);
            System.out.println("Purchased Medicines:");
            for (Medicine medicine : customer.purchasedMedicines) {
                System.out.println(medicine.name + " - $" + medicine.price + " - Quantity: " + medicine.quantity);
            }
            System.out.println("Total Amount: $" + calculateTotalAmount(customer.purchasedMedicines));
            System.out.println("Transaction ID: " + transactionId++);
            System.out.println();
        }
    }

    private static double calculateTotalAmount(List<Medicine> purchasedMedicines) {
        return purchasedMedicines.stream().mapToDouble(medicine -> medicine.price * medicine.quantity).sum();
    }
}

    

