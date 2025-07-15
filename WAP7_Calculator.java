import java.util.*;
class WAP7_Calculator {
    int a, b;

    WAP7_Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int addition() { return a + b; }
    int subtraction() { return a - b; }
    int multiplication() { return a * b; }
    int division() { return a / b; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1= sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        WAP7_Calculator var1 = new WAP7_Calculator(num1, num2);
        System.out.println("Addition: "+var1.addition());
        System.out.println("Subtraction: "+var1.subtraction());
        System.out.println("Multiplication: "+var1.multiplication());
        System.out.println("Division: "+var1.division());
    }
}
