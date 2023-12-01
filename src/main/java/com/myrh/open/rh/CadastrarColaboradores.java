package com.myrh.open.rh;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CadastrarColaboradores extends javax.swing.JFrame {

    public CadastrarColaboradores() throws SQLException {
        initComponents();
        Color minhacor = new Color(0, 51, 51);
        this.getContentPane().setBackground(minhacor);
    }

    public Connection connection() {

        String url = "jdbc:mysql://localhost:3306/rhlaboratorio";
        String username = "root";
        String password = "Ge148926#";

        System.out.println("Connecting database...");
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connect");
            return connection;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

    }

    private void adicionar() {
        try {

            final String sql = "insert into funcionarios(id,nome,email,cpf,rg) values(?,?,?,?,?)";

            PreparedStatement pst = connection().prepareCall(sql);

            pst.setString(1, txtUsId.getText());
            pst.setString(2, txtUsNome.getText());
            pst.setString(3, txtUsEmail.getText());
            pst.setString(4, txtUsRg.getText());
            pst.setString(5, txtUsCpf.getText());

            int adicionado = pst.executeUpdate();

            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        txtUsNome = new javax.swing.JTextField();
        txtUsEmail = new javax.swing.JTextField();
        txtUsCpf = new javax.swing.JTextField();
        txtUsRg = new javax.swing.JTextField();
        btnUsCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableColaboradores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtUsId = new javax.swing.JTextField();
        btnUsCadastrar1 = new javax.swing.JButton();
        spinnerUs = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        btnUsCadastrar2 = new javax.swing.JButton();
        spinnerUsEditar = new javax.swing.JSpinner();
        editarCampos = new javax.swing.JButton();
        btnUsCadastrar3 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastros");
        setResizable(false);

        txtUsNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        txtUsEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        txtUsCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        txtUsRg.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        btnUsCadastrar.setText("Carregar Dados");
        btnUsCadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnUsCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nimbus Sans Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Nimbus Sans Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOME");

        jLabel3.setFont(new java.awt.Font("Nimbus Sans Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMAIL");

        jLabel4.setFont(new java.awt.Font("Nimbus Sans Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Nimbus Sans Narrow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RG");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CADASTRAR COLABORADORES");

        tableColaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email", "CPF", "RG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableColaboradores);
        if (tableColaboradores.getColumnModel().getColumnCount() > 0) {
            tableColaboradores.getColumnModel().getColumn(0).setHeaderValue("ID");
            tableColaboradores.getColumnModel().getColumn(1).setHeaderValue("Nome");
            tableColaboradores.getColumnModel().getColumn(2).setHeaderValue("Email");
            tableColaboradores.getColumnModel().getColumn(3).setHeaderValue("CPF");
            tableColaboradores.getColumnModel().getColumn(4).setHeaderValue("RG");
        }

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preencher todos os campos");

        txtUsId.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        btnUsCadastrar1.setForeground(new java.awt.Color(51, 51, 51));
        btnUsCadastrar1.setText("Salvar");
        btnUsCadastrar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        btnUsCadastrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsCadastrar1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_forever_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jButton1.setText("DELETAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUsCadastrar2.setText("Buscar");
        btnUsCadastrar2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        btnUsCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsCadastrar2ActionPerformed(evt);
            }
        });

        editarCampos.setText("Editar");
        editarCampos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        editarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCamposActionPerformed(evt);
            }
        });

        btnUsCadastrar3.setText("Limpar");
        btnUsCadastrar3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        btnUsCadastrar3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnUsCadastrar3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnUsCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsCadastrar3ActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(editarCampos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUsCadastrar2)
                                .addGap(98, 98, 98)
                                .addComponent(btnUsCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUsCadastrar1)
                                .addGap(12, 12, 12)
                                .addComponent(btnUsCadastrar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsId)
                                    .addComponent(txtUsEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsNome)
                                    .addComponent(txtUsRg)
                                    .addComponent(txtUsCpf)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(spinnerUsEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinnerUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltar)
                        .addGap(36, 36, 36))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(voltar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerUsEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarCampos)
                            .addComponent(btnUsCadastrar2)
                            .addComponent(btnUsCadastrar)
                            .addComponent(btnUsCadastrar1)
                            .addComponent(btnUsCadastrar3))
                        .addGap(2, 2, 2)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btnUsCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsCadastrarActionPerformed

        DefaultTableModel tabelar = (DefaultTableModel) tableColaboradores.getModel();
        final String sql = "select * from funcionarios";
        tabelar.setRowCount(0);
        try {
            PreparedStatement pst = connection().prepareCall(sql);
            ResultSet result = pst.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String email = result.getString("email");
                String rg = result.getString("rg");
                String cpf = result.getString("cpf");

                String idString = String.valueOf(id);

                String[] rowData = {idString, nome, email, rg, cpf};
                tabelar.addRow(rowData);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CadastrarColaboradores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnUsCadastrarActionPerformed

    private void buscarPeloId() {

        final String sql = "select * from funcionarios where id = ?";
        try {
            PreparedStatement pst = connection().prepareCall(sql);

            int idEditar = (int) spinnerUsEditar.getValue();
            int id = idEditar;

            pst.setInt(1, id);
            ResultSet result = pst.executeQuery();

            if (result.next()) {
                txtUsId.setText(result.getString("id"));
                txtUsNome.setText(result.getString("nome"));
                txtUsEmail.setText(result.getString("email"));
                txtUsRg.setText(result.getString("rg"));
                txtUsCpf.setText(result.getString("cpf"));
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado para o ID: " + id);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void btnUsCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsCadastrar1ActionPerformed
        adicionar();

    }//GEN-LAST:event_btnUsCadastrar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        final String sql = "DELETE FROM funcionarios WHERE id = ?";

        try {
            PreparedStatement pst = connection().prepareStatement(sql);

            int idParaExcluir = (int) spinnerUs.getValue();
            int id = idParaExcluir;

            pst.setInt(1, id);

            int linhasAfetadas = pst.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Recurso deletado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "ID  inexistente :(");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CadastrarColaboradores.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUsCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsCadastrar2ActionPerformed
        buscarPeloId();
    }//GEN-LAST:event_btnUsCadastrar2ActionPerformed

    private void editarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCamposActionPerformed
        try {

            final String sql = "UPDATE funcionarios SET nome = ?, email = ?, rg = ?, cpf = ? WHERE id = ?";

            PreparedStatement pst = connection().prepareCall(sql);

            pst.setString(1, txtUsNome.getText());
            pst.setString(2, txtUsEmail.getText());
            pst.setString(3, txtUsRg.getText());
            pst.setString(4, txtUsCpf.getText());

            int idSpinner = (int) spinnerUsEditar.getValue();

            int id = idSpinner;
            pst.setInt(5, id);

            int adicionado = pst.executeUpdate();

            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_editarCamposActionPerformed

    private void btnUsCadastrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsCadastrar3ActionPerformed
        txtUsId.setText("");
        txtUsNome.setText("");
        txtUsRg.setText("");
        txtUsCpf.setText("");
        txtUsEmail.setText("");
     }//GEN-LAST:event_btnUsCadastrar3ActionPerformed

    private void btnUsCadastrar3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnUsCadastrar3AncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_btnUsCadastrar3AncestorAdded

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
        /*// TODO add your handling code here:
    }//GEN-LAST:event_voltarActionPerformed

    /**
     *
     * @param args
         */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsCadastrar;
    private javax.swing.JButton btnUsCadastrar1;
    private javax.swing.JButton btnUsCadastrar2;
    private javax.swing.JButton btnUsCadastrar3;
    private javax.swing.JButton editarCampos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JSpinner spinnerUs;
    private javax.swing.JSpinner spinnerUsEditar;
    private javax.swing.JTable tableColaboradores;
    private javax.swing.JTextField txtUsCpf;
    private javax.swing.JTextField txtUsEmail;
    private javax.swing.JTextField txtUsId;
    private javax.swing.JTextField txtUsNome;
    private javax.swing.JTextField txtUsRg;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

}
