package OOP;

import java.util.*;

class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playerChoice, computerChoice;
        String playAgain="";
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("----------------------------------------");
        System.out.print("  !Welcome To Rock, Paper, Scissors Game!  \n");
        System.out.println("  Have fun!  ");
        System.out.println("----------------------------------------");


        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice!");
                continue;
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("scissors") && computerChoice.equals("paper")) || (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("----------------");
                System.out.println("  !You win! ");
                System.out.println("----------------");
            }else{
                System.out.println("----------------");
                System.out.println("  !You lose! ");
                System.out.println("----------------");
            }
            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();


        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}