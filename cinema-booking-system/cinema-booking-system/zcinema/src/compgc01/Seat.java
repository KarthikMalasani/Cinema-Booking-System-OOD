package compgc01;

/**
 * A class represeting a single seat in the movie theatre.
 */
public class Seat {
    
    private char row;
    private int column;
    private boolean booked = false;
    
    public Seat(char row, int column, boolean booked) {
        if (row >= 'A' && row <= 'Z' && column > 0) {
            this.column = column;
            this.booked = booked;
        }
    }
    
    public Seat(char row, int column) {
        this (row, column, false);
    }
    
    public char getRow() {
        return row;
    }
    
    public int getColumn() {
        return column;
    }
    
    public String getLabel() {
        return row + String.valueOf(column);
    }
    
    public boolean getBookingStatus() {
        return booked;
    }
    
    public void setBookingStatus(boolean booked) {
        this.booked = booked;
    }
}