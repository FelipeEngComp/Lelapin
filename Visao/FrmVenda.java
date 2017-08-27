/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConectaBanco;
import Controle.ControleVenda;
import Controle.ModeloTabela;
import Modelo.ModeloVendas;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


/**
 *
 * @author felipe
 */
public class FrmVenda extends javax.swing.JFrame {

    ConectaBanco conVenda = new ConectaBanco();
    ConectaBanco conPV    = new ConectaBanco();//conexao produto e vendas
    ConectaBanco conCli   = new ConectaBanco();
    ModeloVendas mod      = new ModeloVendas();
    ControleVenda control = new ControleVenda();
    private int flag,cod_venda,aux; //variavel que ira controlar o acesso as tabelas produto e vendas
    private float valor;
    
    public FrmVenda() {
        initComponents();
        conVenda.conexao();        
        conPV.conexao();
        conCli.conexao();
        aux = 0;
        valor = 0;
       
        //pega data do sistema
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();//pegando a data do sistema
        jFormattedTextFieldData.setText(df.format(hoje));
          
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonBuscaC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProduto = new javax.swing.JTextField();
        jButtonProd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQnt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesq = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonConcluirVenda = new javax.swing.JButton();
        jButtonCancelarVenda = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de vendas");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Formulário de venda");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome do cliente:");

