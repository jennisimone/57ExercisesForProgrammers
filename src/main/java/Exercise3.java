import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your favourite quote?");
        String quote = scan.nextLine();

        System.out.println("Who said it?");
        String quoteGiver = scan.nextLine();

        System.out.println(quoteGiver + " once said, \"" + quote + "\"");
    }
}
