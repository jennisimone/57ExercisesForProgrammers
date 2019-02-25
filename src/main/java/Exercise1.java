import java.util.Scanner;

public class Exercise1 {

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
