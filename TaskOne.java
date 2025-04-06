
import java.util.Scanner;
public class TaskOne {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double subtract (double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error! Divide by zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskOne calculator = new TaskOne();
        System.out.println("Select an option ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int option = scanner.nextInt();
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
       try {
           switch (option) {
               case 1:
                   System.out.println(calculator.add(num1, num2));
                   break;
               case 2:
                   System.out.println(calculator.subtract(num1, num2));
                   break;
               case 3:
                   System.out.println(calculator.multiply(num1, num2));
                   break;
               case 4:
                   System.out.println(calculator.divide(num1, num2));
                   break;
               default:
                   System.out.println("Invalid option");

           }


       }catch (ArithmeticException e) {
           System.out.println(e.getMessage());
       }
       scanner.close();
    }
}

