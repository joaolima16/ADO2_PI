package com.mycompany.lojainformatica.Dbconnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection getConn() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/lojainformatica", "root", "P@$$w0rd");
            System.out.println("Conexão aberta");
 
        } catch (ClassNotFoundException ex) {
            throw new Error(ex);
        }
        return conn;
    }

    public void createTables() {
        try {
            Statement stmt = getConn().createStatement();
            String sqlTable = """
                              CREATE TABLE IF NOT EXISTS computador(
                              id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
                              marca VARCHAR(50) NOT NULL, hd VARCHAR(30), processador VARCHAR(40) NOT NULL
                              )""";
            stmt.executeUpdate(sqlTable);
            System.out.println("Tabela criada");
        }
        catch(SQLException ex){
            throw new Error(ex);
        }
    }
}
