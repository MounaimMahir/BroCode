import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     double principal;
     double rate;
     int timesCompund;
     int years;
     double amount;

        System.out.println(" enter the principale amount: ");
        principal = scanner.nextDouble();

        System.out.println("enter the interest rate (in % : ");
        rate = scanner.nextDouble() / 100;

        System.out.println("enter the # of times compound per year: ");
        timesCompund = scanner.nextInt();

        System.out.println("enter the # of years: ");
        years = scanner.nextInt();

        amount = principal  * Math.pow( 1 + rate / timesCompund , timesCompund*years);

        scanner.close();
    }
}