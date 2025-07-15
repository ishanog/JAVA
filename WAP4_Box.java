import java.util.Scanner;

class WAP4_Box {
    double width, height, depth;

    WAP4_Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double area() {
        return 2 * (width * height + height * depth + width * depth);
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter depth: ");
        double d = sc.nextDouble();

        WAP4_Box var1 = new WAP4_Box(w, h, d); 

        System.out.println("Area: " + var1.area());
        System.out.println("Volume: " + var1.volume());
    }
}
