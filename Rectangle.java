import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        this.width = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

}
