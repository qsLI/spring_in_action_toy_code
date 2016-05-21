package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KL on 2016/5/8.
 */
@Component
public class MockSpitterRepository implements SpitterRepository{
    private List<Spitter> spitters = new ArrayList<Spitter>(){{
            add(new Spitter("Kevin","123456","Kevin","Leo"));
    }};

    public Spitter save(Spitter spitter) {
        spitters.add(spitter);
        return spitter;
    }

    public Spitter findByUsername(String username) {
        for (Spitter spitter :
                spitters) {
            if(spitter.getUsername().equalsIgnoreCase(username)) {
                return spitter;
            }
        }
        return null;
    }
}
