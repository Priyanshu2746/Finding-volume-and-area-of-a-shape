# Shape Calculator
java_assignment5
This is a Java program that calculates the area and volume of various shapes. The program is menu-driven, and the user can choose which shape to calculate the area and volume for.

Shape Classes
The program has the following shape class

R
Sphere
Cylinder
Pyramid
All of these classes extend the Shape class, which is an abstract class that defines the calculatePerimeter and calculateArea methods. The Cylinder class also implements the Volume interface, which defines the calculateVolume method.

Usage
To use the program, run the Main class. This will display a menu of shapes that the user can choose from. Once the user selects a shape, they will be prompted to enter the necessary measurements for that shape (e.g. radius, height, etc.). The program will then calculate and display the area and volume of the selected shape.

Example
Here's an example of how to use the program:

Welcome to the Shape Calculator!

Please select a shape to calculate:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Pyramid

Enter your choice: 5

You have selected the Cylinder.

Enter the radius of Cylinder: 3
Enter the height of Cylinder: 5

The perimeter of Cylinder is 56.548667764616276
The area of Cylinder is 141.3716694115407
The volume of Cylinder is 141.3716694115407
In this example, the user selects the Cylinder shape and enters the necessary measurements. The program then calculates and displays the perimeter, area, and volume of the cylinder.
