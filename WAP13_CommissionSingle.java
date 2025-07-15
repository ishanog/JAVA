import java.util.Scanner;

class WAP13_CommissionSingle {
    long salesAmount;
    double commissionRate;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        salesAmount = sc.nextLong();
    }

    void calculateCommissionRate() {
        if (salesAmount <= 100000) commissionRate = 10;
        else if (salesAmount <= 250000) commissionRate = 12;
        else if (salesAmount <= 500000) commissionRate = 15;
        else if (salesAmount <= 750000) commissionRate = 18;
        else commissionRate = 20;
    }

    void display() {
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission Rate: " + commissionRate + "%");
    }

    public static void main(String[] args) {
        WAP13_CommissionSingle var = new WAP13_CommissionSingle();
        var.getData();
        var.calculateCommissionRate();  // ✅ use renamed method
        var.display();                  // ✅ show results
    }
}
