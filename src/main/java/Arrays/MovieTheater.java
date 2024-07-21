package Arrays;

import java.util.Random;
import java.util.Scanner;

public class MovieTheater {
    int[][] arr = null;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    public MovieTheater(int numRows, int numCols) {
        this.arr = new int[numRows][numCols];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = 0; // Initialize all seats as not reserved
            }
        }
    }

    public void checkSeat(int row, int col) {
        if (arr[row][col] == 1) {
            System.out.println("Seat is reserved.");
        } else {
            System.out.println("Seat is free.");
        }
    }

    public boolean reserveSeat(int row, int col, boolean reserved) {
        try {
            if (arr[row][col] == -1) {
                System.out.println("Invalid selection, this is a hallway.");
                return false;
            } else if ((reserved && arr[row][col] == 0) || (!reserved && arr[row][col] == 1)) {
                arr[row][col] = reserved ? 1 : 0;
                if (reserved) {
                    System.out.println("This Seat is Reserved.");
                } else {
                    System.out.println("This Seat is free.");
                }
                return true;
            } else {
                System.out.println("Invalid selection, this seat is occupied, please try again.");
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Invalid Index for 2D Array.");
            return false;
        }
    }

    public void hallway() {
        for (int row = 0; row < arr.length; row++) {
            if (arr[row].length > 5) arr[row][5] = -1;
            if (arr[row].length > 6) arr[row][6] = -1;
        }
    }

    public void traverse() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == -1) {
                    System.out.print("_ ");
                } else if (arr[row][col] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    public void searchSeats(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Seat is found at row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Seat is not found.");
    }

    public void cancelReservation(int row, int col) {
        try {
            if (arr[row][col] == 1) {
                arr[row][col] = 0;
                System.out.println("Reservation cancelled successfully.");
            } else {
                System.out.println("Seat is not reserved.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array.");
        }
    }

    public void randomizeReservedSeating(int numSeatsToReserve) {
        int rows = arr.length;
        int cols = arr[0].length;
        int reservedCount = 0;

        while (reservedCount < numSeatsToReserve) {
            int row = random.nextInt(rows);
            int col = random.nextInt(cols);

            if (arr[row][col] == 0) { // Only reserve if the seat is not already reserved and not a hallway
                arr[row][col] = 1;
                reservedCount++;
            }
        }
    }

    public void displayWelcomeMessage() {
        System.out.println();
        System.out.println("Welcome to the Movie Marvel Theater!");
        System.out.println("Please find the seating chart below:");
        System.out.println("Legend - 0: Free Seat, X: Reserved Seat, _: Hallway");
        System.out.println();
    }

    public void performActions() {
        boolean success = false;
        while (!success) {
            System.out.println();
            traverse();               // Traverse the seat layout
            System.out.println();

            System.out.println("Please enter the row and column to reserve a seat:");
            System.out.println("Row: ");
            int row = input.nextInt();
            System.out.println("Column: ");
            int col = input.nextInt();

            if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length) {
                System.out.println("Invalid seat selection. Please try again.");
            } else {
                checkSeat(row, col);      // Check if the seat is reserved
                success = reserveSeat(row, col, true); // Reserve a seat
            }
        }

        System.out.println();
        System.out.println("Searching for a reserved seat:");
        searchSeats(1);           // Search for a reserved seat
        System.out.println();
        System.out.println("Searching for a free seat:");
        searchSeats(0);           // Search for a free seat

        System.out.println();
        traverse();               // Traverse the seat layout
        System.out.println();
    }

    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(5, 12);
        theater.hallway();                // Set up hallways
        theater.randomizeReservedSeating(10); // Randomly reserve 10 seats
        theater.displayWelcomeMessage();
        theater.performActions();

        // Additional tests
        System.out.println("Testing additional functionalities:");
        System.out.println();

        // Cancel a reservation
        System.out.println("Cancelling a reservation at (2, 3):");
        theater.reserveSeat(2, 3, true); // Reserve the seat first
        theater.cancelReservation(2, 3); // Now cancel it
        theater.traverse();
        System.out.println();

        // Test invalid index
        System.out.println("Trying to reserve an invalid index (6, 6):");
        theater.reserveSeat(6, 6, true);
        System.out.println();
    }
}
