package spittr.data;

import spittr.Spitter;

/**
 * Created by KL on 2016/5/8.
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

    Spitter findOne(long id);
}
