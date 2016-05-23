package spittr.data;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spittr.Spitter;
import spittr.Spittle;

import java.io.Serializable;

/**
 * Created by KL on 2016/5/23.
 */
@Repository
public class HibernateSpitterRepository implements SpitterRepository{
    private SessionFactory sessionFactory;

    @Autowired
    public HibernateSpitterRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public long count() {
        return 0;
    }

    @Override
    public Spitter save(Spitter spitter) {
        Serializable id = currentSession().save(spitter);
        return new Spitter((Long) id,
                            spitter.getUsername(),
                            spitter.getPassword(),
                            spitter.getFirstName(),
                            spitter.getLastName()
        );
    }

    @Override
    public Spitter findByUsername(String username) {
        return (Spitter) currentSession()
                .createCriteria(Spitter.class)
                .add(Restrictions.eq("username", username))
                .list().get(0);
    }

    @Override
    public Spitter findOne(long id) {
        return (Spitter) currentSession().get(Spittle.class, id);
    }
}
