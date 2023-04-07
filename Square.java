import java.util.Scanner;

public class Square extends Shape {
    private double side;

    public Square() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a side of the square: ");
        this.side = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side, 2);
    }

}
