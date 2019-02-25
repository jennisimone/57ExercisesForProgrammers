import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        getsName(name);

    }

    public static String getsName(String name) {
       return "Hello " + name + ", nice you meet you!";
    }
}

class Exercise1Challenge {

    public static void main(String[] args) {
        System.out.println("What is your name?");

        if (Math.random() > 0.5) {
            System.out.println("Hello " + new Scanner(System.in).next() + ", nice you meet you!");
        } else if (Math.random() > 0.5) {
            System.out.println("Yo " + new Scanner(System.in).next() + ", how you doing?");
        } else {
            System.out.println("Bonjour " + new Scanner(System.in).next() + ", comment ça va?");
        }
    }
}
