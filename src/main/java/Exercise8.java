import java.util.Scanner;

class Exercise8 {

    public String pizzaSearch(int numberOfPeople, int numberOfPizzas) {
        int pizzaSlices = (numberOfPizzas * 4) / numberOfPeople;
        int remainingSlices = (numberOfPizzas * 4) % numberOfPeople;

        String pizzaPieces = "pieces";
        if (pizzaSlices == 1) {
            pizzaPieces = "piece";
        }

        String remainingPieces = "pieces";
        if (remainingSlices == 1) {
            remainingPieces = "piece";
        }

        String pizzaQuery = "Each person gets " + pizzaSlices + " " + pizzaPieces + " of pizza.\n" +
                "There are " + remainingSlices + " leftover " + remainingPieces + ".";

        return pizzaQuery;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise8 exercise8 = new Exercise8();

        System.out.println("How many people?");
        int people = scanner.nextInt();
        System.out.println("How many pizzas?");
        int pizzas = scanner.nextInt();

        System.out.println(exercise8.pizzaSearch(people, pizzas));
    }
}
