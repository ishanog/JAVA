import java.util.*;
class WAP8_BoxParameterized {
    double width, height, depth;

    WAP8_BoxParameterized(double w, double h, double d) {
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
        System.out.println("Enter width: ");
        double w = sc.nextInt();
        System.out.println("Enter height: ");
        double h =sc.nextInt();
        System.out.println("Enter depth: ");
        double d = sc.nextInt();
        WAP8_BoxParameterized var1 = new WAP8_BoxParameterized(w, h, d);
        System.out.println("Area: "+var1.area());
        System.out.println("Volume: "+var1.volume());
    }
}
