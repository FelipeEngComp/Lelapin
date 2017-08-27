/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConectaBanco;
import Controle.ControleProduto;
import Controle.ModeloTabela;
import Modelo.ModeloProdutos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
//import javax.swing.text.DefaultFormatterFactory;


/**
 *
 * @author felipe
 */
public class FrmProduto extends javax.swing.JFrame {
    
    ModeloProdutos mod = new ModeloProdutos();
    ConectaBanco conProd = new ConectaBanco();
    ConectaBanco conForn = new ConectaBanco();
    ControleProduto control = new ControleProduto();
    
    public FrmProduto() {
        initComponents();
        conForn.conexao();
        conProd.conexao();
        PreencherCombo();
        PreencherTabela("select*from produtos order by id_produto");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxForn = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProd = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jFormattedTextFieldCompra = new javax.swing.JFormattedTextField();
        jFormattedTextFieldVenda = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 22, 22));
        jLabel1.setText("Cadastro de produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cód:");

        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabel4.setText("Quantidade:");

        jTextFieldQuantidade.setEnabled(false);

        jLabel5.setText("Fornecedor:");

        jComboBoxForn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProd);

        jLabel6.setText("Preço de compra:R$");

        jLabel7.setText("Preço de venda:R$");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Editar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Excluir");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButton6.setText("+");
        jButton6.setToolTipText("Adicionar fornecedor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jFormattedTextFieldCompra.setToolTipText("Padrão R$00.00");
        jFormattedTextFieldCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCompraActionPerformed(evt);
            }
        });

        jFormattedTextFieldVenda.setToolTipText("Padrão R$00.00");

        jLabel8.setForeground(new java.awt.Color(233, 34, 34));
        jLabel8.setText("Use o padrão R$00.00");

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(3, 3, 3)
                                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jFormattedTextFieldCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFormattedTextFieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jComboBoxForn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))))
                            .addComponent(jLabel6))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextFieldCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSair)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(385, 385, 385))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
        conForn.desconecta();
        conProd.desconecta();
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jFormattedTextFieldCompra.setEnabled(true);
        jFormattedTextFieldVenda.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCompra.setText("");
        jFormattedTextFieldVenda.setText("");
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jFormattedTextFieldCompra.setEnabled(false);
        jFormattedTextFieldVenda.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCompra.setText("");
        jFormattedTextFieldVenda.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
            mod.setNome_prod(jTextFieldNome.getText().toUpperCase());
            mod.setQuant_prod(Integer.parseInt(jTextFieldQuantidade.getText()));
            mod.setCompra_prod(Float.parseFloat(jFormattedTextFieldCompra.getText()));
            mod.setVenda_prod(Float.parseFloat(jFormattedTextFieldVenda.getText()));
            
            
            //pega o Id do bairro e da cidade selecionado e envia para o controle
            conForn.executaSQL("select * from fornecedores where nome_fornecedor = '"+jComboBoxForn.getSelectedItem()+"'");//selecionar o estado
            conForn.rs.first();
            mod.setCod_forn(conForn.rs.getInt("id_fornecedor"));
             
    
          //enviando para o controle
          control.SalvarProduto(mod);
            
          PreencherTabela("select*from produtos order by id_produto"); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados" );
        }
        
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jFormattedTextFieldCompra.setEnabled(false);
        jFormattedTextFieldVenda.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCompra.setText("");
        jFormattedTextFieldVenda.setText("");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            mod.setCod_prod(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome_prod(jTextFieldNome.getText().toUpperCase());
            mod.setCompra_prod(Float.parseFloat(jFormattedTextFieldCompra.getText()));
            mod.setVenda_prod(Float.parseFloat(jFormattedTextFieldVenda.getText()));
            mod.setQuant_prod(Integer.parseInt(jTextFieldQuantidade.getText()));
            
            //pega o Id do bairro e da cidade selecionado e envia para o controle
            conForn.executaSQL("select * from fornecedores where nome_fornecedor = '"+jComboBoxForn.getSelectedItem()+"'");//selecionar o estado
            conForn.rs.first();
            mod.setCod_forn(conForn.rs.getInt("id_fornecedor"));
            
            //enviando para o controle
            control.EditarProduto(mod);
            PreencherTabela("select*from produtos order by id_produto");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados"+ex );
        } 
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jFormattedTextFieldCompra.setEnabled(false);
        jFormattedTextFieldVenda.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCompra.setText("");
        jFormattedTextFieldVenda.setText("");
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        
        mod.setCod_prod(Integer.parseInt(jTextFieldCod.getText()));
        control.ExcluirProduto(mod);
        PreencherTabela("select*from produtos order by id_produto");
        
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jFormattedTextFieldCompra.setEnabled(false);
        jFormattedTextFieldVenda.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCompra.setText("");
        jFormattedTextFieldVenda.setText("");
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        FrmFornecedor frm = new FrmFornecedor(this);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jFormattedTextFieldCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCompraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        PreencherTabela("select*from produtos where nome_produto like '%"+jTextFieldPesquisar.getText().toUpperCase()+"%'");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdMouseClicked
        String nome_produto = ""+jTableProd.getValueAt(jTableProd.getSelectedRow(),1);
        
        conProd.executaSQL("select*from produtos where nome_produto ='"+nome_produto+"'");
        try {
            conProd.rs.first();
            jTextFieldCod.setText(String.valueOf(conProd.rs.getInt("id_produto")));
            jTextFieldNome.setText(conProd.rs.getString("nome_produto"));
            jTextFieldQuantidade.setText(String.valueOf(conProd.rs.getInt("quantidade")));
            jFormattedTextFieldCompra.setText(String.valueOf(conProd.rs.getFloat("preco_compra")));
            jFormattedTextFieldVenda.setText(String.valueOf(conProd.rs.getFloat("preco_venda")));
            //seleciona nome do produto pelo seu id
            conForn.executaSQL("select*from fornecedores where id_fornecedor = '"+conProd.rs.getInt("id_fornecedor")+"'");
            conForn.rs.first();
            jComboBoxForn.setSelectedItem(conForn.rs.getString("nome_fornecedor"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jFormattedTextFieldCompra.setEnabled(true);
        jFormattedTextFieldVenda.setEnabled(true);
        
    }//GEN-LAST:event_jTableProdMouseClicked

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    public void PreencherCombo(){
        //Preenche combobox telefone
        jComboBoxForn.removeAllItems();//limpa a combo box        
        try{
            conForn.executaSQL("select * from fornecedores order by nome_fornecedor");//seleciona a tabela estado e ordena por ordem alfabetica
            conForn.rs.first();
            do{
                jComboBoxForn.addItem(conForn.rs.getString("nome_fornecedor"));
            }while(conForn.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados estado.\nErro: "+ex);
        }
    }
    
    public void PreencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID","Produto","Quantidade","R$ Valor comprado","R$ Valor vendido"};
        
        conProd.executaSQL(SQL);
        try{
            conProd.rs.first();
            do{
                dados.add(new Object[]{conProd.rs.getInt("id_produto"),conProd.rs.getString("nome_produto"),conProd.rs.getString("quantidade"),
                    conProd.rs.getString("preco_compra"),conProd.rs.getString("preco_venda")});
                
            }while(conProd.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Tabela vazia ou\nelemento não encontrado");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableProd.setModel(modelo);
        jTableProd.getColumnModel().getColumn(0).setPreferredWidth(120);//definindo tamanho em pixel
        jTableProd.getColumnModel().getColumn(0).setResizable(false);
        jTableProd.getColumnModel().getColumn(1).setPreferredWidth(190);//definindo tamanho em pixel
        jTableProd.getColumnModel().getColumn(1).setResizable(false);
        jTableProd.getColumnModel().getColumn(2).setPreferredWidth(190);//definindo tamanho em pixel
        jTableProd.getColumnModel().getColumn(2).setResizable(false);
        jTableProd.getColumnModel().getColumn(3).setPreferredWidth(190);//definindo tamanho em pixel
        jTableProd.getColumnModel().getColumn(3).setResizable(false);
        jTableProd.getColumnModel().getColumn(4).setPreferredWidth(190);//definindo tamanho em pixel
        jTableProd.getColumnModel().getColumn(4).setResizable(false);

        //chama a tabela
        jTableProd.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableProd.setAutoResizeMode(jTableProd.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableProd.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        
        
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
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxForn;
    private javax.swing.JFormattedTextField jFormattedTextFieldCompra;
    private javax.swing.JFormattedTextField jFormattedTextFieldVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProd;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
