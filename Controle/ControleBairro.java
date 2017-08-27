
package Controle;

import Modelo.ModeloBairros;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ControleBairro {
    ConectaBanco conecta = new ConectaBanco();
    
    public void InserirBairro(ModeloBairros mod){
        conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.con.prepareStatement("insert into bairros(nome_bairros,id_cidades)values(?,?)");
            pst.setString(1, mod.getNome_bairro());
            pst.setInt(2, mod.getCod_cidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
                    } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        conecta.desconecta();
    }
    
    public void DeletarBairro(ModeloBairros mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("delete from bairros where id_bairros = ?");
            pst.setInt(1, mod.getCod_bairro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Bairro não pode ser excluído\nPois deve está sendo usado por outra tabela ");
        }
        conecta.desconecta();
    }
    
    public void AlterarBairro(ModeloBairros mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("update bairros set nome_bairros = ?,id_cidades = ? where id_bairros = ?");
            pst.setString(1, mod.getNome_bairro());
            pst.setInt(2, mod.getCod_cidade());
            pst.setInt(3, mod.getCod_bairro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        conecta.desconecta();
    }
}
