package eu.qwan.tddaiymi;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TDDAsIfYouMeantItTest {
    @Test
    public void testBogus() {
        assertThat(0, equalTo(1));
    }
}
