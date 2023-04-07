import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape;

        // Welcome message
        System.out.println("Welcome to the Shape Calculator!");

        while (true) {
            // Display menu of shapes
            System.out.println("\nPlease select a shape from the following options:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("0. Exit");

            // Get user's choice
            int choice = scanner.nextInt();

            if (choice == 0) {
                // Exit program
                System.out.println("Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    // Create a new Circle object
                    shape = new Circle();
                    break;
                case 2:
                    // Create a new Rectangle object
                    shape = new Rectangle();
                    break;
                case 3:
                    // Create a new Square object
                    shape = new Square();
                    break;
                case 4:
                    // Create a new Sphere object
                    shape = new Sphere();
                    break;
                case 5:
                    // Create a new Cylinder object
                    shape = new Cylinder();
                    break;
                case 6:
                    // Create a new Pyramid object
                    shape = new Pyramid();
                    break;
                default:
                    // Invalid choice, prompt user to try again
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }
            // Calculate and display the area of the selected shape
            double area = shape.calculateArea();
            System.out.println("The area is: " + area);

            // If the shape implements the Volume interface, calculate and display the volume
            if (shape instanceof Volume) {
                Volume volumeShape = (Volume) shape;
                double volume = volumeShape.calculateVolume();
                System.out.println("The volume is: " + volume);
            }
        }
    }
}
