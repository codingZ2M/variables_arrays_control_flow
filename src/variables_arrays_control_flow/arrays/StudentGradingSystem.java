package variables_arrays_control_flow.arrays;

import java.util.Scanner;

public class StudentGradingSystem {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Variables for student details
        int numStudents;
        String[] studentNames;
        int[] studentGrades;
        double averageGrade;
        int highestGrade;

        // Input: Get the number of students
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        // Array initialization for student details
        studentNames = new String[numStudents];
        studentGrades = new int[numStudents];

        // Input: Get details for each student
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter the grade for " + studentNames[i] + ": ");
            studentGrades[i] = scanner.nextInt();
        }

        // Calculate average grade
        averageGrade = calculateAverage(studentGrades);

        // Find the highest grade
        highestGrade = findHighestGrade(studentGrades);

        // Output: Display statistics
        System.out.println("\nStudent Grading Statistics:");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade);

        // Close the scanner
        scanner.close();
    }

    // Helper method to calculate average grade
    private static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Helper method to find the highest grade
    private static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
}

