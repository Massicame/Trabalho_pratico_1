package Classes_Java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(Usuario usuario) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Obter conexão com a base de dados
          connection = DatabaseUtil.getConnection();
            
            // Preparar a consulta SQL para inserção do usuário
            String sql = "INSERT INTO usuarios (nome, idade, morada, data_entrada, data_saida) VALUES (?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            
            // Definir os parâmetros da consulta com os valores do usuário
            statement.setString(1, usuario.getNome());
            statement.setInt(2, usuario.getIdade());
            statement.setString(3, usuario.getMorada());
            statement.setDate(4, new java.sql.Date(usuario.getDataEntrada().getTime()));
            statement.setDate(5, new java.sql.Date(usuario.getDataSaida().getTime()));
            
            // Executar a consulta de inserção
            statement.executeUpdate();
        } finally {
            // Fechar recursos (statement e conexão)
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
