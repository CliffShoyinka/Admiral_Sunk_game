import java.util.Random;
import java.util.Scanner;

public class AdmiralSunkGame {

    private final int[][] grid;
    private final int numShips;
    private int numHits;
    private int numMisses;
    private final int maxMisses;

    public AdmiralSunkGame(int gridSize, int numShips, int maxMisses) {
        grid = new int[gridSize][gridSize];
        this.numShips = numShips;
        this.maxMisses = maxMisses;
        placeShips();

    }

    public void play() {
        Scanner input = new Scanner(System.in);

        while (numHits < numShips && numMisses < maxMisses) {
            System.out.println("Enter row...");
            int row = input.nextInt();

            if (row > 9) {
                System.out.println("Please enter smaller row ...");

            }else if (row < 0) {
                System.out.println("Please enter bigger row ...");

            }else {

                System.out.println("Enter column...");
                int col= input.nextInt();

                if (col > 9) {
                    System.out.println("Please enter smaller col...");
                } else if (col < 0) {
                    System.out.println("Please enter bigger col...");

                }else {

                    if (grid[row][col]==1) {
                        System.out.println("You sunk a ship!");
                        grid[row][col]=-1;
                        numHits++;
                    }else {
                        System.out.println("You missed!!!");
                        grid[row][col]=-2;
                        numMisses++;
                    }

                }

            }

        }

        if (numHits == numShips) {
            System.out.println("Congratulations, YOU WIN!!!");
        }else {
            System.out.println("Sorry You Lost :(");
        }
    }

    private void placeShips() {
        Random random = new Random();
        for (int i = 0; i < numShips; i++) {
            int row = random.nextInt(grid.length);
            int col = random.nextInt(grid.length);

            if (grid[row][col]==0) {
                grid[row][col]=1;
            }else {
                i--;
        }

        }
    }
}
