
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// import java.util.Collections;
// import java.util.ArrayList;
// import java.util.List;

public class Hw6 {
    
    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of a two-dimensional array: ");
        int arrLength = input.nextInt();
        int[][] array = new int[2][arrLength];
        int max = 0;
        int no_of_rows = 2;
        int[] result = new int[no_of_rows];
        Random random = new Random();
        int i = 0;
        while (i < no_of_rows) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1000) + 1;
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            result[i] = max;
            max = 0;
            i++;
        }
        System.out.println("Random 2d-Array Elements from 0 to 1000: " + Arrays.deepToString(array));
        System.out.println("Max values 1d-array of each individual array : " + Arrays.toString(result));
        input.close();
        */

        /*
        // option 2 manyarrays inserted by user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of arrays: ");
        int first = scanner.nextInt();
        System.out.println("Enter the number of rows: ");
        int second = scanner.nextInt();
        int[][] manyArrays = new int[first][second];
        Random random = new Random();
        for (int i = 0; i < manyArrays.length; i++) {
            for (int k = 0; k < manyArrays[i].length; k++) {
                manyArrays[i][k] = random.nextInt(1000) + 1;
            }
        }
        System.out.println("Random 2d-Array Elements from 0 to 1000: " + Arrays.deepToString(manyArrays));
        
        int[] arrayResult = new int[manyArrays.length];
        for (int i = 0; i < manyArrays.length; i++) {
            int max = manyArrays[i][0];
            for (int k = 0; k < manyArrays[i].length; k++) {
                if (manyArrays[i][k] > max) {
                 max = manyArrays[i][k];
                }
                arrayResult[i] = max;
            }
        }
        System.out.println("Max values 1d-array of each individual array : " + Arrays.toString(arrayResult));
        scanner.close();
        */
    
        /////////////////////////////////////////////////////
        System.out.println("----------------------2----------------------");

        int[][] board = new int[5][5];
        int[][] ships = new int[3][2];
        int[] shoot = new int[2];
        int attempts = 0, shotHit = 0;

        initBoard(board);
        initShips(ships);

        System.out.println("All Set. Get ready to rumble!.");
        System.out.println();

        do {
            showBoard(board);
            shoot(shoot);
            attempts++;

            if (hit(shoot, ships)) {
                hint(shoot, ships, attempts);
                shotHit++;
            } else
                hint(shoot, ships, attempts);
                changeboard(shoot, ships, board);

        } while (shotHit != 3);
        System.out.println("\n\n\nYou have won! You hit 3 ships in " + attempts + " attempts");
        showBoard(board);
    }
    
    public static void initBoard(int[][] board) {
        for (int row = 0; row < 5; row++)
            for (int column = 0; column < 5; column++)
                board[row][column] = -1;
    }

    public static void showBoard(int[][] board) {
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();

        for (int row = 0; row < 5; row++) {
            System.out.print((row + 1) + "");
            for (int column = 0; column < 5; column++) {
                if (board[row][column] == -1) {
                    System.out.print("\t" + "~");
                } else if (board[row][column] == 0) {
                    System.out.print("\t" + "*");
                } else if (board[row][column] == 1) {
                    System.out.print("\t" + "X");
                }

            }
            System.out.println();
        }

    }

    public static void initShips(int[][] ships) {
        Random random = new Random();

        for (int ship = 0; ship < 3; ship++) {
            ships[ship][0] = random.nextInt(5);
            ships[ship][1] = random.nextInt(5);

            // check if that shot was already tried
            // if it was, just finish the do...while when a new pair was randomly selected
            for (int last = 0; last < ship; last++) {
                if ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]))
                    do {
                        ships[ship][0] = random.nextInt(5);
                        ships[ship][1] = random.nextInt(5);
                    } while ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]));
            }

        }
    }

    public static void shoot(int[] shoot) {
        Scanner input = new Scanner(System.in);

        System.out.print("Row: ");
        shoot[0] = input.nextInt();
        shoot[0]--;

        System.out.print("Column: ");
        shoot[1] = input.nextInt();
        shoot[1]--;
        
    }

    public static boolean hit(int[] shoot, int[][] ships) {

        for (int ship = 0; ship < ships.length; ship++) {
            if (shoot[0] == ships[ship][0] && shoot[1] == ships[ship][1]) {
                System.out.printf("You hit a ship located in (%d,%d)\n", shoot[0] + 1, shoot[1] + 1);
                return true;
            }
        }
        return false;
    }

    public static void hint(int[] shoot, int[][] ships, int attempt) {
        int row = 0, column = 0;

        for (int line = 0; line < ships.length; line++) {
            if (ships[line][0] == shoot[0])
                row++;
            if (ships[line][1] == shoot[1])
                column++;  
        }

        System.out.printf("\nHint %d: \nRow %d -> %d ships\n" +
                "Column %d -> %d ships\n", attempt, shoot[0] + 1, row, shoot[1] + 1, column);
    }

    public static void changeboard(int[] shoot, int[][] ships, int[][] board) {
        if (hit(shoot, ships))
            board[shoot[0]][shoot[1]] = 1;
        else
            board[shoot[0]][shoot[1]] = 0;
    }
    
}
