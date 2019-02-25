import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String input = scan.nextLine();
        while (input.length() == 0){
            System.out.println("Please actually enter a word!");
            input = scan.nextLine();
        }
        System.out.println(input + " has " + input.length() + " characters.");
    }
}
