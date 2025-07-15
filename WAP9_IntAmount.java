
import java.util.Scanner;

class WAP9_IntAmount {
    double p;
    float r;
    int t;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        p = sc.nextDouble();
        System.out.print("Enter rate: ");
        r = sc.nextFloat();
        System.out.print("Enter time: ");
        t = sc.nextInt();
    }

    double interest() {
        return (p * r * t) / 100;
    }

    double amount() {
        return p + interest();
    }
    public static void main(String[] args) {
        WAP9_IntAmount o = new WAP9_IntAmount();
        o.getData();
        System.out.println("Interest: "+o.interest());
        System.out.println("Amount: "+o.amount());
    }
}
