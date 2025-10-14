/**
 * This class represents the squares in the Sudoku board.
 */
public class Square {
    private int number;
    private char possible;

    public Square(int number, char possible) {
        this.number = number;
        this.possible = possible;
    }

    public Square() {
        this(0, (char) 0);  // default empty cell
    }

    //getter and setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getPossible() {
        return possible;
    }

    public void setPossible(char possible) {
        this.possible = possible;
    }
}