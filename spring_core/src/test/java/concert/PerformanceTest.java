package concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayerConfig;

import static org.junit.Assert.*;

/**
 * Created by KL on 2016/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Concert.class)
public class PerformanceTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();


   @Test
    public void perform(){

       AspectJProxyFactory factory = new AspectJProxyFactory(new Concert());
       Audience audience = new Audience();
       factory.addAspect(audience);
       Performance performanceProxy = factory.getProxy();
       performanceProxy.perform();
       assertEquals("", log.getLog());
   }
}