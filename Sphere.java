import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        this.radius = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
    }
}
