
import java.util.Scanner;

class WAP9_IntAmount {
    double principle;
    float rate;
    int time;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        principle = sc.nextDouble();
        System.out.print("Enter rate: ");
        rate = sc.nextFloat();
        System.out.print("Enter time: ");
        time = sc.nextInt();
    }

    double interest() {
        return (principle * rate * time) / 100;
    }

    double amount() {
        return principle + interest();
    }
    public static void main(String[] args) {
        WAP9_IntAmount var1 = new WAP9_IntAmount();
        var1.getData();
        System.out.println("Interesr: "+var1.interest());
        System.out.println("Amount: "+var1.amount());
    }
}