        jButtonBuscaC.setText("Buscar");
        jButtonBuscaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaCActionPerformed(evt);
            }
        });

        jLabel3.setText("Data:");

        jFormattedTextFieldData.setForeground(new java.awt.Color(17, 9, 9));
        jFormattedTextFieldData.setDisabledTextColor(new java.awt.Color(12, 10, 7));
        jFormattedTextFieldData.setEnabled(false);
        jFormattedTextFieldData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDataFocusGained(evt);
            }
        });

        jLabel4.setText("Produto:");

        jButtonProd.setText("Buscar");
        jButtonProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade:");

        jTextFieldQnt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldQntFocusGained(evt);
            }
        });

        jLabel6.setText("Valor por item:");

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jTablePesq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesq.setToolTipText("");
        jTablePesq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesq);

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVendas);

        jLabel7.setText("Pesquisa:");

        jLabel8.setText("Vendas:");

        jButtonConcluirVenda.setText("Concluir venda");
        jButtonConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirVendaActionPerformed(evt);
            }
        });

        jButtonCancelarVenda.setText("Cancelar Venda");
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor total:");

        jTextFieldValorTotal.setDisabledTextColor(new java.awt.Color(5, 7, 6));
        jTextFieldValorTotal.setEnabled(false);

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonConcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(114, 114, 114)
                                    .addComponent(jButtonCancelarVenda)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldCliente)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(jLabel6))
                                                    .addComponent(jTextFieldValor))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5))
                                                .addGap(17, 17, 17)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuscaC, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscaC)
                    .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProd))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConcluirVenda)
                    .addComponent(jButtonCancelarVenda))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaCActionPerformed
        // TODO add your handling code here:
        PreencherTabelaCliente("select*from clientes where nome_cliente like'%"+jTextFieldCliente.getText().toUpperCase()+"%'");
        flag = 0;
    }//GEN-LAST:event_jButtonBuscaCActionPerformed

    private void jButtonProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdActionPerformed
        // TODO add your handling code here:
        PreencherTabelaProdutos("select*from produtos where nome_produto like'%"+jTextFieldProduto.getText().toUpperCase()+"%'");
        flag = 1;
    }//GEN-LAST:event_jButtonProdActionPerformed

    private void jTablePesqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesqMouseClicked
        // Capturar o elemento selecionado na tabela
        
        if (flag == 0){//tabela de clientes
            String nome_cliente = ""+jTablePesq.getValueAt(jTablePesq.getSelectedRow(),1);
        
            conPV.executaSQL("select*from clientes where nome_cliente ='"+nome_cliente+"'");
            try {
                conPV.rs.first();

                jTextFieldCliente.setText(conPV.rs.getString("nome_cliente"));


            } catch (SQLException ex) {
                Logger.getLogger(FrmProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if (flag == 1){//tabela de produtos
            String nome_produto = ""+jTablePesq.getValueAt(jTablePesq.getSelectedRow(),1);
        
            conPV.executaSQL("select*from produtos where nome_produto ='"+nome_produto+"'");
            try {
                conPV.rs.first();

                jTextFieldProduto.setText(conPV.rs.getString("nome_produto"));
                jTextFieldValor.setText(String.valueOf(conPV.rs.getFloat("preco_venda")));
                jTextFieldQnt.setText("1");
                jTextFieldValorTotal.setText(jTextFieldValor.getText());
            } catch (SQLException ex) {
                Logger.getLogger(FrmProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTablePesqMouseClicked

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (aux == 0){
            criavenda();
            aux = 1;// esse auxiliar e para permitir que se crie apenas um ID_VENDA por jframe
        }
        //calculando valor total da venda
        float venda = Float.parseFloat(jTextFieldValor.getText());//captura o valor do produto
        int qnt = Integer.parseInt(jTextFieldQnt.getText());//captura a quantidade de produtos
        float vtotal = qnt*venda;
      
        //pegando o id do produto
        conPV.executaSQL("select * from produtos where nome_produto ='"+jTextFieldProduto.getText()+"'");
        try {
            conPV.rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(FrmVenda.class.getName()).log(Level.SEVERE, null, ex);  
        }
        //verificando se e possivel vender com a quantidade requerida e a quantidade em estoque.
        try{
            if(conPV.rs.getInt("quantidade")- qnt >= 0){
                mod.setQnt(qnt);
                mod.setCod_venda(cod_venda);
                mod.setId_prod(conPV.rs.getInt("id_produto"));
                control.salvarVenda(mod);
                valor +=vtotal; //evita que o valor seja salvo quando a venda nao puder ser concluida por causa da quantidade
                jTextFieldValorTotal.setText(String.valueOf(valor));
                control.BaixaDeEstoque(mod);//retira quantidade e produtos da tabela produto.
                
                PreencherTabelaVendas("select * from produtos inner join itens_venda_produto on itens_venda_produto.id_produto = produtos.id_produto where itens_venda_produto.id_venda = '"+cod_venda+"'");
            }else
                JOptionPane.showMessageDialog(null, "Não há produtos suficientes para realizar essa venda");
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex);

                }
        if (flag == 0){
           PreencherTabelaCliente("select*from clientes where nome_cliente like'%"+jTextFieldCliente.getText().toUpperCase()+"%'");
        }else
                    PreencherTabelaProdutos("select*from produtos where nome_produto like'%"+jTextFieldProduto.getText().toUpperCase()+"%'");

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldQntFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldQntFocusGained
        // TODO add your handling code here:
        
        
        jTextFieldValorTotal.setText(String.valueOf(valor));
        
    }//GEN-LAST:event_jTextFieldQntFocusGained

    private void jFormattedTextFieldDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataFocusGained
        // TODO add your handling code here:
        
        jTextFieldValorTotal.setText(String.valueOf(valor));
    }//GEN-LAST:event_jFormattedTextFieldDataFocusGained

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        // TODO add your handling code here:
        control.CancelarVenda();
        dispose();
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void jTableVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableVendasMouseClicked

    private void jButtonConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirVendaActionPerformed
        // TODO add your handling code here:
        mod.setCod_venda(cod_venda);
        mod.setData_venda(jFormattedTextFieldData.getText());
        mod.setValor_venda(Float.parseFloat(jTextFieldValorTotal.getText()));
        //captura id_cliente.
        conCli.executaSQL("select*from clientes where nome_cliente = '"+jTextFieldCliente.getText()+"'");
        try {
            conCli.rs.first();
            mod.setId_cliente(conCli.rs.getInt("id_cliente"));
            control.ConcluirVenda(mod);
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Venda concluída com sucesso!");
        dispose();
        conCli.desconecta();
        conPV.desconecta();
        conVenda.desconecta();
    }//GEN-LAST:event_jButtonConcluirVendaActionPerformed

    public void PreencherTabelaCliente(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID","Nome","RG","CPF"};
        
        conPV.executaSQL(SQL);
        try{
            conPV.rs.first();
            do{
                dados.add(new Object[]{conPV.rs.getInt("id_cliente"),conPV.rs.getString("nome_cliente"),conPV.rs.getString("rg_cliente"),
                    conPV.rs.getString("cpf_cliente")});
                
            }while(conPV.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Tabela vazia ou\nelemento não encontrado");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTablePesq.setModel(modelo);
        jTablePesq.getColumnModel().getColumn(0).setPreferredWidth(100);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(0).setResizable(false);
        jTablePesq.getColumnModel().getColumn(1).setPreferredWidth(177);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(1).setResizable(false);
        jTablePesq.getColumnModel().getColumn(2).setPreferredWidth(177);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(2).setResizable(false);
        jTablePesq.getColumnModel().getColumn(3).setPreferredWidth(177);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(3).setResizable(false);
        

        //chama a tabela
        jTablePesq.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTablePesq.setAutoResizeMode(jTablePesq.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTablePesq.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
    }
    
    public void PreencherTabelaProdutos(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"ID","Produto","Valor vendido","Quantidade"};
        
        conPV.executaSQL(SQL);
        try{
            conPV.rs.first();
            do{
                dados.add(new Object[]{conPV.rs.getInt("id_produto"),conPV.rs.getString("nome_produto"),conPV.rs.getString("preco_venda"),
                    conPV.rs.getString("quantidade")});
                
            }while(conPV.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Tabela vazia ou\nelemento não encontrado");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTablePesq.setModel(modelo);
        jTablePesq.getColumnModel().getColumn(0).setPreferredWidth(100);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(0).setResizable(false);
        jTablePesq.getColumnModel().getColumn(1).setPreferredWidth(177);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(1).setResizable(false);
        jTablePesq.getColumnModel().getColumn(2).setPreferredWidth(177);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(2).setResizable(false);
        jTablePesq.getColumnModel().getColumn(3).setPreferredWidth(177);//definindo tamanho em pixel
        jTablePesq.getColumnModel().getColumn(3).setResizable(false);
        

        //chama a tabela
        jTablePesq.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTablePesq.setAutoResizeMode(jTablePesq.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTablePesq.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
    }
    
    public void PreencherTabelaVendas(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"Descrição","Quantidade","Valor Total"};
        
        conPV.executaSQL(SQL);
        try{
            conPV.rs.first();
            do{
                float valorItem = conPV.rs.getFloat("preco_venda");
                int   quantidade = conPV.rs.getInt("quantidade_produto");
                
                dados.add(new Object[]{conPV.rs.getString("nome_produto"),conPV.rs.getInt("quantidade_produto"),valorItem*quantidade});
                
            }while(conPV.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Tabela vazia ou\nelemento não encontrado");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableVendas.setModel(modelo);
        jTableVendas.getColumnModel().getColumn(0).setPreferredWidth(210);//definindo tamanho em pixel
        jTableVendas.getColumnModel().getColumn(0).setResizable(false);
        jTableVendas.getColumnModel().getColumn(1).setPreferredWidth(210);//definindo tamanho em pixel
        jTableVendas.getColumnModel().getColumn(1).setResizable(false);
        jTableVendas.getColumnModel().getColumn(2).setPreferredWidth(212);//definindo tamanho em pixel
        jTableVendas.getColumnModel().getColumn(2).setResizable(false);
       
        

        //chama a tabela
        jTableVendas.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableVendas.setAutoResizeMode(jTablePesq.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableVendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
    }
    
    public void criavenda(){
        PreparedStatement pst;
        try {
            pst = conVenda.con.prepareStatement("insert into venda(valor_venda) values(?)");
            pst.setFloat(1, 0);
            pst.execute();
            conVenda.executaSQL("select*from venda");
            conVenda.rs.last();
            cod_venda = conVenda.rs.getInt("id_venda");
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonBuscaC;
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonConcluirVenda;
    private javax.swing.JButton jButtonProd;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePesq;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQnt;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
