package Classes_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/Gestao_Hotel";
    
    private Connection connection;

    public DatabaseConnection() {
        try {
            // Carrega o driver do MySQL
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Falha ao carregar o driver do MySQL.");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        if (connection == null) {
            try {
                // Cria a conexão com o banco de dados
                connection = DriverManager.getConnection(URL);
                System.out.println("Conexão com o banco de dados estabelecida com sucesso.");
            } catch (SQLException e) {
                System.out.println("Falha ao estabelecer a conexão com o banco de dados.");
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                // Fecha a conexão com o banco de dados
                connection.close();
                System.out.println("Conexão com o banco de dados encerrada com sucesso.");
            } catch (SQLException e) {
                System.out.println("Falha ao encerrar a conexão com o banco de dados.");
                e.printStackTrace();
            }
        }
    }
}
