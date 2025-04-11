import java.util.Scanner;
import java.util.Random;

class MovieTicket {
    private String movieName = "Avengers";
    private int[] seats;
    private double totalPrice = 0;
    private int bookedSeats = 0;
    private Scanner scn = new Scanner(System.in);
    private Random rand = new Random();

    void bookTicket() {
        System.out.println("How many seats?");
        int quan = scn.nextInt();

        if (quan <= 0) {
            System.out.println("Invalid number of seats.");
            return;
        }

        seats = new int[quan];
        int pricePerSeat = 100;
        
        for (int i = 0; i < quan; i++) {
            seats[i] = rand.nextInt(100) + 1;  
        }

        totalPrice = quan * pricePerSeat;
        bookedSeats = quan;

        System.out.println("Tickets Booked!");
        displayTickets();
    }

    void displayTickets() {
        if (bookedSeats == 0) {
            System.out.println("No tickets booked yet!");
            return;
        }

        System.out.println("Movie: " + movieName);
        System.out.print("Seat Numbers: ");
        for (int i = 0; i < bookedSeats; i++) {
            System.out.print(seats[i] + " ");
        }
        System.out.println("\nTotal Cost: $" + totalPrice);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        while (true) {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Show Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scn.nextInt();
            switch (choice) {
                case 1:
                    ticket.bookTicket();
                    break;
                case 2:
                    ticket.displayTickets();
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
