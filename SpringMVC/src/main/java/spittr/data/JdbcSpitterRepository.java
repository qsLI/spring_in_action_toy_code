package spittr.data;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spittr.Spitter;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by KL on 2016/5/23.
 */

@Repository
public class JdbcSpitterRepository implements  SpitterRepository {
    private JdbcOperations jdbcOperations;
    private static final String INSERT_SPITTER = "insert into spittr(username, password, firstname, lastname) values(?,?,?,?)";
    private static final String SELECT_SPITTER_BY_ID = "select * from spittr where id = ?";

    @Inject
    public JdbcSpitterRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public Spitter save(Spitter spitter) {
        jdbcOperations.update(INSERT_SPITTER, new Object[]{
                        spitter.getUsername(),
                        spitter.getPassword(),
                        spitter.getFirstName(),
                        spitter.getLastName()
        });
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
    }

    @Override
    public Spitter findOne(long id) {
        return (Spitter) jdbcOperations.queryForObject(
                SELECT_SPITTER_BY_ID,new Object[]{id} ,new SpitterRowMapper()
        );
    }

    private static final class SpitterRowMapper implements RowMapper {
        @Override
        public Spitter mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            return new Spitter(
                    resultSet.getLong("id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("firstName"),
                    resultSet.getString("lastName")
            );
        }
    }

}
