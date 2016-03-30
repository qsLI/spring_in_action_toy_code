package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by KL on 2016/3/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class EncoreableIntroducerTest {
    @Autowired
    Performance concert;

    @Test
    public void encoreTest() {
        concert.perform();
        ((Encoreable)concert).performEncore(); // use the introduced method
    }
}