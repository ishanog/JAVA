import java.util.Scanner;

class WAP01_Circle {
    double radius, area;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        WAP01_Circle circle = new WAP01_Circle(); // Create object
        circle.getData();                       // Take input
        circle.calculateArea();                 // Calculate area
        circle.display();                       // Display result
    }
}
