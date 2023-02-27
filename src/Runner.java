import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        AdmiralSunkGame game = new AdmiralSunkGame(10, 3, 10);
        Scanner input = new Scanner(System.in);

        System.out.println("==================== ADMIRAL SUNK ======================");
        System.out.println();



        int select;

        do {
            System.out.println("0-Exit" +
                    "\n1-start");
            select=input.nextInt();
            switch (select) {
                case 1:
                    game.play();
                    break;
                case 0:
                    System.out.println("Good bye... <3");
            }

        }while (select!=0);

    }
}
