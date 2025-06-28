
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my calculator");


       double num1, num2, result;
       char operator = ' ';

        System.out.println(" type in the first and second number");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();


        System.out.println("What operation would you like to do (+, -, /, *, %), ^");

        operator = scanner.next().charAt(0);

        /*if (operator == '+'){
            System.out.println(" type in the first number");
            num1 = scanner.nextDouble();
            System.out.println("type in the second number");
            num2 = scanner.nextDouble();
            result = num1 + num2;
            System.out.println(result);

            System.out.println(" type in the first and second number");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();}
            */


            switch (operator){

                case '+': System.out.printf("result is %.2f", num1 + num2); break;
                case '-': System.out.printf("result is %.2f", num1 - num2); break;
                case '*':System.out.printf("result is %.2f", num1 * num2); break;
                case '/': System.out.printf("result is %.2f", num1 / num2); break;
                case '%' : System.out.printf("result is %.2f", num1  % num2); break;
                case'^': System.out.println( "reslut is " + Math.pow(num1, num2)); break;
                default:
                    System.out.println(" symbol not supported");
            }

    }
}
