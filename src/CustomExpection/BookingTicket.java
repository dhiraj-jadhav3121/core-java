package CustomExpection;

public class BookingTicket {
    public static void main(String[] args) throws BookingLimitExceededException {
        int tickets = 10;
        final int Max_ticket = 100;
        if (tickets > Max_ticket) {
            throw new BookingLimitExceededException("Booking failed !!!!");
        } else {
            System.out.println("Successfully booked ");
        }

    }
}

class BookingLimitExceededException extends Exception {
    public BookingLimitExceededException(String massage) {
        super(massage);

    }
}