
import java.util.Scanner;

class WAP5_Sphere {
    double r;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
    }

    double area() {
        return 4 * Math.PI * r * r;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    void displayData() {
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
    public static void main(String[] args) {
        WAP5_Sphere var1 = new WAP5_Sphere();
        var1.getData();
        var1.area();
        var1.volume();
        var1.displayData();
    }
}
