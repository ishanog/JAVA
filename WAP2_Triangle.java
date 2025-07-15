
import java.util.Scanner;

class WAP2_Triangle {
    double base, height, area;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }

    void display() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
    }
    public static void main(String[] args){
        WAP2_Triangle var1 = new WAP2_Triangle();
      var1.getData();
      var1.calculateArea();
      var1.display();
    }
}
