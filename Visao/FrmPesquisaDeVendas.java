/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConectaBanco;
import Controle.ModeloTabela;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;


/**
 *
 * @author felipe
 */
public class FrmPesquisaDeVendas extends javax.swing.JFrame {

    ConectaBanco conTabela = new ConectaBanco();
    ConectaBanco conNota = new ConectaBanco();
    String id_venda;       
    public FrmPesquisaDeVendas() {
        initComponents();
        mascara();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendasRealizadas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetalhes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonImprimirNota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Digite uma data:");

        jLabel3.setText("Vendas realizadas:");

        jTableVendasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableVendasRealizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendasRealizadasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendasRealizadas);

        jTableDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableDetalhes);

        jLabel4.setText("Detalhes da venda:");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisa de vendas");
        jLabel1.setToolTipText("Pesquisa de Vendas");

        jButtonImprimirNota.setText("Imprimir Nota");
        jButtonImprimirNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButtonImprimirNota, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonImprimirNota)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conTabela.conexao();
        PreencherTabelaPesquisar("select * from venda inner join clientes on venda.id_cliente = clientes.id_cliente where data_venda like '%"+jFormattedTextFieldData.getText()+"%' order by nome_cliente");
        conTabela.desconecta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableVendasRealizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendasRealizadasMouseClicked
        // TODO add your handling code here:
        conTabela.conexao();
        
        id_venda = ""+jTableVendasRealizadas.getValueAt(jTableVendasRealizadas.getSelectedRow(),0);
        
        PreencherTabelaDetalhes("select* from itens_venda_produto inner join produtos on itens_venda_produto.id_produto = produtos.id_produto where"
                + " id_venda = '"+Integer.parseInt(id_venda)+"'");
        
        conTabela.desconecta();
        
    }//GEN-LAST:event_jTableVendasRealizadasMouseClicked

    private void jButtonImprimirNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirNotaActionPerformed
          // Gerar PDF para impressao
        conNota.conexao();
              
        
        Document documentoPdf =  new Document();// cria o documentoPdf
        
         try {
                conNota.executaSQL("select * from venda inner join clientes on venda.id_cliente = clientes.id_cliente inner join itens_venda_produto on venda.id_venda = itens_venda_produto.id_venda inner join produtos on itens_venda_produto.id_produto = produtos.id_produto where venda.id_venda = '"+id_venda+"'");
                 
                conNota.rs.first();
                
                String nome = conNota.rs.getString("nome_cliente");
                String CPF = conNota.rs.getString("cpf_cliente");
                float vTotal = conNota.rs.getFloat("valor_venda") ;
                String data = conNota.rs.getString("data_venda");
                
                //cria uma instancia
                PdfWriter.getInstance(documentoPdf,new FileOutputStream("/home/felipe/Faculdade 2016.1/POO/TRABALHO POO/TestePdfAqui/programa.pdf"));
               
                //abrir o documento
                documentoPdf.open();
                
                //setta o pdf para A4
                documentoPdf.setPageSize(PageSize.A4);
                
                documentoPdf.add(new Paragraph("                                                                NOTA FISCAL"));
                
                documentoPdf.add(new Paragraph("\n"));
                documentoPdf.add(new Paragraph("Cliente: "+nome+"                               CPF: "+CPF));
                documentoPdf.add(new Paragraph("\n"));
                documentoPdf.add(new Paragraph("Código da venda: "+id_venda));
                documentoPdf.add(new Paragraph("\n\n"));//pula duas linhas
                //informaccoes dos clientes e da venda.
                documentoPdf.add(new Paragraph("##############################################################################"));
                
                do{
                    
                    
                    documentoPdf.add(new Paragraph("\n"));
                    
                    
                    documentoPdf.add(new Paragraph("Prod: "+conNota.rs.getString("nome_produto")+"-------------Qnt.: "+conNota.rs.getInt("quantidade_produto")+" unid.------Valor R$ "+conNota.rs.getFloat("preco_venda")));
                    documentoPdf.add(new Paragraph("\n"));
                    
                    
                }while(conNota.rs.next());
                    documentoPdf.add(new Paragraph("##############################################################################"));
                
                
                documentoPdf.add(new Paragraph("TOTAL: R$ "+vTotal));
                
                documentoPdf.add(new Paragraph("\n\n"));
              
                /*para concluir a nota, o logo e a mensagem de agradcimento DEVE DIRECIONAR O CAMINHO*/
                 Image figura = Image.getInstance("/home/felipe/Faculdade 2016.1/POO/Developer Kit_png/png/LOGO (1).png");
                //redimensiona a figura 
                figura.scaleToFit(100, 49);
                //Adiciona figura
                documentoPdf.add((figura));
                //texto de agradecimento
                documentoPdf.add(new Paragraph("Obrigado por preferir comprar com a gente                                                "+data));
                
              
                //abrir documento pdf
                Desktop.getDesktop().open(new File("/home/felipe/Faculdade 2016.1/POO/TRABALHO POO/TestePdfAqui/programa.pdf"));
                
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro "+ex);
            }catch(DocumentException de){
                JOptionPane.showMessageDialog(null, "Erro "+de);  
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro "+ex);  

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Selecione algum item para impressão ");
        }finally{
                documentoPdf.close();
        }
         
       conNota.desconecta();
    }//GEN-LAST:event_jButtonImprimirNotaActionPerformed

    public void mascara(){
        try {
            MaskFormatter data = new MaskFormatter("##/##/####");
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(data));
        } catch (ParseException ex) {
            Logger.getLogger(FrmPesquisaDeVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void PreencherTabelaPesquisar(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID venda","Data","Valor da venda","Cliente"};
        
        conTabela.executaSQL(SQL);
        try{
            conTabela.rs.first();
            do{
                dados.add(new Object[]{conTabela.rs.getInt("id_venda"),conTabela.rs.getString("data_venda"),conTabela.rs.getString("valor_venda"),conTabela.rs.getString("nome_cliente")});
            }while(conTabela.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Não houve eventos nessa data\nOu data informada está inválida ");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableVendasRealizadas.setModel(modelo);
        jTableVendasRealizadas.getColumnModel().getColumn(0).setPreferredWidth(125);//definindo tamanho em pixel
        jTableVendasRealizadas.getColumnModel().getColumn(0).setResizable(false);
        jTableVendasRealizadas.getColumnModel().getColumn(1).setPreferredWidth(125);//definindo tamanho em pixel
        jTableVendasRealizadas.getColumnModel().getColumn(1).setResizable(false);
        jTableVendasRealizadas.getColumnModel().getColumn(2).setPreferredWidth(125);//definindo tamanho em pixel
        jTableVendasRealizadas.getColumnModel().getColumn(2).setResizable(false);
        jTableVendasRealizadas.getColumnModel().getColumn(3).setPreferredWidth(125);//definindo tamanho em pixel
        jTableVendasRealizadas.getColumnModel().getColumn(3).setResizable(false);
        //chama a tabela
        jTableVendasRealizadas.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableVendasRealizadas.setAutoResizeMode(jTableVendasRealizadas.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableVendasRealizadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        
        
    }
    
     public void PreencherTabelaDetalhes(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"Produto","Quantidade"};
        
        conTabela.executaSQL(SQL);
        try{
            conTabela.rs.first();
            do{
                dados.add(new Object[]{conTabela.rs.getString("nome_produto"),conTabela.rs.getInt("quantidade_produto")});
            }while(conTabela.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Não houve eventos nessa data\nOu data informada está inválida erro "+ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableDetalhes.setModel(modelo);
        jTableDetalhes.getColumnModel().getColumn(0).setPreferredWidth(250);//definindo tamanho em pixel
        jTableDetalhes.getColumnModel().getColumn(0).setResizable(false);
        jTableDetalhes.getColumnModel().getColumn(1).setPreferredWidth(250);//definindo tamanho em pixel
        jTableDetalhes.getColumnModel().getColumn(1).setResizable(false);
        
        //chama a tabela
        jTableDetalhes.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableDetalhes.setAutoResizeMode(jTableDetalhes.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableDetalhes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        
        
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
            java.util.logging.Logger.getLogger(FrmPesquisaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPesquisaDeVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonImprimirNota;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetalhes;
    private javax.swing.JTable jTableVendasRealizadas;
    // End of variables declaration//GEN-END:variables
}
