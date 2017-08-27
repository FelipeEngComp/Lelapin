
package Controle;

import Modelo.ModeloClientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import javax.swing.JFormattedTextField;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ControleCliente {
    ConectaBanco conecta = new ConectaBanco();
    int codCli,codTel;
    
    public void SalvarCliente(ModeloClientes mod){
        conecta.conexao();
        try {
            
//            insere na tabela cliente
            PreparedStatement pst2 = conecta.con.prepareStatement("insert into clientes(nome_cliente,endereco_cliente,rg_cliente,cpf_cliente,id_bairro,id_cidade)values(?,?,?,?,?,?)");
            //pst2.setInt(1,mod.getCod_cliente());
            pst2.setString(1,mod.getNome_cliente());
            pst2.setString(2, mod.getEnd_cliente());
            pst2.setString(3, mod.getRg_cliente());
            pst2.setString(4, mod.getCpf_cliente());
            pst2.setInt(5, mod.getCod_bairro_cliente());
            pst2.setInt(6,mod.getCod_bairro_cidade());
            pst2.execute();
            
            //inserindo  na tabela itens_clie_tel
            conecta.executaSQL("select * from telefone where id_telefone = '"+mod.getCod_tel()+"'");
            conecta.rs.first();
            codTel = conecta.rs.getInt("id_telefone");
            
            conecta.executaSQL("select * from clientes where nome_cliente = '"+mod.getNome_cliente()+"'");
            conecta.rs.first();
            codCli = conecta.rs.getInt("id_cliente");
            
            PreparedStatement pst1 = conecta.con.prepareStatement("insert into itens_clie_tel(id_cliente,id_tel)values(?,?)");
            pst1.setInt(1, codCli);
            pst1.setInt(2, codTel);
            pst1.execute();
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        conecta.desconecta();
    }
    
    public void AlterarCliente(ModeloClientes mod){
        conecta.conexao();
        try {
    
            
            //            insere na tabela cliente
            PreparedStatement pst2 = conecta.con.prepareStatement("update clientes set nome_cliente = ?,endereco_cliente = ?,rg_cliente = ?,cpf_cliente = ?,id_bairro = ?,id_cidade = ? where id_cliente = ?");
            pst2.setString(1,mod.getNome_cliente());
            pst2.setString(2, mod.getEnd_cliente());
            pst2.setString(3, mod.getRg_cliente());
            pst2.setString(4, mod.getCpf_cliente());
            pst2.setInt(5, mod.getCod_bairro_cliente());
            pst2.setInt(6,mod.getCod_bairro_cidade());
            pst2.setInt(7,mod.getCod_cliente());
            pst2.execute();
            
               //inserindo  na tabela itens_clie_tel
            conecta.executaSQL("select * from telefone where id_telefone = '"+mod.getCod_tel()+"'");
            conecta.rs.first();
            codTel = conecta.rs.getInt("id_telefone");
            conecta.executaSQL("select * from clientes where nome_cliente = '"+mod.getNome_cliente()+"'");
            conecta.rs.first();
            codCli = conecta.rs.getInt("id_cliente");
            
            PreparedStatement pst1 = conecta.con.prepareStatement("update itens_clie_tel set id_tel = ? where id_cliente = ?");
            pst1.setInt(1, codTel);
            pst1.setInt(2, codCli);
            pst1.execute();
            
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
                        }
        conecta.desconecta();
    }
    
    public void ExcluirCliente(ModeloClientes mod){
        conecta.conexao();
        try {
            codCli = mod.getCod_cliente();
            
            PreparedStatement pst2 = conecta.con.prepareStatement("delete from itens_clie_tel where id_cliente = ?");
            pst2.setInt(1,codCli);
            pst2.execute();
            
            PreparedStatement pst = conecta.con.prepareStatement("delete  from clientes where id_cliente = ?");
            pst.setInt(1, codCli);
            pst.execute();
            
           
            
            
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não pode ser excluído\nPois deve está sendo usado por outra tabela ");
        }  
        
        conecta.desconecta();
    }
}
