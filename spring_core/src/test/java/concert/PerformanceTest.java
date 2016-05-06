package concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by KL on 2016/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class PerformanceTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    Audience audience;

    @Autowired
    Performance concert;

   @Test
    public void perform(){

       AspectJProxyFactory factory = new AspectJProxyFactory(concert);
       factory.addAspect(audience);
       Performance performanceProxy = factory.getProxy();
       performanceProxy.perform();
       assertEquals("Silencing cell phones" + lineSeparator()
                    + "Taking seats" + lineSeparator()
                    + "performing..." + lineSeparator()
                    + "CLAP CLAP CLAP !!!" + lineSeparator(), log.getLog());
   }
}