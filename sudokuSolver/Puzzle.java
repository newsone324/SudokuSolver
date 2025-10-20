public class Puzzle {
    
public static int[][] createPuzzle()
    {
        int[][] puzzle = {{0, 0, 0,         5, 0, 7,        0, 0, 0},
                       {0, 4, 0,         2, 6, 3,        0, 0, 0},
                       {1, 0, 7,         4, 0, 0,        0, 0, 0},
                       
                       {3, 6, 0,         0, 0, 0,        0, 4, 5},
                       {0, 0, 2,         0, 5, 0,        7, 0, 0},
                       {7, 9, 0,         0, 0, 0,        0, 6, 2},
                       
                       {0, 0, 0,         0, 0, 9,        4, 0, 1},
                       {0, 0, 0,         1, 3, 4,        0, 9, 0},
                       {0, 0, 0,         6, 0, 5,        0, 0, 0}};
        return puzzle;
    }

    public static void printPuzzle(int[][] puzzle)
    {
            int i, j;

        System.out.printf("-------------------------------\n");
        //loop through the puzzle
        for (i = 0; i < 9; i++)
        {
            System.out.printf("|");
            //print each row
            for (j = 0; j < 9; j++)
            {
                System.out.printf(" %d ", puzzle[i][j]);

                if ((j + 1) % 3 == 0)
                {
                    System.out.printf("|");
                }
                
            }
            System.out.printf("\n");

            if ((i + 1)% 3 == 0)
            {
                System.out.printf("-------------------------------\n");
            }
        }
    }

    public static Square setUpPuzzle(Puzzle puzzle)
    {   
        Square sudoku = new Square();
        int i, j;
        return sudoku;
    }
}
