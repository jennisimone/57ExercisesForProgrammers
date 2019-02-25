import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercise7Test {

    @Test
    public void returnsCorrectArea() {
        Exercise7 exerciseSeven = new Exercise7();



        Assertions.assertThat(exerciseSeven.getArea(15, 20)).isEqualTo("The area is\n" +
                "300 square feet\n" +
                "27.871 square meters");
    }
}