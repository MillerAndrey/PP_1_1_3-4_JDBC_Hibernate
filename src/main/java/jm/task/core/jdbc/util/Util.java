package jm.task.core.jdbc.util;

import org.hibernate.dialect.MySQL8Dialect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static Connection connection;

    public Util() {
    }

    /*   private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";*/

    public static Connection getConnection() throws SQLException {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    // реализуйте настройку соеденения с БД
}
