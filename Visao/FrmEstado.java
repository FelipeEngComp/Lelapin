/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Controle.ConectaBanco;
import Controle.ModeloTabela;


public class FrmEstado extends javax.swing.JFrame {
    
    ConectaBanco conecta = new ConectaBanco();
    FrmCidade cidade = new FrmCidade();
    
    public FrmEstado() {
        initComponents();
       
        PreencherTabela("select * from estados order by id_estados");
    }
    public FrmEstado(FrmCidade fCid) {
        initComponents();
        
        PreencherTabela("select * from estados order by id_estados");
        cidade = fCid;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelCod = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSigla = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jButtonPrimeiro = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de estados");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCod.setText("Código:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Sigla:");

        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldSigla.setEnabled(false);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Add.png"))); // NOI18N
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Edit.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Editar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Delete.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Deletar");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
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

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Cancel.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableEstado);

        jButtonPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Backward.png"))); // NOI18N
        jButtonPrimeiro.setToolTipText("Primeiro elemento inserido");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        Ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Forward.png"))); // NOI18N
        Ultimo.setToolTipText("Último elemento inserido");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
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

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Warning.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCod)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCod)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ultimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonProximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 32, 32));
        jLabel2.setText("Formulário de cadastro de estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(354, 354, 354))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(615, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
         conecta.conexao();//ser realizado a conexao com o banco de dados.
       try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.con.prepareStatement("update estados set nome_estado = ?,sigla_estado = ? where id_estados = ?");//recebe a resposta da conexao do banco
            pst.setString(1,jTextFieldNome.getText().toUpperCase() );//passagem de parametros
            pst.setString(2,jTextFieldSigla.getText().toUpperCase() );
            pst.setInt(3, Integer.parseInt(jTextFieldCod.getText()));
            pst.executeUpdate();//executa a insercao
            JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso!");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar.\nErro: "+ex);
        }
        
        PreencherTabela("select * from estados order by id_estados");
       jButtonCancelar.setEnabled(false); 
       jTextFieldNome.setEnabled(false);
       jTextFieldSigla.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonExcluir.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jTextFieldSigla.setText("");
        conecta.desconecta();//ser realizado a conexao com o banco de dados.
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         conecta.conexao();//ser realizado a conexao com o banco de dados.
        try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.con.prepareStatement("insert into estados(nome_estado,sigla_estado)values(?,?)");//recebe a resposta da conexao do banco
            pst.setString(1,jTextFieldNome.getText().toUpperCase() );//passagem de parametros
            pst.setString(2,jTextFieldSigla.getText().toUpperCase() );
            pst.executeUpdate();//executa a insercao
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
            //FrmCidade frmc = new FrmCidade();
           // frmc.AtualizaTabelaEstado();
            } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       jButtonCancelar.setEnabled(false); 
       jTextFieldNome.setEnabled(false);
       jTextFieldSigla.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonExcluir.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jTextFieldSigla.setText("");
       
       PreencherTabela("select * from estados order by id_estados");
        conecta.desconecta();//ser realizado a conexao com o banco de dados.
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       conecta.conexao();
        int teste = 1;
        try {
            PreparedStatement pst = conecta.con.prepareStatement("delete from estados where id_estados = ?");
            pst.setInt(1, Integer.parseInt(jTextFieldCod.getText()));
            pst.execute();
             teste = 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Estado não pode ser excluído\nPois deve está sendo usado por outra tabela ");
        }
        
        if(teste==0)
            JOptionPane.showMessageDialog(rootPane, "Deletado com sucesso!");
        
        jButtonCancelar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldSigla.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldCod.setText("");
        jTextFieldSigla.setText("");
        
        PreencherTabela("select * from estados order by id_estados");
        conecta.desconecta();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
        cidade.AtualizaTabelaEstado();
       
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       jButtonCancelar.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jTextFieldSigla.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jTextFieldSigla.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        conecta.conexao();
        
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        try {
            conecta.executaSQL("select * from estados order by id_estados");
            conecta.rs.first();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estados")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao mostrar dados\nErro: "+ ex);
        }
        conecta.desconecta();
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        // TODO add your handling code here:
        conecta.conexao();
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
         try {
            conecta.executaSQL("select * from estados order by id_estados");
            conecta.rs.last();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estados")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao mostrar dados\nErro: "+ ex);
        }
         conecta.desconecta();
    }//GEN-LAST:event_UltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        conecta.conexao();
        
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        try {
            
            conecta.rs.previous();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estados")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o primeiro elemento ");
        }
        
        conecta.desconecta();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        conecta.conexao();
        
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true); 
          try {
            // TODO add your handling code here:
            conecta.rs.next();
            jTextFieldCod.setText(String.valueOf(conecta.rs.getInt("id_estados")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o último elemento ");
        }
          
        conecta.desconecta();
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
       
       jTextFieldNome.setEnabled(false);
       jTextFieldSigla.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonExcluir.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jTextFieldSigla.setText("");
       jButtonCancelar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    
    public void PreencherTabela(String SQL){
        conecta.conexao();
        
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID","Nome","Sigla"};
        
        conecta.executaSQL(SQL);
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("id_estados"),conecta.rs.getString("nome_estado"),conecta.rs.getString("sigla_estado")});
            }while(conecta.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro ao inserir na tabela");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableEstado.setModel(modelo);
        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(125);//definindo tamanho em pixel
        jTableEstado.getColumnModel().getColumn(0).setResizable(false);
        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(315);//definindo tamanho em pixel
        jTableEstado.getColumnModel().getColumn(1).setResizable(false);
        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(125);//definindo tamanho em pixel
        jTableEstado.getColumnModel().getColumn(2).setResizable(false);
        //chama a tabela
        jTableEstado.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        conecta.desconecta();
        
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ultimo;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSigla;
    // End of variables declaration//GEN-END:variables
}
