public abstract class karma {
    
}import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pet {
    private String name;
    private int quantity;

    public Pet(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class PetShop {
    private Map<String, Pet> inventory;

    public PetShop() {
        this.inventory = new HashMap<>();
    }

    public void addPet(String name, int quantity) {
        Pet pet = new Pet(name, quantity);
        inventory.put(name, pet);
    }

    public void displayInventory() {
        System.out.println("Pet Inventory:");
        for (Pet pet : inventory.values()) {
            System.out.println(pet.getName() + ": " + pet.getQuantity());
        }
        System.out.println();
    }

    public void buyPet(String name, int quantity) {
        if (inventory.containsKey(name)) {
            Pet pet = inventory.get(name);
            if (pet.getQuantity() >= quantity) {
                pet.setQuantity(pet.getQuantity() - quantity);
                System.out.println("You have successfully bought " + quantity + " " + name + "(s).");
            } else {
                System.out.println("Sorry, not enough " + name + " in stock.");
            }
        } else {
            System.out.println(name + " is not available in the inventory.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();

        // Add some initial pets to the inventory
        petShop.addPet("Dog", 10);
        petShop.addPet("Cat", 15);
        petShop.addPet("Fish", 20);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display Inventory");
            System.out.println("2. Buy Pet");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    petShop.displayInventory();
                    break;
                case 2:
                    System.out.print("Enter the name of the pet you want to buy: ");
                    String petName = scanner.next();
                    System.out.print("Enter the quantity: ");
                    int buyQuantity = scanner.nextInt();
                    petShop.buyPet(petName, buyQuantity);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

