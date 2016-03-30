package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by KL on 2016/2/1.
 */
@Configuration
@ComponentScan("concert")
@EnableAspectJAutoProxy
public class ConcertConfig {

    @Bean
    public Performance concert() {
        return new Concert();
    }
}
