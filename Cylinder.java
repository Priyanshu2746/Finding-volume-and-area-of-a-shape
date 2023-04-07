import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    public Cylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        this.radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        this.height = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    @Override
    public double calculateVolume() {
        return 2 * Math.PI * Math.pow(radius, 2) * height;
    }
}
