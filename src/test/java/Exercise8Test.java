import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercise8Test {

    Exercise8 exercise8 = new Exercise8();

    @Test
    public void eightPeople2PizzasOneSlice() {
        Assertions.assertThat(exercise8.pizzaSearch(8, 2)).isEqualTo("Each person gets 1 piece of pizza.\n" +
                "There are 0 leftover pieces.");
    }

    @Test
    public void threePeople2PizzasTwoRemaining() {
        Assertions.assertThat(exercise8.pizzaSearch(3, 2)).isEqualTo("Each person gets 2 pieces of pizza.\n" +
                "There are 2 leftover pieces.");
    }

}