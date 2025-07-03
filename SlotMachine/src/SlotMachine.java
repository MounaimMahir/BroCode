import java.util.*;



public class SlotMachine {

    public String playAgain = "yes";
    public Random random = new Random();

    public Scanner scanner = new Scanner(System.in);
    public int balance;
    public int bet;
    public String computerChoice;
    String drawFruits[] = new String[3];

    public int countfruits = 0;
    public String confirmation;


    String []fruits = new String[]{"🍋","🍒","🍉"};


    public void slotMachine(int balance) {
        System.out.println("Welcome to the slot machine");
        do {
            System.out.println("");

            countfruits = 0;
            System.out.println("Symbols: 🍋 🍒 🍉");
            System.out.println("");
//            System.out.println("Enter amount you wish to bet");
//            bet = scanner.nextInt();scanner.nextLine();


            System.out.println("****************");


// randomize the fruits one at a time

            for (int i = 0; i < 3; i++) {

                drawFruits[i] = fruits[random.nextInt(fruits.length)];
            }
            for (String fruitMachine : drawFruits) {
                System.out.print(fruitMachine);
            }


            if (drawFruits[0].equals(drawFruits[1])&& drawFruits[0].equals(drawFruits[2])) {
                System.out.println("You win!");
            } else {
                System.out.println("Try again!");
            }
                System.out.println("would you like to play again? (yes/no)");
                confirmation = scanner.nextLine();
        } while (confirmation.equalsIgnoreCase("yes"));





        }

    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        slotMachine.slotMachine(100);
    }
}





