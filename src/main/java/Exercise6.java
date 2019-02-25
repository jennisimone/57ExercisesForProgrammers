import java.time.LocalDate;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current age?");
        int age = scan.nextInt();
        System.out.println("What age would you like to retire?");
        int retirementAge = scan.nextInt();

        int now = LocalDate.now().getYear();
        int timeTilRetirement = retirementAge - age;

        if(timeTilRetirement <= 0){
            System.out.println("You can retire now!");
        } else {
            System.out.printf("It's %d, you can retire in %d years when it's %d", now, timeTilRetirement, (now + timeTilRetirement));
        }
    }
}
