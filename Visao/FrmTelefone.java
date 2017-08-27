/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConectaBanco;
import Controle.ControleTelefone;
import Modelo.ModeloTelefones;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.text.DefaultFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;



public class FrmTelefone extends javax.swing.JFrame {
    
    ConectaBanco conTel = new ConectaBanco();
    ModeloTelefones mod = new ModeloTelefones();
    ControleTelefone control = new ControleTelefone();
    FrmCliente Fcliente =new FrmCliente();
    FrmFornecedor Fforn = new FrmFornecedor();
    
    public FrmTelefone() {
        initComponents();
        conTel.conexao();
        try {
            MaskFormatter mask = new MaskFormatter("(##)####-####");//cria a mascara
            jFormattedTextFieldTel.setFormatterFactory(new DefaultFormatterFactory(mask));//atribui a mascara ao campo
        } catch (ParseException ex) {
            Logger.getLogger(FrmTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public FrmTelefone(FrmCliente cliente) {
        initComponents();
        conTel.conexao();
        try {
            MaskFormatter mask = new MaskFormatter("(##)####-####");//cria a mascara
            jFormattedTextFieldTel.setFormatterFactory(new DefaultFormatterFactory(mask));//atribui a mascara ao campo
        } catch (ParseException ex) {
            Logger.getLogger(FrmTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Fcliente = cliente;
        
    }
    
    public FrmTelefone(FrmFornecedor fornecedor) {
        initComponents();
        conTel.conexao();
        try {
            MaskFormatter mask = new MaskFormatter("(##)####-####");//cria a mascara
            jFormattedTextFieldTel.setFormatterFactory(new DefaultFormatterFactory(mask));//atribui a mascara ao campo
        } catch (ParseException ex) {
            Logger.getLogger(FrmTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Fforn = fornecedor;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldCod.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tlwg Typist", 0, 15)); // NOI18N
        jLabel2.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Tlwg Typist", 0, 15)); // NOI18N
        jLabel3.setText("Código:");

        jFormattedTextFieldTel.setEnabled(false);

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

        jButtonUltimo.setText(">>");
        jButtonUltimo.setToolTipText("Último telefone inserido");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.setToolTipText("Primeiro telefone inserido");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.setToolTipText("Próximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.setToolTipText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair ");
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
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(20, 20, 20)
                            .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108)
                            .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(2, 2, 2)
                            .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonPrimeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSair))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 37, 37));
        jLabel1.setText("Cadastro de telefones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
        Fcliente.PreencherCombo();
        Fforn.PreencherCombo();
        conTel.desconecta();
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldTel.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldTel.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        mod.setCod_tel(Integer.parseInt(jTextFieldCod.getText()));
        //mod.setNum_tel(jFormattedTextFieldTel.getText());
        control.ExcluirTelefone(mod);
        
        jTextFieldCod.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldTel.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        
            
        mod.setNum_tel(jFormattedTextFieldTel.getText());
        mod.setCod_tel(Integer.parseInt(jTextFieldCod.getText()));
        control.AlterarTelefone(mod);        
        
        jTextFieldCod.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldTel.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
            
        mod.setNum_tel(jFormattedTextFieldTel.getText());
        control.SalvarTeleforne(mod);
          
        
        
        jTextFieldCod.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldTel.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        jTextFieldCod.setText("");
        jFormattedTextFieldTel.setText("");
        jFormattedTextFieldTel.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        
        conTel.executaSQL("select * from telefone order by id_telefone");
        try {
            conTel.rs.first();
            jTextFieldCod.setText(String.valueOf(conTel.rs.getInt("id_telefone")));
            jFormattedTextFieldTel.setText(conTel.rs.getString("numero_tel"));
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:"+ ex);}
        
        
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
       
        jFormattedTextFieldTel.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        
        conTel.executaSQL("select * from telefone order by id_telefone");
        try {
            conTel.rs.last();
            jTextFieldCod.setText(String.valueOf(conTel.rs.getInt("id_telefone")));
            jFormattedTextFieldTel.setText(conTel.rs.getString("numero_tel"));
         
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
        }       
      
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        
        jFormattedTextFieldTel.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true); 
        
        try {
            conTel.rs.previous();
            jTextFieldCod.setText(String.valueOf(conTel.rs.getInt("id_telefone")));
            jFormattedTextFieldTel.setText(conTel.rs.getString("numero_tel"));
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o primeiro elemento.");
        }
        
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        jFormattedTextFieldTel.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        try {
            conTel.rs.next();
            jTextFieldCod.setText(String.valueOf(conTel.rs.getInt("id_telefone")));
            jFormattedTextFieldTel.setText(conTel.rs.getString("numero_tel"));
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Este já é o último elemento.");
        }
        
    }//GEN-LAST:event_jButtonProximoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelefone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCod;
    // End of variables declaration//GEN-END:variables
}
