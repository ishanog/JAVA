
class WAP6_TicketBooth {
    int peopleVisited = 0, ticketSold = 0;
    double moneyCollected = 0.0;
    final double ticketPrice = 2.5;

    void personVisited() {
        peopleVisited++;
    }

    void ticketSold() {
        ticketSold++;
        moneyCollected += ticketPrice;
    }

    void displayAll() {
        System.out.println("People Visited: " + peopleVisited);
        System.out.println("Ticket Sold: " + ticketSold);
        System.out.println("Money Collected: Rs. " + moneyCollected);
    }

    void displayTicketSummary() {
        System.out.println("Tickets Sold: " + ticketSold + ", Amount: Rs. " + moneyCollected);
    }
}
