/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConectaBanco;
import Controle.ControleCliente;
import Controle.ModeloTabela;
import Modelo.ModeloClientes;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;


public class FrmCliente extends javax.swing.JFrame {

    ConectaBanco conCliente = new ConectaBanco();
    ConectaBanco conCT      = new ConectaBanco();
    ConectaBanco conTel     = new ConectaBanco();
    ConectaBanco conBairro  = new ConectaBanco();
    ConectaBanco conCid     = new ConectaBanco();
    ModeloClientes mod = new ModeloClientes();
    ControleCliente control = new ControleCliente();
            
    public FrmCliente() {
        initComponents();
        Mascara();
        PreencherCombo();
        PreencherTabela("select * from clientes inner join itens_clie_tel on clientes.id_cliente = itens_clie_tel.id_cliente\n" +
"inner join telefone on id_tel = id_telefone inner join bairros on clientes.id_bairro = bairros.id_bairros\n" +
"inner join cidades on bairros.id_cidades = cidades.id_cidade order by nome_cliente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTel = new javax.swing.JComboBox<>();
        jButtonAddTel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jButtonAddBairro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCliente);

        jLabel3.setText("Nome:");

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Cód:");

        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jLabel4.setText("Tel:");

        jComboBoxTel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAddTel.setText("+");
        jButtonAddTel.setToolTipText("Adicionar Telefone");
        jButtonAddTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTelActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço:");

        jTextFieldEndereco.setEnabled(false);
        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jLabel6.setText("RG:");

        jLabel7.setText("CPF:");

        jFormattedTextFieldCpf.setEnabled(false);

        jFormattedTextFieldRg.setEnabled(false);

        jLabel8.setText("Bairro");

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAddBairro.setText("+");
        jButtonAddBairro.setToolTipText("Adicionar bairro");
        jButtonAddBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBairroActionPerformed(evt);
            }
        });

        jLabel9.setText("Cidade:");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Editar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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
        jButtonPrimeiro.setToolTipText("Primeiro elemento da tabela");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setText(">>");
        jButtonUltimo.setToolTipText("Último elemento da tabela");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.setToolTipText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.setToolTipText("Próximo");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAddBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(216, 216, 216)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(0, 452, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(jTextFieldNome))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxTel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddTel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddTel))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddBairro)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonSair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(226, 25, 25));
        jLabel1.setText("Cadastro de clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(373, 373, 373))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        
       jButtonCancelar.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       jFormattedTextFieldCpf.setEnabled(true);
       jFormattedTextFieldRg.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonDeletar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jFormattedTextFieldCpf.setText("");
       jFormattedTextFieldRg.setText("");
       jTextFieldEndereco.setText("");
       
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
       jButtonCancelar.setEnabled(false);
       jTextFieldNome.setEnabled(false);
       jTextFieldEndereco.setEnabled(false);
       jFormattedTextFieldCpf.setEnabled(false);
       jFormattedTextFieldRg.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonDeletar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jFormattedTextFieldCpf.setText("");
       jFormattedTextFieldRg.setText("");
       jTextFieldEndereco.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
       try {
            // TODO add your handling code here:
            
            conTel.conexao();
            conBairro.conexao();
            
            
            mod.setNome_cliente(jTextFieldNome.getText().toUpperCase());
            mod.setCpf_cliente(jFormattedTextFieldCpf.getText());
            mod.setRg_cliente(jFormattedTextFieldRg.getText());
            mod.setEnd_cliente(jTextFieldEndereco.getText().toUpperCase());
            
            //pega o Id do bairro e da cidade selecionado e envia para o controle
            conBairro.executaSQL("select * from bairros where nome_bairros = '"+jComboBoxBairro.getSelectedItem()+"'");//selecionar o estado
            conBairro.rs.first();
            mod.setCod_bairro_cliente(conBairro.rs.getInt("id_bairros"));
            mod.setCod_bairro_cidade(conBairro.rs.getInt("id_cidades"));
            
            //pegar o id do telefone selecionado e envia ao controle
            conTel.executaSQL("select * from telefone where numero_tel = '"+jComboBoxTel.getSelectedItem()+"'");
            conTel.rs.first();
            mod.setCod_tel(conTel.rs.getInt("id_telefone"));
    
            //enviando para o controle
            control.SalvarCliente(mod);
            
            PreencherTabela("select * from clientes inner join itens_clie_tel on clientes.id_cliente = itens_clie_tel.id_cliente\n" +
"inner join telefone on id_tel = id_telefone inner join bairros on clientes.id_bairro = bairros.id_bairros\n" +
"inner join cidades on bairros.id_cidades = cidades.id_cidade order by nome_cliente");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados" );
        } 
        
       jButtonCancelar.setEnabled(false);
       jTextFieldNome.setEnabled(false);
       jTextFieldEndereco.setEnabled(false);
       jFormattedTextFieldCpf.setEnabled(false);
       jFormattedTextFieldRg.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonDeletar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jFormattedTextFieldCpf.setText("");
       jFormattedTextFieldRg.setText("");
       jTextFieldEndereco.setText("");
       
       conTel.desconecta();
       conBairro.desconecta();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        conTel.conexao();
        conBairro.conexao();
        
        try {
            // TODO add your handling code here:
            mod.setCod_cliente(Integer.parseInt(jTextFieldCod.getText()));
            mod.setNome_cliente(jTextFieldNome.getText().toUpperCase());
            mod.setCpf_cliente(jFormattedTextFieldCpf.getText());
            mod.setRg_cliente(jFormattedTextFieldRg.getText());
            mod.setEnd_cliente(jTextFieldEndereco.getText().toUpperCase());
            
            //pega o Id do bairro e da cidade selecionado e envia para o controle
            conBairro.executaSQL("select * from bairros where nome_bairros = '"+jComboBoxBairro.getSelectedItem()+"'");//selecionar o estado
            conBairro.rs.first();
            mod.setCod_bairro_cliente(conBairro.rs.getInt("id_bairros"));
            mod.setCod_bairro_cidade(conBairro.rs.getInt("id_cidades"));
            
            //pegar o id do telefone selecionado e envia ao controle
            conTel.executaSQL("select * from telefone where numero_tel = '"+jComboBoxTel.getSelectedItem()+"'");
            conTel.rs.first();
            mod.setCod_tel(conTel.rs.getInt("id_telefone"));
    
            //enviando para o controle
            control.AlterarCliente(mod);
            PreencherTabela("select * from clientes inner join itens_clie_tel on clientes.id_cliente = itens_clie_tel.id_cliente\n" +
"inner join telefone on id_tel = id_telefone inner join bairros on clientes.id_bairro = bairros.id_bairros\n" +
"inner join cidades on bairros.id_cidades = cidades.id_cidade order by nome_cliente");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar os dados"+ex );
        } 
        
       jButtonCancelar.setEnabled(false);
       jTextFieldNome.setEnabled(false);
       jTextFieldEndereco.setEnabled(false);
       jFormattedTextFieldCpf.setEnabled(false);
       jFormattedTextFieldRg.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonDeletar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jFormattedTextFieldCpf.setText("");
       jFormattedTextFieldRg.setText("");
       jTextFieldEndereco.setText("");
       
        conTel.desconecta();
        conBairro.desconecta();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        
        mod.setCod_cliente(Integer.parseInt(jTextFieldCod.getText()));
        control.ExcluirCliente(mod);
        
        PreencherTabela("select * from clientes inner join itens_clie_tel on clientes.id_cliente = itens_clie_tel.id_cliente\n" +
"inner join telefone on id_tel = id_telefone inner join bairros on clientes.id_bairro = bairros.id_bairros\n" +
"inner join cidades on bairros.id_cidades = cidades.id_cidade order by nome_cliente");
        
       jButtonCancelar.setEnabled(false);
       jTextFieldNome.setEnabled(false);
       jTextFieldEndereco.setEnabled(false);
       jFormattedTextFieldCpf.setEnabled(false);
       jFormattedTextFieldRg.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonSalvar.setEnabled(false);
       jButtonDeletar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
       jButtonNovo.setEnabled(true);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jFormattedTextFieldCpf.setText("");
       jFormattedTextFieldRg.setText("");
       jTextFieldEndereco.setText("");
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
       conCliente.conexao();
       conCT.conexao();
       conTel.conexao();
       conBairro.conexao();
       
       jButtonCancelar.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       jFormattedTextFieldCpf.setEnabled(true);
       jFormattedTextFieldRg.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonDeletar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
       jButtonNovo.setEnabled(true);
        
       conCliente.executaSQL("select * from clientes order by nome_cliente");
       
        try {
            //retornar os primeiros elementos do banco clientes
            conCliente.rs.first();
            conCT.executaSQL("select * from itens_clie_tel where id_cliente = '"+conCliente.rs.getInt("id_cliente")+"'");
            jTextFieldCod.setText(String.valueOf(conCliente.rs.getInt("id_cliente")));
            jTextFieldNome.setText(conCliente.rs.getString("nome_cliente"));
            jTextFieldEndereco.setText(conCliente.rs.getString("endereco_cliente"));
            jFormattedTextFieldRg.setText(conCliente.rs.getString("rg_cliente"));
            jFormattedTextFieldCpf.setText(conCliente.rs.getString("cpf_cliente"));
            //chama o numero na combobox telefone
            conCT.rs.first();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conCT.rs.getString("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conCliente.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: "+ex);
        }
       conCliente.desconecta();
       conCT.desconecta();
       conTel.desconecta();
       conBairro.desconecta();
       
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
       conCliente.conexao();
       conCT.conexao();
       conTel.conexao();
       conBairro.conexao();
        
       jButtonCancelar.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       jFormattedTextFieldCpf.setEnabled(true);
       jFormattedTextFieldRg.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonDeletar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
       jButtonNovo.setEnabled(true);
        
       conCliente.executaSQL("select * from clientes order by nome_cliente");
       
        try {
            //retornar os primeiros elementos do banco clientes
            conCliente.rs.last();
            conCT.executaSQL("select * from itens_clie_tel where id_cliente = '"+conCliente.rs.getInt("id_cliente")+"'");
            jTextFieldCod.setText(String.valueOf(conCliente.rs.getInt("id_cliente")));
            jTextFieldNome.setText(conCliente.rs.getString("nome_cliente"));
            jTextFieldEndereco.setText(conCliente.rs.getString("endereco_cliente"));
            jFormattedTextFieldRg.setText(conCliente.rs.getString("rg_cliente"));
            jFormattedTextFieldCpf.setText(conCliente.rs.getString("cpf_cliente"));
            //chama o numero na combobox telefone
            conCT.rs.last();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conCT.rs.getString("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conCliente.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: "+ex);
        }
      
       conCliente.desconecta();
       conCT.desconecta();
       conTel.desconecta();
       conBairro.desconecta();
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
       conCliente.conexao();
       conCT.conexao();
       conTel.conexao();
       conBairro.conexao();
        
       jButtonCancelar.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       jFormattedTextFieldCpf.setEnabled(true);
       jFormattedTextFieldRg.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonDeletar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
       jButtonNovo.setEnabled(true);
        
        try {
            //retornar os primeiros elementos do banco clientes
            conCliente.rs.previous();
            conCT.executaSQL("select * from itens_clie_tel where id_cliente = '"+conCliente.rs.getInt("id_cliente")+"'");
            jTextFieldCod.setText(String.valueOf(conCliente.rs.getInt("id_cliente")));
            jTextFieldNome.setText(conCliente.rs.getString("nome_cliente"));
            jTextFieldEndereco.setText(conCliente.rs.getString("endereco_cliente"));
            jFormattedTextFieldRg.setText(conCliente.rs.getString("rg_cliente"));
            jFormattedTextFieldCpf.setText(conCliente.rs.getString("cpf_cliente"));
            //chama o numero na combobox telefone
            conCT.rs.first();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conCT.rs.getInt("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conCliente.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o primeiro elemento ");
        }
        
       conCliente.desconecta();
       conCT.desconecta();
       conTel.desconecta();
       conBairro.desconecta();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
       conCliente.conexao();
       conCT.conexao();
       conTel.conexao();
       conBairro.conexao(); 
        
       jButtonCancelar.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       jFormattedTextFieldCpf.setEnabled(true);
       jFormattedTextFieldRg.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonDeletar.setEnabled(true);
       jButtonCancelar.setEnabled(true);
       jButtonNovo.setEnabled(true);    

        try {
            //retornar os primeiros elementos do banco clientes
            conCliente.rs.next();
            conCT.executaSQL("select * from itens_clie_tel where id_cliente = '"+conCliente.rs.getInt("id_cliente")+"'");
            jTextFieldCod.setText(String.valueOf(conCliente.rs.getInt("id_cliente")));
            jTextFieldNome.setText(conCliente.rs.getString("nome_cliente"));
            jTextFieldEndereco.setText(conCliente.rs.getString("endereco_cliente"));
            jFormattedTextFieldRg.setText(conCliente.rs.getString("rg_cliente"));
            jFormattedTextFieldCpf.setText(conCliente.rs.getString("cpf_cliente"));
            //chama o numero na combobox telefone
            conCT.rs.first();
            conTel.executaSQL("select * from telefone where id_telefone = '"+conCT.rs.getInt("id_tel")+"'");
            conTel.rs.first();
            jComboBoxTel.setSelectedItem(conTel.rs.getString("numero_tel"));
            
            //chama o nome na combobox bairro
            conBairro.executaSQL("select * from bairros where id_bairros ='"+conCliente.rs.getInt("id_bairro")+"'");
            conBairro.rs.first();
            jComboBoxBairro.setSelectedItem(conBairro.rs.getString("nome_bairros"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o último elemento");
        }
       conCliente.desconecta();
       conCT.desconecta();
       conTel.desconecta();
       conBairro.desconecta();
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonAddBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBairroActionPerformed
        // TODO add your handling code here:
        FrmBairro frm = new FrmBairro(this);
        frm.setVisible(true);
        
             
    }//GEN-LAST:event_jButtonAddBairroActionPerformed

    private void jButtonAddTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTelActionPerformed
        // TODO add your handling code here:
        FrmTelefone frm = new FrmTelefone(this);
        frm.setVisible(true);
        
    }//GEN-LAST:event_jButtonAddTelActionPerformed

    public void PreencherCombo(){
        //Preenche combobox telefone
        conTel.conexao();
        conBairro.conexao();
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
        
        conTel.desconecta();
        conBairro.desconecta();
    }
    
    public void Mascara(){
        try {
            MaskFormatter rg = new MaskFormatter("########-##");
            jFormattedTextFieldRg.setFormatterFactory(new DefaultFormatterFactory(rg));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher RG");
        }
        try {
            MaskFormatter cpf = new MaskFormatter("###.###.###-##");
            jFormattedTextFieldCpf.setFormatterFactory(new DefaultFormatterFactory(cpf));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher CPF");
        }
    }
    public void PreencherTabela(String SQL){
        conCliente.conexao();
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID","Cliente","Telefone","Cidade"};
        
        conCliente.executaSQL(SQL);
        try{
            conCliente.rs.first();
            do{
                dados.add(new Object[]{conCliente.rs.getInt("id_cliente"),conCliente.rs.getString("nome_cliente"),conCliente.rs.getString("numero_tel"),conCliente.rs.getString("nome_Cidades")});
            }while(conCliente.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro ao inserir na tabela");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableCliente.setModel(modelo);
        jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(200);//definindo tamanho em pixel
        jTableCliente.getColumnModel().getColumn(0).setResizable(false);
        jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(348);//definindo tamanho em pixel
        jTableCliente.getColumnModel().getColumn(1).setResizable(false);
        jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(200);//definindo tamanho em pixel
        jTableCliente.getColumnModel().getColumn(2).setResizable(false);
        jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(200);//definindo tamanho em pixel
        jTableCliente.getColumnModel().getColumn(3).setResizable(false);
        //chama a tabela
        jTableCliente.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableCliente.setAutoResizeMode(jTableCliente.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        conCliente.desconecta();
        
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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBairro;
    private javax.swing.JButton jButtonAddTel;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxTel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
