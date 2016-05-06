package concert;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by KL on 2016/2/1.
 */

@Aspect
@Component
public class Audience {

    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP !!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
