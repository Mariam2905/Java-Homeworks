package org.example.experiments.airplane;

import java.util.List;

public class Seat {
    private String seatNumber;
    private List<String> seats;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * This method print all the seat numbers.
     *
     * @param seatNumber;
     */
    public void printSeatNumbers(String seatNumber) {
        for (int i = 0; i < this.seatNumber.length(); i++) {
            System.out.println();
        }
    }
}
