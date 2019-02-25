import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        String firstNumber = scanner.next();
        System.out.println("What is the second number?");
        String secondNumber = scanner.next();

        int addition = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        int subtraction = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
        int multiplication = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
        int division = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);

        System.out.printf(firstNumber + " + " + secondNumber + " = %d\n" +
                firstNumber + " - " + secondNumber + " = %d\n" +
                firstNumber + " * " + secondNumber + " = %d\n" +
                firstNumber + " / " + secondNumber + " = %d\n",
                addition, subtraction, multiplication, division);
    }
}
