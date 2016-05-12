package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by KL on 2016/5/6.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);
}
