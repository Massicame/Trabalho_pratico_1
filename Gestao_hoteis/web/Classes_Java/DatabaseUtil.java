package Classes_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/Gestao_Hotel";
    private static final String USERNAME = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
