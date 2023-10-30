package com.mycompany.lojainformatica.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author João Vitor
 */
public class ComputerTableModel extends AbstractTableModel{
    private List<Computer> computers = new ArrayList<>();
    private String[] columns = {"Id", "Marca", "HD", "Processador"};

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
    public void deleteRow(Computer computer){
        
    }
}
