package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        assertThat(App.take(Arrays.asList(1, 2, 3, 4), 2)).isEqualTo(Arrays.asList(1, 2));

        assertThat(App.take(Arrays.asList(7, 3, 10), 8)).isEqualTo(Arrays.asList(7, 3, 10));


        assertThat(App.take(Arrays.asList(7, 3, 10), 0)).isEqualTo(new ArrayList<Integer>());

        assertThat(App.take(new ArrayList<>(), 100)).isEqualTo(new ArrayList<Integer>());
        // END
    }
}
