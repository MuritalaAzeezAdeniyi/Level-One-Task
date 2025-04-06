package taskThree;
import java.util.Scanner;

public class FactorialCalculator {

    public static int factorial(int n) {

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }


        if (n == 0 || n == 1) {
            return 1;
        }


        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number to compute its factorial: ");
        int number = scanner.nextInt();


        int result = factorial(number);


        if (result != -1) {
            System.out.println("The factorial of " + number + " is: " + result);
        }


        scanner.close();
    }
}
