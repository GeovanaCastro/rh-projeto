package com.myrh.open.rh.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ModuloConexao {

    public static Connection conector() throws SQLException {  // Criando método com nome de: conector

        String url = "jdbc:mysql://localhost:3306/rhlaboratorio";
        String username = "root";
        String password = "@universe";

        System.out.println("Connecting database...");
     
        try (Connection connection = DriverManager.getConnection(url, username, password);)
        {
            System.out.println("Connect Ok!");
             return connection;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
