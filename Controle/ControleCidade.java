/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloCidades;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class ControleCidade {
    ConectaBanco conecta = new ConectaBanco();
    
    public void InserirCidade(ModeloCidades mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("insert into cidades(nome_cidades,id_estado)values(?,?)");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getCod_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        conecta.desconecta();
    }
    
    public void ExcluirCidade(ModeloCidades mod){
        conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.con.prepareStatement("delete from cidades where id_cidade = ?");
            pst.setInt(1,mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cidade não pode ser excluído\nPois deve está sendo usado por outra tabela ");
        }
        conecta.desconecta();
    }
    
    public void AlterarCidade(ModeloCidades mod){
        conecta.conexao();
        try {
            
            PreparedStatement pst = conecta.con.prepareStatement("update cidades set nome_cidades = ?,id_estado = ? where id_cidade = ?");
            pst.setString(1,mod.getNome());
            pst.setInt(2, mod.getCod_estado());
            pst.setInt(3,mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        
        conecta.desconecta();
    }
}
