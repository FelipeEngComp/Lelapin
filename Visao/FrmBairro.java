/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConectaBanco;
import Controle.ControleBairro;
import Controle.ModeloTabela;
import Modelo.ModeloBairros;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author felipe
 */
public class FrmBairro extends javax.swing.JFrame {
    
    ConectaBanco conCidade = new ConectaBanco();
    ConectaBanco conBairro = new ConectaBanco();
    ControleBairro control = new ControleBairro();
    ModeloBairros mod = new ModeloBairros();
    FrmCliente Fcliente = new FrmCliente();
    FrmFornecedor Fforn = new FrmFornecedor();
    
    public FrmBairro() {
        initComponents();
        AtualizaTabelaCidade();
        PreencherTabela("select * from bairros inner join cidades on id_cidades = id_cidade order by id_bairros");
    }
    
    public FrmBairro(FrmCliente cliente) {
        initComponents();
        AtualizaTabelaCidade();
        PreencherTabela("select * from bairros inner join cidades on id_cidades = id_cidade order by id_bairros");
        Fcliente = cliente;
    }
    
    public FrmBairro(FrmFornecedor forn) {
        initComponents();
        AtualizaTabelaCidade();
        PreencherTabela("select * from bairros inner join cidades on id_cidades = id_cidade order by id_bairros");
        Fforn = forn;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxCidades = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBairro = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 348));

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jTextFieldCod.setText("   ");
        jTextFieldCod.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jComboBoxCidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Cidades:");

        jTableBairro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableBairro);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Add.png"))); // NOI18N
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Edit.png"))); // NOI18N
        jButtonAtualizar.setToolTipText("Editar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Delete.png"))); // NOI18N
        jButtonDeletar.setToolTipText("Deletar");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Warning.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Backward.png"))); // NOI18N
        jButtonPrimeiro.setToolTipText("Primeiro elemento inserido");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Forward.png"))); // NOI18N
        jButtonUltimo.setToolTipText("Último elemento inserido");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Left.png"))); // NOI18N
        jButtonAnterior.setToolTipText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Right.png"))); // NOI18N
        jButtonProximo.setToolTipText("Próximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButton9.setText("jButton9");

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancel.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButton11.setText("Add");
        jButton11.setToolTipText("Adicionar cidades");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Save.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton11))
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonAnterior)
                                    .addComponent(jButtonProximo))
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jButtonPrimeiro)
                            .addComponent(jButtonUltimo)
                            .addComponent(jButtonSair)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonDeletar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 10, 10));
        jLabel1.setText("Formulário de cadastro de Bairros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(577, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        FrmCidade Frm = new FrmCidade(this);
        
        Frm.setVisible(true);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(true);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        
        Fcliente.PreencherCombo();
        Fforn.PreencherCombo();
        dispose();
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        conCidade.conexao();
        
        try {
            
            mod.setNome_bairro(jTextFieldNome.getText().toUpperCase());
            conCidade.executaSQL("select * from cidades where nome_cidades = '"+jComboBoxCidades.getSelectedItem()+"'");
            conCidade.rs.first();
            mod.setCod_cidade(conCidade.rs.getInt("id_cidade"));
            control.InserirBairro(mod);
            PreencherTabela("select * from bairros inner join cidades on id_cidades = id_cidade order by id_bairros");
        } catch (SQLException ex) {
            Logger.getLogger(FrmBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        jTextFieldNome.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        
        conCidade.desconecta();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        conBairro.conexao();
        try {
            // TODO add your handling code here:
            mod.setCod_bairro(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome_bairro(jTextFieldNome.getText().toUpperCase());
            conBairro.executaSQL("select * from cidade where nome_cidades = '"+jComboBoxCidades.getSelectedItem()+"'");
            conBairro.rs.first();
            mod.setCod_cidade(conBairro.rs.getInt("id_cidades"));
            
            control.AlterarBairro(mod);
            PreencherTabela("select * from bairros inner join cidades on id_cidades = id_cidade order by id_bairros");
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextFieldNome.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        conBairro.desconecta();
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
//        try {
            // TODO add your handling code here:
            mod.setCod_bairro(Integer.parseInt(jTextFieldCod.getText()));
//            mod.setNome_bairro(jTextFieldNome.getText());
//            mod.setCod_cidade(conBairro.rs.getInt("id_cidades"));
            control.DeletarBairro(mod);
            PreencherTabela("select * from bairros inner join cidades on id_cidades = id_cidade order by id_bairros");
//        } catch (SQLException ex) {
//            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        jTextFieldNome.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        conCidade.conexao();
        conBairro.conexao();
        jTextFieldNome.setEnabled(true);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        
        conBairro.executaSQL("select * from bairros order by id_bairros");
        try {
            conBairro.rs.first();
            jTextFieldCod.setText(String.valueOf(conBairro.rs.getInt("id_bairros")));
            jTextFieldNome.setText(conBairro.rs.getString("nome_Bairros"));
            
            conCidade.executaSQL("select * from cidades where id_cidade = '"+conBairro.rs.getInt("id_cidades")+"'");
            conCidade.rs.first();
            jComboBoxCidades.setSelectedItem(conCidade.rs.getString("nome_cidades"));
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        conCidade.desconecta();
        conBairro.desconecta();
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        conCidade.conexao();
        conBairro.conexao();
        jTextFieldNome.setEnabled(true);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        
        conBairro.executaSQL("select * from bairros order by id_bairros");
        try {
            conBairro.rs.last();
            jTextFieldCod.setText(String.valueOf(conBairro.rs.getInt("id_bairros")));
            jTextFieldNome.setText(conBairro.rs.getString("nome_Bairros"));
            
            conCidade.executaSQL("select * from cidades where id_cidade = '"+conBairro.rs.getInt("id_cidades")+"'");
            conCidade.rs.first();
            jComboBoxCidades.setSelectedItem(conCidade.rs.getString("nome_cidades"));
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        conCidade.desconecta();
        conBairro.desconecta();
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        conCidade.conexao();
        conBairro.conexao();
        jTextFieldNome.setEnabled(true);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        
        try {
            conBairro.rs.previous();
            jTextFieldCod.setText(String.valueOf(conBairro.rs.getInt("id_bairros")));
            jTextFieldNome.setText(conBairro.rs.getString("nome_Bairros"));
            
            conCidade.executaSQL("select * from cidades where id_cidade = '"+conBairro.rs.getInt("id_cidades")+"'");
            conCidade.rs.first();
            jComboBoxCidades.setSelectedItem(conCidade.rs.getString("nome_cidades"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o primeiro elemento.");
        }
        conCidade.desconecta();
        conBairro.desconecta();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        conCidade.conexao();
        conBairro.conexao();
        jTextFieldNome.setEnabled(true);
        jTextFieldCod.setEnabled(false);
        jButtonAtualizar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        
        try {
            conBairro.rs.next();
            jTextFieldCod.setText(String.valueOf(conBairro.rs.getInt("id_bairros")));
            jTextFieldNome.setText(conBairro.rs.getString("nome_Bairros"));
            
            conCidade.executaSQL("select * from cidades where id_cidade = '"+conBairro.rs.getInt("id_cidades")+"'");
            conCidade.rs.first();
            jComboBoxCidades.setSelectedItem(conCidade.rs.getString("nome_cidades"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o último elemento.");
        }
        conCidade.desconecta();
        conBairro.desconecta();
    }//GEN-LAST:event_jButtonProximoActionPerformed

    public void AtualizaTabelaCidade(){
        conCidade.conexao();
        jComboBoxCidades.removeAllItems();
        try {
            conCidade.executaSQL("select * from cidades order by nome_cidades");
            conCidade.rs.first();
            do{
                jComboBoxCidades.addItem(conCidade.rs.getString("nome_cidades"));
            }while(conCidade.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados estado.\nErro: "+ex);
        }
        conCidade.desconecta();
    }
    
    public void PreencherTabela(String SQL){
        conBairro.conexao();
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID","Bairro","Cidade"};
        
        conBairro.executaSQL(SQL);
        try{
            conBairro.rs.first();
            do{
                dados.add(new Object[]{conBairro.rs.getInt("id_bairros"),conBairro.rs.getString("nome_bairros"),conBairro.rs.getString("nome_cidades")});
            }while(conBairro.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro ao inserir na tabela");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableBairro.setModel(modelo);
        jTableBairro.getColumnModel().getColumn(0).setPreferredWidth(115);//definindo tamanho em pixel
        jTableBairro.getColumnModel().getColumn(0).setResizable(false);
        jTableBairro.getColumnModel().getColumn(1).setPreferredWidth(282);//definindo tamanho em pixel
        jTableBairro.getColumnModel().getColumn(1).setResizable(false);
        jTableBairro.getColumnModel().getColumn(2).setPreferredWidth(115);//definindo tamanho em pixel
        jTableBairro.getColumnModel().getColumn(2).setResizable(false);
        //chama a tabela
        jTableBairro.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableBairro.setAutoResizeMode(jTableBairro.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableBairro.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        conBairro.desconecta();
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBairro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxCidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBairro;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
