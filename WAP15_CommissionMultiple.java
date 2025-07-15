import java.util.Scanner;

class WAP15_CommissionMultiple {
    long[] sales = new long[10];
    double totalCommission = 0;

    void getData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter sales for person " + (i + 1) + ": ");
            sales[i] = sc.nextLong();
        }
    }

    double getRate(long amount) {
        if (amount <= 20000) return 10;
        else if (amount <= 50000) return 15;
        else return 20;
    }

    void calcCommission() {
        for (int i = 0; i < 10; i++) {
            double rate = getRate(sales[i]);
            double commission = (sales[i] * rate) / 100;
            System.out.println("Commission for person " + (i + 1) + ": " + commission);
            totalCommission += commission;
        }
        System.out.println("Total Commission for all salespersons: " + totalCommission);
    }

    public static void main(String[] args) {
        WAP15_CommissionMultiple obj = new WAP15_CommissionMultiple();
        obj.getData();
        obj.calcCommission(); // Added this line to perform the actual commission calculation
    }
}
