package Problemslvl1;

import java.util.Random;
import java.util.Scanner;

public class Project1 {

    // 🎨 ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    // 🪨📄✂️ Enum for choices
    enum GameChoice {
        STONE(1),
        PAPER(2),
        SCISSOR(3);

        private final int value;

        GameChoice(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static GameChoice fromValue(int value) {
            for (GameChoice choice : GameChoice.values()) {
                if (choice.getValue() == value) {
                    return choice;
                }
            }
            return null;
        }
    }

    // 🎲 Random number between from–to
    public static int randomNumber(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }

    // 💻 Computer’s random choice
    public static GameChoice getComputerChoice() {
        int randomNum = randomNumber(1, 3);
        return GameChoice.fromValue(randomNum);
    }

    // 🧩 Compare results
    public static int getRoundResult(GameChoice player, GameChoice computer) {
        if (player == computer)
            return 0; // tie
        if ((player == GameChoice.STONE && computer == GameChoice.SCISSOR) ||
            (player == GameChoice.PAPER && computer == GameChoice.STONE) ||
            (player == GameChoice.SCISSOR && computer == GameChoice.PAPER)) {
            return 1; // player wins
        }
        return -1; // computer wins
    }

    // 🎮 Main game
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(CYAN + "How many rounds (1–10) do you want to play? " + RESET);
        int rounds = scan.nextInt();

        int playerScore = 0;
        int computerScore = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.println(YELLOW + "\nRound " + i + ":" + RESET);
            System.out.print("Enter your choice (1=STONE, 2=PAPER, 3=SCISSOR): ");
            int playerNum = scan.nextInt();

            GameChoice playerChoice = GameChoice.fromValue(playerNum);
            if (playerChoice == null) {
                System.out.println(RED + "Invalid choice! You lose this round." + RESET);
                computerScore++;
                continue;
            }

            GameChoice computerChoice = getComputerChoice();

            System.out.println("You chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);

            int result = getRoundResult(playerChoice, computerChoice);
            if (result == 0) {
                System.out.println(YELLOW + "It's a tie!" + RESET);
            } else if (result == 1) {
                System.out.println(GREEN + "You win this round!" + RESET);
                playerScore++;
            } else {
                System.out.println(RED + "Computer wins this round!" + RESET);
                computerScore++;
            }
        }

        // 🏁 Final results
        System.out.println(CYAN + "\n========================" + RESET);
        System.out.println("Final Score:");
        System.out.println("You: " + playerScore);
        System.out.println("Computer: " + computerScore);
        System.out.println(CYAN + "========================" + RESET);

        if (playerScore > computerScore)
            System.out.println(GREEN + "🎉 You win the game!" + RESET);
        else if (playerScore < computerScore)
            System.out.println(RED + "💻 Computer wins the game!" + RESET);
        else
            System.out.println(YELLOW + "🤝 It's a tie overall!" + RESET);
    }
}
