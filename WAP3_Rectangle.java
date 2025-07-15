
import java.util.Scanner;

class WAP3_Rectangle {
    int length, breadth;

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
    public static void main(String[] args){
        WAP3_Rectangle var1 = new WAP3_Rectangle();
        var1.readData();
        var1.area();
        var1.perimeter();
        var1.display();
    }
}
