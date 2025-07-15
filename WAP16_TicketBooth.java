import java.util.*;

class WAP16_TicketBooth {
    int peopleVisited = 0, ticketSold = 0;
    double moneyCollected = 0.0;
    final double ticketPrice = 2.5;

    void personVisited() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people visited: ");
        int n = sc.nextInt();
        peopleVisited += n;
        ticketSold += n;  
        moneyCollected += n * ticketPrice;
    }

    void displayAll() {
        System.out.println("Ticket Booth Summary");
        System.out.println("People Visited: " + peopleVisited);
        System.out.println("Tickets Sold: " + ticketSold);
        System.out.println("Money Collected: Rs. " + moneyCollected);
    }

    void displayTicketSummary() {
        System.out.println("\nTickets Sold: " + ticketSold + ", Amount: Rs. " + moneyCollected);
    }

    public static void main(String[] args) {
        WAP16_TicketBooth obj = new WAP16_TicketBooth();
        obj.personVisited();        // Get people count from user
        obj.displayAll();           // Display all data
        obj.displayTicketSummary(); // Display summary only
    }
}
