import java.io.PrintStream;
import java.util.Scanner;

public class BasicBankProgram {


   static Scanner scanner = new Scanner(System.in);


    int balance;
    double amount;

    String accountName = null;
    int pass;



    public void balance(int amount){

        if (balance<0){
            System.out.println("balance can't be negative");
            balance = 0;
        }
        else { balance = this.balance;}


        System.out.println("your balance is " + balance );

       }



    public void add(){

        System.out.println("amount to add");

        amount = scanner.nextDouble();

        if (amount<=0){
            System.out.println("invalid action: amount needs to be positive");

        }else {balance += amount;
            System.out.println(amount+" has  been added to your account");
        }

    }
    public void withdraw(){
        System.out.println("amount to withdraw");
        if (balance<0){
            System.out.println("invalid action: not enough saldo");
            amount = 0;

        }else {balance -= amount;
            System.out.println(amount + " has  been substracted from your account");
        }


    }


    public void choice() {
        int option;

        while (true) {
            System.out.println("\n-----------------------");
            System.out.println(" Welcome to my basic bank");
            System.out.println("-------------------------");
            System.out.println("1. Check balance");
            System.out.println("2. Add money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current balance: " + balance + "€");
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thanks for using our bank!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

    }


    public static void main(String[]args){


    BasicBankProgram bank = new BasicBankProgram();



     bank.choice();


    }

}

