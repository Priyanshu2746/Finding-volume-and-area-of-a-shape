import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
