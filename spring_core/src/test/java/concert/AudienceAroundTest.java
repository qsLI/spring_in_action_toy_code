package concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by KL on 2016/3/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AudienceAroundTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    AudienceAround audienceAround;

    @Autowired
    Performance concert;

    @Test
    public void perform() {
        concert.perform();
        assertEquals("Silencing cell phones" + System.lineSeparator()
                + "Taking seats" + System.lineSeparator()
                + "performing..." + System.lineSeparator()
                + "CLAP CLAP CLAP !!!" + System.lineSeparator(), log.getLog());
    }
}