
/**
 * This class represents the squares in the Sudoku board.
 */
public class Square {
    private int number;
    private char possible;
    private Box box = new Box();
    private int row;
    private int column;

    public Square(int number, char possible) {
        this.number = number;
        /*
         * 000000000
         * 987654321
         * (we can use a 9-bit integer, so for example if the number can be 1, 4, and 8 it would
         * be this: 010001001)
         */
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