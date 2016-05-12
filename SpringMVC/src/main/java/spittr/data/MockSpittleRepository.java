package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by KL on 2016/5/7.
 */
@Component
public class MockSpittleRepository implements SpittleRepository {

    public List<Spittle> findSpittles(long max, int count) {
        return createSpittleList(20);
    }

    public Spittle findOne(long id) {
        return new Spittle("findOne", new Date());
    }

    public void save(Spittle spittle) {

    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date(0)));
        }
        return spittles;
    }
}
