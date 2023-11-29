package variables_arrays_control_flow.variables;

import java.util.Scanner;

public class InventorySystem {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Variables for item details
        String itemName;
        int itemQuantity;
        double itemPrice;
        boolean isInStock;

        // Input: Get item details from the user
        System.out.print("Enter the name of the item: ");
        itemName = scanner.nextLine();

        System.out.print("Enter the quantity of " + itemName + " in stock: ");
        itemQuantity = scanner.nextInt();

        System.out.print("Enter the price of " + itemName + " per unit: $");
        itemPrice = scanner.nextDouble();

        // Calculate total value of the item in stock
        double totalValue = itemQuantity * itemPrice;

        // Determine if the item is in stock
        isInStock = itemQuantity > 0;

        // Output: Display item details
        System.out.println("\nItem Details:");
        System.out.println("Name: " + itemName);
        System.out.println("Quantity in stock: " + itemQuantity);
        System.out.println("Price per unit: $" + itemPrice);
        System.out.println("Total value in stock: $" + totalValue);
        System.out.println("Is in stock: " + isInStock);

        // Close the scanner
        scanner.close();
    }
}

