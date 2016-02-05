package concert;

import org.springframework.stereotype.Component;

/**
 * Created by KL on 2016/2/1.
 */
@Component
public class Concert implements Performance {
    public void perform() {
        System.out.println("performing...");
    }
}
