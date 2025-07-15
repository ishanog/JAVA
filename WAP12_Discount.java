
import java.util.Scanner;

class WAP12_Discount {
    double purchaseAmount, discountRate, discountAmount;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        purchaseAmount = sc.nextDouble();
    }

    void calculateDiscount() {
        if (purchaseAmount <= 10000) discountRate = 10;
        else if (purchaseAmount <= 25000) discountRate = 12;
        else if (purchaseAmount <= 50000) discountRate = 15;
        else discountRate = 20;
        discountAmount = (purchaseAmount * discountRate) / 100;
    }

    void displayData() {
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: " + discountAmount);
    }
    public static void main(String[] args) {
        WAP12_Discount var = new WAP12_Discount();
        var.getData();
        var.calculateDiscount();
        var.displayData();
    }
}
