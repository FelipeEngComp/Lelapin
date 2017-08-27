
package Controle;

import Modelo.ModeloTelefones;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControleTelefone {
    ConectaBanco conecta = new ConectaBanco();
    
    public void SalvarTeleforne(ModeloTelefones mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("insert into telefone(numero_tel)values(?)");
            pst.setString(1, mod.getNum_tel());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
                    } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        conecta.desconecta();
    }
    
    public void AlterarTelefone(ModeloTelefones mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("update telefone set numero_tel = ? where id_telefone = ?");
            pst.setString(1, mod.getNum_tel());
            pst.setInt(2,mod.getCod_tel() );
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        conecta.desconecta();
        
    }
    
    public void ExcluirTelefone(ModeloTelefones mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("delete from telefone where id_telefone = ?");
            pst.setInt(1, mod.getCod_tel());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Telefone não pode ser excluído\nPois deve está sendo usado por outra tabela ");
        }
        conecta.desconecta();
        
    }
}
