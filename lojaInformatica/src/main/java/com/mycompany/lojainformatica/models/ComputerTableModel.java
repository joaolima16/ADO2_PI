package com.mycompany.lojainformatica.models;

import com.mycompany.lojainformatica.DAO.ComputerDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ComputerTableModel extends AbstractTableModel{
    private List<Computer> computers = new ArrayList<>();
    private String[] columns = {"Id", "Marca", "HD", "Processador"};
    ComputerDAO computerDao = new ComputerDAO();
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    
    @Override
    public int getRowCount() {
        return computers.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return computers.get(rowIndex).getId();
           case 1:
               return Computer.getMarca();
           case 2:
               return computers.get(rowIndex).getHd();
           case 3:
               return computers.get(rowIndex).getProcessador();
       
       }
       return null;
    }
    public void addRow(Computer computer){
        this.computers.add(computer);
        this.fireTableDataChanged();
    }
    public void deleteRow(int id, int row){
        boolean deleteExists = computerDao.deleteComputer(id);
        System.out.println(deleteExists);
        if(deleteExists == true) {
            this.computers.remove(row);
            this.fireTableRowsDeleted(row, row);
        }
    }
}
