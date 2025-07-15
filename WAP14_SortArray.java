
import java.util.Scanner;
import java.util.Arrays;

class WAP14_SortArray {
    int[] n;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        n = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }
    }

    void sort() {
        Arrays.sort(n);
    }

    void displayData() {
        System.out.println("Sorted elements: ");
        for (int i : n)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        WAP14_SortArray var = new WAP14_SortArray();
        var.getData();
        var.sort();
        var.displayData();
    }
}
