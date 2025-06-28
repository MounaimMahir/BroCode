import java.util.Random;
import java.util.Scanner;

public class DiceGame {



static Scanner scanner = new Scanner(System.in);
static int total = 0;
int randomDice;
      static   Random random = new Random();
        static String dice_1;
        static String dice_2;
        static String dice_3;
        static String dice_4;
        static String dice_5;
        static String dice_6;




        static void rollingDice(int numberOfDice){

            if (numberOfDice<1){
                System.out.println("There needs to be at the minimum one dice!");
            }else {


                for (int i = 0;i<numberOfDice;i++){


                   int roll = random.nextInt(6)+1;

                  System.out.println(roll);
                  initializeDiceFaces();
                  switch (roll){
                      case 1:
                          System.out.println(dice_1);break;
                      case 2:
                          System.out.println(dice_2);break;
                      case 3:
                          System.out.println(dice_3);break;
                      case 4:
                          System.out.println(dice_4);break;
                      case 5:
                          System.out.println(dice_5);break;
                      case 6:
                          System.out.println(dice_6);break;

                  }
//                    System.out.println();
//                    System.out.println("");
                    total += roll;
                }
                System.out.println("total point is " + total);
            }
        }



          public static void initializeDiceFaces() {
               dice_1 =
                                "------------\n" +
                                "|          |\n" +
                                "|    ●     |\n" +
                                "|          |\n" +
                                "------------";

                dice_2 =
                                "------------\n" +
                                "| ●        |\n" +
                                "|          |\n" +
                                "|       ●  |\n" +
                                "------------";

                 dice_3 =
                                "------------\n" +
                                "| ●        |\n" +
                                "|    ●     |\n" +
                                "|       ●  |\n" +
                                "------------";

                dice_4 =
                                "------------\n" +
                                "| ●     ●  |\n" +
                                "|          |\n" +
                                "| ●     ●  |\n" +
                                "------------";

                 dice_5 =
                                "------------\n" +
                                "| ●     ●  |\n" +
                                "|    ●     |\n" +
                                "| ●     ●  |\n" +
                                "------------";

                 dice_6 =
                                "------------\n" +
                                "| ●     ●  |\n" +
                                "| ●     ●  |\n" +
                                "| ●     ●  |\n" +
                                "------------";


                }

    public static void main(String[] args) {


        System.out.println("Enter number of Dice");
        int number =  scanner.nextInt();
        rollingDice(number);
    }
        }





