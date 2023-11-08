package com.mycompany.lojainformatica.DAO;

import com.mycompany.lojainformatica.Dbconnection.ConnectionDB;
import com.mycompany.lojainformatica.models.Computer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComputerDAO {

    public boolean insertComputer(Computer computer) {
        try {
            String sql = "INSERT INTO computador(marca, hd, processador) VALUES (?,?,?)";
            PreparedStatement stmt = ConnectionDB.getConn().prepareStatement(sql);
            stmt.setString(1, Computer.getMarca());
            stmt.setString(2, computer.getHd());
            stmt.setString(3, computer.getProcessador());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }

    public ResultSet getComputers() {
        ResultSet rs;
        try {
            String sql = "SELECT * FROM computador";
            PreparedStatement stmt = ConnectionDB.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw new Error(ex);

        }
    }

    public void updateComputer(Computer computer) {
        try {
            String sql = "UPDATE computador SET hd = ?, processador = ? WHERE id = ?";
            PreparedStatement stmt = ConnectionDB.getConn().prepareStatement(sql);
            stmt.setString(1, computer.getHd());
            stmt.setString(2, computer.getProcessador());
            stmt.setInt(3, computer.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }

    public boolean deleteComputer(int id) {
        try {
            String sql = "DELETE FROM computador WHERE id=?";
            PreparedStatement stmt = ConnectionDB.getConn().prepareStatement(sql);
            stmt.setInt(1, id);
            boolean rows = stmt.execute();
            if (rows != true) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public ResultSet filterComputer(String processador) {
        try {
            String sql = "SELECT * FROM computador WHERE processador LIKE ?";
            PreparedStatement stmt = ConnectionDB.getConn().prepareStatement(sql);
            stmt.setString(1, processador+"%");
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }
}
