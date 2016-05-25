package spittr.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by KL on 2016/5/25.
 */
public class SpitterRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public int eliteSweep() {
        String update =
                "UPDATE Spitter spitter " +
                        "SET spitter.status = 'Elite' " +
                        "WHERE spitter.status = 'Newbie' " +
                        "AND spitter.id IN (" +
                        "SELECT s FROM Spitter s WHERE (" +
                        " SELECT COUNT(spitttles) FROM s.spittles spittles) > 10000" +
                        ")";
        return entityManager.createQuery(update).executeUpdate();
    }
}
