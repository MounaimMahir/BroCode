import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public Scanner scanner = new Scanner(System.in);

    public int choice;
    public boolean stillPlay = false;

    public String[] gameChoice= new String[]{"Rock","Paper","Scissor"};

    public Random random = new Random();
    public String playerChoice ;

    public String computerChoice;




    public void game(){
        System.out.println("Welcome to the Rock Paper Scissor Game!");

        while(!stillPlay){

            System.out.println("Choice a option");
            System.out.println(" Rock, Paper, Scissor");
            playerChoice = scanner.nextLine();
             computerChoice= gameChoice[random.nextInt(gameChoice.length)];
            if (playerChoice.equals("Rock")&&computerChoice.equals("Rock")){
                System.out.println("it's a tie");
            }  System.out.println("It’s a tie!");
        } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (playerChoice.equals("scissor") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }


        }
    }

    public static void main(String[] args) {
        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        rockPaperScissor.game();
    }
}
