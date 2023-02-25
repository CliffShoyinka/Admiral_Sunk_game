import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        AdmiralSunkGame game = new AdmiralSunkGame(10, 3, 10);
        Scanner input = new Scanner(System.in);

        System.out.println("==================== ADMIRAL SUNK ======================");
        System.out.println();

        boolean playAgain = true;

        while (playAgain) {
            game.play();

            System.out.println("Do you want to play again? (y/n)");
            String idx = input.next();

            if (!idx.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }

    }
}
