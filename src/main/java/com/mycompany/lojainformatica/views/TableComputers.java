package com.mycompany.lojainformatica.views;

import com.mycompany.lojainformatica.DAO.ComputerDAO;
import com.mycompany.lojainformatica.models.Computer;
import com.mycompany.lojainformatica.models.ComputerTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableComputers extends javax.swing.JFrame {

    ComputerTableModel _computerTableModel = new ComputerTableModel();
    ComputerDAO _computerDao = new ComputerDAO();

    public TableComputers() {
        initComponents();
        this.setLocationRelativeTo(null);
        jtComputers.setModel(_computerTableModel);
        fillTable();
    }

    public void fillTable() {
        ResultSet rs = _computerDao.getComputers();
        try {
            while (rs.next()) {
                Computer computer = new Computer();
                computer.setId(rs.getInt(1));
                computer.setHd(rs.getString(3));
                computer.setProcessador(rs.getString(4));
                _computerTableModel.addRow(computer);
            }
        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComputers = new javax.swing.JTable();
        JbtnAlterar = new javax.swing.JButton();
        JbtnRemover = new javax.swing.JButton();
        JbtnAdicionar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        JtfHd = new javax.swing.JTextField();
        JtfProcessador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de computadores");

        jtComputers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtComputers);

        JbtnAlterar.setBackground(new java.awt.Color(102, 102, 102));
        JbtnAlterar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        JbtnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        JbtnAlterar.setText("Alterar Computador");
        JbtnAlterar.setMaximumSize(new java.awt.Dimension(156, 23));
        JbtnAlterar.setPreferredSize(new java.awt.Dimension(156, 23));
        JbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAlterarActionPerformed(evt);
            }
        });

        JbtnRemover.setBackground(new java.awt.Color(102, 102, 102));
        JbtnRemover.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        JbtnRemover.setForeground(new java.awt.Color(255, 255, 255));
        JbtnRemover.setText("Remover Computador");
        JbtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnRemoverActionPerformed(evt);
            }
        });

        JbtnAdicionar.setBackground(new java.awt.Color(102, 102, 102));
        JbtnAdicionar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        JbtnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        JbtnAdicionar.setText("Adicionar computador");
        JbtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAdicionarActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SemFiltro", "AMD", "Intel" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HD");

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Processador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JbtnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 205, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfHd, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(JtfProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(JbtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbtnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfHd)
                    .addComponent(JtfProcessador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnRemoverActionPerformed
        if (jtComputers.getSelectedRow() != -1) {
            int id = Integer.parseInt(_computerTableModel.getValueAt(jtComputers.getSelectedRow(), 0).toString());
            _computerTableModel.deleteRow(id, jtComputers.getSelectedRow());
        }
    }//GEN-LAST:event_JbtnRemoverActionPerformed

    private void JbtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAdicionarActionPerformed
        Register registerForm = new Register();
        registerForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JbtnAdicionarActionPerformed

    private void JbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAlterarActionPerformed

        if (jtComputers.getSelectedRow() != -1) {
            if (JtfHd.getText().length() > 0 && JtfProcessador.getText().length() <= 0) {
                _computerTableModel.setValueAt(JtfHd.getText(), jtComputers.getSelectedRow(), 2);

            } else if (JtfProcessador.getText().length() > 0 && JtfHd.getText().length() <= 0) {
                _computerTableModel.setValueAt(JtfProcessador.getText(), jtComputers.getSelectedRow(), 3);
            } else {
                _computerTableModel.setValueAt(JtfHd.getText(), jtComputers.getSelectedRow(), 2);
                _computerTableModel.setValueAt(JtfProcessador.getText(), jtComputers.getSelectedRow(), 3);
            }
        }
        JtfHd.setText("");
        JtfProcessador.setText("");
    }//GEN-LAST:event_JbtnAlterarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        ResultSet rs = _computerDao.filterComputer(jComboBox1.getSelectedItem().toString());
        if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("SemFiltro")) {
            fillTable();
        } else {

            try {
                int rowCount = _computerTableModel.getRowCount();;;;
                for (int i = rowCount - 1; i >= 0; i--) {;;
                    _computerTableModel.removeRow(i);
                };

                while (rs.next()) {;
                    Computer computer = new Computer();
                    computer.setId(rs.getInt(1));
                    computer.setHd(rs.getString(3));
                    computer.setProcessador(rs.getString(4));
                    _computerTableModel.addRow(computer);
                }
            } catch (SQLException ex) {
                throw new Error(ex);
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableComputers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnAdicionar;
    private javax.swing.JButton JbtnAlterar;
    private javax.swing.JButton JbtnRemover;
    private javax.swing.JTextField JtfHd;
    private javax.swing.JTextField JtfProcessador;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtComputers;
    // End of variables declaration//GEN-END:variables
}
