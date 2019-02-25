import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercise1Test {

    @Test
    public void returnsNameInPrintStatement() {
        Assertions.assertThat(Exercise1.getsName("jen").equals("Hello jen, nice you meet you!"));
    }

}