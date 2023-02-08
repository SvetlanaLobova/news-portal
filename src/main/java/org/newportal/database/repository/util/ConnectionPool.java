package org.newportal.database.repository.util;

import org.newportal.database.entity.User;

import java.sql.*;

import static org.newportal.constants.Constants.QUERY;

public class ConnectionPool {
    private final static String URL = "jdbc:oracle:thin:@localhost:49161:xe";
    private final static String USERNAME = "system";
    private final static String PASSWORD = "oracle";
    private static Connection connection;


    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User user = null;
        try (PreparedStatement statement = connection.prepareStatement(QUERY)) {
            statement.setInt(1, 1);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getString(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(user);
    }
}
