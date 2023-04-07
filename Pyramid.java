import java.util.Scanner;

public class Pyramid extends Shape implements Volume{
    public double b,l,h,p;
    public Pyramid(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the perimeter of base: ");
        this.p=scanner.nextDouble();
        System.out.println("Enter the height of cylinder:");
        this.h=scanner.nextDouble();
        System.out.println("Enter the slant height:");
        this.b=scanner.nextDouble();
        System.out.println("Enter the height:");
        this.h=scanner.nextDouble();
    }
    @Override
    public double calculateArea() {
        return b + (1/2.0)*p*l;
    }
    @Override
    public double calculateVolume() {
        return (1 / 3.0) * h * Math.pow(b, 2);
    }
}
