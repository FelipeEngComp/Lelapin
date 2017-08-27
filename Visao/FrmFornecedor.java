/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConectaBanco;
import Controle.ControleFornecedor;
import Controle.ModeloTabela;
import Modelo.ModeloFornecedores;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;



public class FrmFornecedor extends javax.swing.JFrame {

    ConectaBanco conTel    = new ConectaBanco();
    ConectaBanco conBairro = new ConectaBanco();
    ConectaBanco conCidade = new ConectaBanco();
    ConectaBanco conEstado = new ConectaBanco();
    ConectaBanco conForn   = new ConectaBanco();
    ConectaBanco conFT   = new ConectaBanco();
    ModeloFornecedores mod = new ModeloFornecedores();
    ControleFornecedor control = new ControleFornecedor();
    FrmProduto Fprod = new FrmProduto();
    
    public FrmFornecedor() {
        initComponents();
        conTel.conexao();
        conBairro.conexao();
        conCidade.conexao();
        conEstado.conexao();
        conForn.conexao();
        conFT.conexao();
        PreencherTabela("select * from fornecedores inner join itens_tel_forn on id_fornecedor = id_forn \n" +
"inner join telefone on itens_tel_forn.id_tel = telefone.id_telefone order by nome_fornecedor");
        Mascara();
        PreencherCombo();
    }
    
    public FrmFornecedor(FrmProduto produto) {
        initComponents();
        conTel.conexao();
        conBairro.conexao();
        conCidade.conexao();
        conEstado.conexao();
        conForn.conexao();
        conFT.conexao();
        PreencherTabela("select * from fornecedores inner join itens_tel_forn on id_fornecedor = id_forn \n" +
"inner join telefone on itens_tel_forn.id_tel = telefone.id_telefone order by nome_fornecedor");
        Mascara();
        PreencherCombo();
        Fprod = produto;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldCNPF = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableForne = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        JButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cód:");

        jTextFieldCod.setEnabled(false);

        jLabel3.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabel4.setText("Tel:");

        jComboBoxTel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Endereço:");

        jTextFieldEndereco.setEnabled(false);

        jLabel6.setText("CNPJ:");

        jFormattedTextFieldCNPF.setEnabled(false);

        jTableForne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableForne);

