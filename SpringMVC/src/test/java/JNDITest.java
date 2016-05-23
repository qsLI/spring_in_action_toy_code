import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by KL on 2016/5/22.
 */
public class JNDITest {


    @Before
    public void testJNDI() throws Exception{
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/spittr");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("123456");
        Connection conn = ds.getConnection();
//        builder.bind("java:comp/env/jdbc/Spittr", ds);
        System.out.println("ds = " + ds);
        System.out.println("conn = " + conn);
        PreparedStatement pstmt = conn.prepareStatement("SELECT * from user");
        ResultSet resultSet = pstmt.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
        }
    }

    @Test
    public void testCase() {
    }
}
