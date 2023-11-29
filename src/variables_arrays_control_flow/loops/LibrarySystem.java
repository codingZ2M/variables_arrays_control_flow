package variables_arrays_control_flow.loops;

import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Variables for book details
        int availableBooks = 10; // Initial number of available books
        int borrowedBooks = 0;

        // Control Flow: Library Menu
        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Display Available Books");
            System.out.println("4. Exit");

            // Input: User choice
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            // Control Flow: Switch statement for user choice
            switch (choice) {
                case 1:
                    // Borrow a book
                    if (availableBooks > 0) {
                        System.out.println("Book borrowed successfully!");
                        availableBooks--;
                        borrowedBooks++;
                    } else {
                        System.out.println("Sorry, no books available for borrowing.");
                    }
                    break;

                case 2:
                    // Return a book
                    if (borrowedBooks > 0) {
                        System.out.println("Book returned successfully!");
                        availableBooks++;
                        borrowedBooks--;
                    } else {
                        System.out.println("You don't have any books to return.");
                    }
                    break;

                case 3:
                    // Display available books
                    System.out.println("Available Books: " + availableBooks);
                    System.out.println("Borrowed Books: " + borrowedBooks);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the Library System. Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
