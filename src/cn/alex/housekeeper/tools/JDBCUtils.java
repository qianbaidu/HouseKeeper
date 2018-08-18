package cn.alex.housekeeper.tools;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA
 * Created By Alex
 * Date: 2018-08-18
 * Time: 18:45
 */
public class JDBCUtils {

    private static BasicDataSource dataSource = new BasicDataSource();

    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/house_keeper");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setMaxActive(10);
        dataSource.setMaxIdle(5);
        dataSource.setMinIdle(2);
        dataSource.setInitialSize(10);
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

}
