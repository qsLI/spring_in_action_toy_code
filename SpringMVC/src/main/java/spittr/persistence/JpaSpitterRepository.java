package spittr.persistence;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * Created by KL on 2016/5/25.
 */
@Repository
@Transactional
public class JpaSpitterRepository implements SpitterRepository {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public Spitter save(Spitter spitter) {
        emf.createEntityManager().merge(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
    }

    @Override
    public Spitter findOne(long id) {
        return emf.createEntityManager().find(Spitter.class, id);
    }
}
