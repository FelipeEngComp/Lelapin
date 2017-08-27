/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloProdutos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControleProduto {
    
    ConectaBanco conecta = new ConectaBanco();
    
    public void SalvarProduto(ModeloProdutos mod){
        try {
            conecta.conexao();
            PreparedStatement pst2 = conecta.con.prepareStatement("insert into produtos(nome_produto,preco_venda,preco_compra,quantidade,id_fornecedor)values(?,?,?,?,?)");
            //pst2.setInt(1,mod.getCod_cliente());
            pst2.setString(1,mod.getNome_prod());
            pst2.setFloat(2, mod.getVenda_prod());
            pst2.setFloat(3, mod.getCompra_prod());
            pst2.setInt(4, mod.getQuant_prod());
            pst2.setInt(5, mod.getCod_forn());
  
            pst2.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: "+ex);
        }
    }
    
    public void EditarProduto(ModeloProdutos mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("update produtos set nome_produto = ?,preco_venda = ?,preco_compra = ?,quantidade = ?,id_fornecedor = ? where id_produto = ?");
            pst.setString(1, mod.getNome_prod());
            pst.setFloat(2, mod.getVenda_prod());
            pst.setFloat(3, mod.getCompra_prod());
            pst.setInt(4, mod.getQuant_prod());
            pst.setInt(5, mod.getCod_forn());
            pst.setInt(6, mod.getCod_prod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro ao editar!");
        }
        conecta.desconecta();
    }
    
    public void ExcluirProduto(ModeloProdutos mod){
        conecta.conexao();
        conecta.executaSQL("delete from produtos where id_produto ='"+mod.getCod_prod()+"'");
        JOptionPane.showMessageDialog(null,"Deletado com sucesso!");
        conecta.desconecta();
    }
    
}
