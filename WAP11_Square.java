import java.util.*;
class WAP11_Square {
    int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        WAP11_Square var = new WAP11_Square();
        int result = var.square(n);
        System.out.println("Result: "+result);
    }
}
