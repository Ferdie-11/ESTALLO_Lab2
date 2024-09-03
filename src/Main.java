import java.util.Scanner;

// Base class
class Cylinder {
    double radius;
    double height;

    // Method to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
    }

    // Method to compute the area
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Derived class
class CylinderVol extends Cylinder {

    // Method to compute the volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        CylinderVol cylinderVol = new CylinderVol();
        cylinderVol.getInput();
        System.out.println("Area of the cylinder: " + cylinderVol.area());
        System.out.println("Volume of the cylinder: " + cylinderVol.volume());
    }
}