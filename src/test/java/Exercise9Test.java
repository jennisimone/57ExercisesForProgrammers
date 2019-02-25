import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise9Test {

    Exercise9 exercise9 = new Exercise9();

    @Test
    public void oneGallonFor350SqFt() {
        Assertions.assertThat(exercise9.calculateNumberOfPaintCans(35, 10)).isEqualTo(1);
    }

    @Test
    public void twoGallonsFor400SqFt() {
        Assertions.assertThat(exercise9.calculateNumberOfPaintCans(40, 10)).isEqualTo(2);
    }

}