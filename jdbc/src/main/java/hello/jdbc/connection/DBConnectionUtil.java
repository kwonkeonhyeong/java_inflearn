package hello.jdbc.connection;

import static hello.jdbc.connection.Connection.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBConnectionUtil {
    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get connection={}, class={}", connection, connection.getClass());
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
