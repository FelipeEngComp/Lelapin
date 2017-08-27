/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloFornecedores;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class ControleFornecedor {
    ConectaBanco conecta = new ConectaBanco();
    int codTel,codFor;
    public void SalvaFornecedor(ModeloFornecedores mod){
        conecta.conexao();
        try {
            
//            insere na tabela cliente
            PreparedStatement pst2 = conecta.con.prepareStatement("insert into fornecedores(nome_fornecedor,endereco_fornecedor,id_cidade,id_bairro,cnpj_fornecedor)values(?,?,?,?,?)");
            //pst2.setInt(1,mod.getCod_cliente());
            pst2.setString(1,mod.getNome_forne());
            pst2.setString(2, mod.getEnd_forne());
            pst2.setInt(3, mod.getCod_cid_forne());
            pst2.setInt(4, mod.getCod_bairro_forne());
            pst2.setString(5, mod.getCnpj_forne());
  
            pst2.execute();
            
            //inserindo  na tabela itens_tel_forn
            conecta.executaSQL("select * from telefone where id_telefone = '"+mod.getCod_tel_forne()+"'");
            conecta.rs.first();
            codTel = conecta.rs.getInt("id_telefone");
            
            conecta.executaSQL("select * from fornecedores where nome_fornecedor = '"+mod.getNome_forne()+"'");
            conecta.rs.first();
            codFor = conecta.rs.getInt("id_fornecedor");
            
            PreparedStatement pst1 = conecta.con.prepareStatement("insert into itens_tel_forn(id_tel,id_forn)values(?,?)");
            pst1.setInt(1, codTel);
            pst1.setInt(2, codFor);
            pst1.execute();
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        conecta.desconecta();
    }
    
    public void ExcluirFornecedor(ModeloFornecedores mod){
        conecta.conexao();
        try {
            codFor = mod.getCod_forne();
            
            PreparedStatement pst2 = conecta.con.prepareStatement("delete from itens_tel_forn where id_forn = ?");
            pst2.setInt(1,codFor);
            pst2.execute();
            
            PreparedStatement pst = conecta.con.prepareStatement("delete  from fornecedores where id_fornecedor = ?");
            pst.setInt(1, codFor);
            pst.execute();
            
           
            
            
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fornecedor não pode ser excluído\nPois deve está sendo usado por outra tabela ");
        }  
        
        conecta.desconecta();
    }
    
    public void AlterarFornecedor(ModeloFornecedores mod){
        conecta.conexao();
        try {
            
            //            edita na tabela cliente
            PreparedStatement pst2 = conecta.con.prepareStatement("update fornecedores set nome_fornecedor = ?,endereco_fornecedor = ?,id_cidade = ?,id_bairro = ?,cnpj_fornecedor = ? where id_fornecedor = ?");
            pst2.setString(1,mod.getNome_forne());
            pst2.setString(2, mod.getEnd_forne());
            pst2.setInt(3, mod.getCod_cid_forne());
            pst2.setInt(4, mod.getCod_bairro_forne());
            pst2.setString(5, mod.getCnpj_forne());
            pst2.setInt(6,mod.getCod_forne());
            pst2.execute();
            
//               edita  na tabela itens_clie_tel
            conecta.executaSQL("select * from telefone where id_telefone = '"+mod.getCod_tel_forne()+"'");
            conecta.rs.first();
            codTel = conecta.rs.getInt("id_telefone");
            conecta.executaSQL("select * from fornecedores where nome_fornecedor = '"+mod.getNome_forne()+"'");
            conecta.rs.first();
            codFor = conecta.rs.getInt("id_fornecedor");
            
            PreparedStatement pst1 = conecta.con.prepareStatement("update itens_tel_forn set id_tel = ? where id_forn = ?");
            pst1.setInt(1, codTel);
            pst1.setInt(2, codFor);
            pst1.execute();
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
                        }
        
        conecta.desconecta();
        
        
    }
    
}