        jLabel7.setText("Bairro:");

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBairro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxBairroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxBairroMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxBairroMouseEntered(evt);
            }
        });
        jComboBoxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBairroActionPerformed(evt);
            }
        });

        jLabel8.setText("Cidade:");

        jLabelCidade.setText("...");

        jLabelEstado.setText("Estado:");

        JButtonSalvar.setText("Salvar");
        JButtonSalvar.setEnabled(false);
        JButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalvarActionPerformed(evt);
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

        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.setToolTipText("Primeiro elemento");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setText(">>");
        jButtonUltimo.setToolTipText("Último elemento");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.setToolTipText("Elemento anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCNPF, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEstado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldCNPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelEstado)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonNovo))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 33, 33));
        jLabel1.setText("Cadastro de Fornecedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        Fprod.PreencherCombo();
        dispose();
        conBairro.desconecta();
        conCidade.desconecta();
        conEstado.desconecta();
        conFT.desconecta();
        conForn.desconecta();
        conTel.desconecta();
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        JButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jFormattedTextFieldCNPF.setEnabled(true);
        jTextFieldCod.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCNPF.setText("");
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        JButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jFormattedTextFieldCNPF.setEnabled(true);
        
        conForn.executaSQL("select * from fornecedores order by nome_fornecedor");
       
        try {
            //retornar os primeiros elementos do banco clientes
            conForn.rs.first();
            conFT.executaSQL("select * from itens_tel_forn where id_forn = '"+conForn.rs.getInt("id_fornecedor")+"'");
            jTextFieldCod.setText(String.valueOf(conForn.rs.getInt("id_fornecedor")));
            jTextFieldNome.setText(conForn.rs.getString("nome_fornecedor"));
            jTextFieldEndereco.setText(conForn.rs.getString("endereco_fornecedor"));
            jFormattedTextFieldCNPF.setText(conForn.rs.getString("cnpj_fornecedor"));
            
            //chama o numero na combobox telefone
            conFT.rs.first();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conFT.rs.getInt("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conForn.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Verifique se há algum elemento inserido ");
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        jButtonAlterar.setEnabled(true);
        JButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jFormattedTextFieldCNPF.setEnabled(true);
        
        conForn.executaSQL("select * from fornecedores order by nome_fornecedor");
       
        try {
            //retornar os primeiros elementos do banco clientes
            conForn.rs.last();
            conFT.executaSQL("select * from itens_tel_forn where id_forn = '"+conForn.rs.getInt("id_fornecedor")+"'");
            jTextFieldCod.setText(String.valueOf(conForn.rs.getInt("id_fornecedor")));
            jTextFieldNome.setText(conForn.rs.getString("nome_fornecedor"));
            jTextFieldEndereco.setText(conForn.rs.getString("endereco_fornecedor"));
            jFormattedTextFieldCNPF.setText(conForn.rs.getString("cnpj_fornecedor"));
            
            //chama o numero na combobox telefone
            conFT.rs.last();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conFT.rs.getInt("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conForn.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Verifique se há algum elemento inserido ");
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        jButtonAlterar.setEnabled(true);
        JButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jFormattedTextFieldCNPF.setEnabled(true);
        
        try {
            //retornar os primeiros elementos do banco clientes
            conForn.rs.previous();
            conFT.executaSQL("select * from itens_tel_forn where id_forn = '"+conForn.rs.getInt("id_fornecedor")+"'");
            jTextFieldCod.setText(String.valueOf(conForn.rs.getInt("id_fornecedor")));
            jTextFieldNome.setText(conForn.rs.getString("nome_fornecedor"));
            jTextFieldEndereco.setText(conForn.rs.getString("endereco_fornecedor"));
            jFormattedTextFieldCNPF.setText(conForn.rs.getString("cnpj_fornecedor"));
            
            //chama o numero na combobox telefone
            conFT.rs.first();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conFT.rs.getInt("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conForn.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o primeiro elemento ");
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        jButtonAlterar.setEnabled(true);
        JButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jFormattedTextFieldCNPF.setEnabled(true);
        
        try {
            //retornar os primeiros elementos do banco clientes
            conForn.rs.next();
            conFT.executaSQL("select * from itens_tel_forn where id_forn = '"+conForn.rs.getInt("id_fornecedor")+"'");
            jTextFieldCod.setText(String.valueOf(conForn.rs.getInt("id_fornecedor")));
            jTextFieldNome.setText(conForn.rs.getString("nome_fornecedor"));
            jTextFieldEndereco.setText(conForn.rs.getString("endereco_fornecedor"));
            jFormattedTextFieldCNPF.setText(conForn.rs.getString("cnpj_fornecedor"));
            
            //chama o numero na combobox telefone
            conFT.rs.first();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conFT.rs.getInt("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conForn.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o último elemento ");
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jButtonAlterar.setEnabled(false);
        JButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jFormattedTextFieldCNPF.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCNPF.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void JButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
            mod.setNome_forne(jTextFieldNome.getText().toUpperCase());
            mod.setEnd_forne(jTextFieldEndereco.getText().toUpperCase());
            mod.setCnpj_forne(jFormattedTextFieldCNPF.getText());
            
            
            //pega o Id do bairro e da cidade selecionado e envia para o controle
            conBairro.executaSQL("select * from bairros where nome_bairros = '"+jComboBoxBairro.getSelectedItem()+"'");//selecionar o estado
            conBairro.rs.first();
            mod.setCod_bairro_forne(conBairro.rs.getInt("id_bairros"));
            mod.setCod_cid_forne(conBairro.rs.getInt("id_cidades"));
            
            //pegar o id do telefone selecionado e envia ao controle
            conTel.executaSQL("select * from telefone where numero_tel = '"+jComboBoxTel.getSelectedItem()+"'");
            conTel.rs.first();
            mod.setCod_tel_forne(conTel.rs.getInt("id_telefone"));
    
            //enviando para o controle
          control.SalvaFornecedor(mod);
            
          PreencherTabela("select * from fornecedores inner join itens_tel_forn on id_fornecedor = id_forn \n" +
"inner join telefone on itens_tel_forn.id_tel = telefone.id_telefone order by nome_fornecedor");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados" );
        } 
        
        jButtonAlterar.setEnabled(false);
        JButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jFormattedTextFieldCNPF.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCNPF.setText("");
    }//GEN-LAST:event_JButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            mod.setCod_forne(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome_forne(jTextFieldNome.getText().toUpperCase());
            mod.setCnpj_forne(jFormattedTextFieldCNPF.getText());
            mod.setEnd_forne(jTextFieldEndereco.getText().toUpperCase());
            
            //pega o Id do bairro e da cidade selecionado e envia para o controle
            conBairro.executaSQL("select * from bairros where nome_bairros = '"+jComboBoxBairro.getSelectedItem()+"'");//selecionar o estado
            conBairro.rs.first();
            mod.setCod_bairro_forne(conBairro.rs.getInt("id_bairros"));
            mod.setCod_cid_forne(conBairro.rs.getInt("id_cidades"));
            
            //pegar o id do telefone selecionado e envia ao controle
            conTel.executaSQL("select * from telefone where numero_tel = '"+jComboBoxTel.getSelectedItem()+"'");
            conTel.rs.first();
            mod.setCod_tel_forne(conTel.rs.getInt("id_telefone"));
    
            //enviando para o controle
            control.AlterarFornecedor(mod);
            
            PreencherTabela("select * from fornecedores inner join itens_tel_forn on id_fornecedor = id_forn \n" +
"inner join telefone on itens_tel_forn.id_tel = telefone.id_telefone order by nome_fornecedor");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados"+ex );
        } 
        
        JButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jFormattedTextFieldCNPF.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCNPF.setText("");
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        mod.setCod_forne(Integer.parseInt(jTextFieldCod.getText()));
        control.ExcluirFornecedor(mod);
        
        PreencherTabela("select * from fornecedores inner join itens_tel_forn on id_fornecedor = id_forn \n" +
"inner join telefone on itens_tel_forn.id_tel = telefone.id_telefone order by nome_fornecedor");
        
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        JButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jFormattedTextFieldCNPF.setEnabled(false);
        jTextFieldCod.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldCNPF.setText("");
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jComboBoxBairroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxBairroMouseEntered
        // TODO add your handling code here:
       AtualizaCidEst();
    }//GEN-LAST:event_jComboBoxBairroMouseEntered

    private void jComboBoxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBairroActionPerformed

    private void jComboBoxBairroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxBairroMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxBairroMousePressed

    private void jComboBoxBairroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxBairroMouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBoxBairroMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmTelefone frm = new FrmTelefone(this);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FrmBairro frm = new FrmBairro(this);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Mascara(){
        try {
            MaskFormatter cnpj = new MaskFormatter("##.###.###/####-##");
            jFormattedTextFieldCNPF.setFormatterFactory(new DefaultFormatterFactory(cnpj));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher RG");
        }
    }

    public void PreencherCombo(){
        //Preenche combobox telefone
        jComboBoxTel.removeAllItems();//limpa a combo box        
        try{
            conTel.executaSQL("select * from telefone order by numero_tel");//seleciona a tabela estado e ordena por ordem alfabetica
            conTel.rs.first();
            do{
                jComboBoxTel.addItem(conTel.rs.getString("numero_tel"));
            }while(conTel.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados estado.\nErro: "+ex);
        }  
        
        //Preenche combobox bairro
        jComboBoxBairro.removeAllItems();//limpa a combo box        
        try{
            conBairro.executaSQL("select * from bairros order by nome_bairros");//seleciona a tabela estado e ordena por ordem alfabetica
            conBairro.rs.first();
            do{
                jComboBoxBairro.addItem(conBairro.rs.getString("nome_bairros"));
            }while(conBairro.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados estado.\nErro: "+ex);
        }  
    }
    
    public void AtualizaCidEst(){
        try {
            conBairro.executaSQL("select * from bairros inner join cidades on bairros.id_cidades = cidades.id_cidade inner join estados on cidades.id_estado = estados.id_estados where nome_bairros = '"+jComboBoxBairro.getSelectedItem()+"'");//selecionar o estado
            conBairro.rs.first();
            //coloca o nome da cidade
            
            jLabelCidade.setText(conBairro.rs.getString("nome_cidades"));
            
         
            jLabelEstado.setText(conBairro.rs.getString("sigla_estado"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: "+ex);
        }
    }
    
    public void PreencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID","Fornecedor","CNPJ","Telefone"};
        
        conForn.executaSQL(SQL);
        try{
            conForn.rs.first();
            do{
                dados.add(new Object[]{conForn.rs.getInt("id_fornecedor"),conForn.rs.getString("nome_fornecedor"),conForn.rs.getString("cnpj_fornecedor"),conForn.rs.getString("numero_tel")});
            }while(conForn.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Tabela vazia");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableForne.setModel(modelo);
        jTableForne.getColumnModel().getColumn(0).setPreferredWidth(133);//definindo tamanho em pixel
        jTableForne.getColumnModel().getColumn(0).setResizable(false);
        jTableForne.getColumnModel().getColumn(1).setPreferredWidth(332);//definindo tamanho em pixel
        jTableForne.getColumnModel().getColumn(1).setResizable(false);
        jTableForne.getColumnModel().getColumn(2).setPreferredWidth(190);//definindo tamanho em pixel
        jTableForne.getColumnModel().getColumn(2).setResizable(false);
        jTableForne.getColumnModel().getColumn(3).setPreferredWidth(190);//definindo tamanho em pixel
        jTableForne.getColumnModel().getColumn(3).setResizable(false);
        //chama a tabela
        jTableForne.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableForne.setAutoResizeMode(jTableForne.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableForne.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        
        
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
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxTel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCNPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableForne;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
