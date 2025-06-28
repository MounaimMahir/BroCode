import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to the compound Calculator!\n");

        Scanner scanner = new Scanner(System.in);

        double principale;
        double rate;
        int time;
        int n;
        double amount;

        System.out.println("Initial amount invested?");
        principale = scanner.nextDouble();

        System.out.println(" the annuel interest ? ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Time the money is invested or borrowed for (in years)\n" );
        time = scanner.nextInt();

        System.out.println("Number of times that interest is compoinded per year");
        n = scanner.nextInt();

        amount= principale* Math.pow(1 + rate/ n,n * time );

        System.out.printf("the rate is  %.2f" , amount);


    }
}