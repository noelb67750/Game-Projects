import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Choose one:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.print("Enter your choice: ");

        int userChoice = input.nextInt();
        int computerChoice = rand.nextInt(3) + 1;

        // Map numbers to moves
        String[] moves = { "Rock", "Paper", "Scissors" };

        System.out.println("You chose: " + moves[userChoice - 1]);
        System.out.println("Computer chose: " + moves[computerChoice - 1]);

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }
}
