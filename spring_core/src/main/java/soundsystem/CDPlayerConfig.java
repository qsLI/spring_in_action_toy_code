package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by KL on 2016/1/4.
 */

@Configuration
@ComponentScan("soundsystem")
//@ComponentScan(basePackages = {"soundsystem", "another package") // only string not type safe
//@ComponentScan(basePackageClasses = {CDPlayer.class, DVDPlayer.class}) //type safe one
public class CDPlayerConfig {
}
