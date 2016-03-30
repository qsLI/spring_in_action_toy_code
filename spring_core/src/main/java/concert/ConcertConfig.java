package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by KL on 2016/2/1.
 */
@Configuration
@ComponentScan("concert")
public class ConcertConfig {

    @Bean
    public Concert concert() {
        return new Concert();
    }
}
