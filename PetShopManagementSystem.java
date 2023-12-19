import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pet {
    String name;
    String type;
    double price;
    int qnt;

    public Pet(String name, String type, double price, int qnt) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.qnt=qnt;
    }
}

class Customer {
    String name;
    List<Pet> purchasedPets;

    public Customer(String name) {
        this.name = name;
        this.purchasedPets = new ArrayList<>();
    }
}

public class PetShopManagementSystem {
    static List<Pet> availablePets = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static int transactionId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        while(n==0){

            initializePets();
            takeCustomerDetails();
            displayAvailablePets();
            sellPets();
            displayTransactionDetails();
            System.out.println("Enter 1 to exit or 0 to continue : ");
            n=scanner.nextInt();

        }
        
    }

    private static void initializePets() {
        availablePets.add(new Pet("Fluffy", "Dog", 500.0,10));
        availablePets.add(new Pet("Whiskers", "Cat", 300.0,20));
        availablePets.add(new Pet("Bubbles", "Fish", 50.0,15));
    }

    private static void takeCustomerDetails() {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter the number of customers:");
        int numCustomers = scanner.nextInt();

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("Enter details for Customer " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();

            customers.add(new Customer(name));
        }
    }

    private static void displayAvailablePets() {
        System.out.println("Available Pets:");
        for (Pet pet : availablePets) {
            System.out.println(pet.name + " - " + pet.type + " Rs " + pet.price);
        }
    }

    private static void sellPets() {
        Scanner scanner = new Scanner(System.in);

        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.name);
            System.out.println("Available Pets:");
            displayAvailablePets();

            System.out.print("Enter the name of the pet to purchase: ");
            String petName = scanner.next();

            Pet selectedPet = availablePets.stream().filter(pet -> pet.name.equals(petName)).findFirst().orElse(null);

            if (selectedPet != null) {
                customer.purchasedPets.add(selectedPet);
                //availablePets.remove(selectedPet);
                System.out.println("Pet purchased successfully!");
            } else {
                System.out.println("Pet not found. Please try again.");
            }
        }
    }

    private static void displayTransactionDetails() {
        System.out.println("\nTransaction Details:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.name);
            System.out.println("Purchased Pets:");
            for (Pet pet : customer.purchasedPets) {
                System.out.println(pet.name + " - " + pet.type + " - Rs " + pet.price);
            }
            System.out.println("Total Amount: Rs" + calculateTotalAmount(customer.purchasedPets));
            System.out.println("Transaction ID: " + transactionId++);
            System.out.println();
        }
    }

    private static double calculateTotalAmount(List<Pet> purchasedPets) {
        return purchasedPets.stream().mapToDouble(pet -> pet.price).sum();
    }
}

    

