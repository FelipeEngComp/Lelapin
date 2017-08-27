
package Controle;

import Modelo.ModeloVendas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ControleVenda {
    ConectaBanco conecta = new ConectaBanco();
    ConectaBanco RepCon  = new ConectaBanco();
    
    int cod_venda,cod_prod,qnt;
  
    
    public void salvarVenda(ModeloVendas mod){
        conecta.conexao();
        
        //conecta.executaSQL("update venda set data_venda ='"+mod.getData_venda()+"',valor_venda = '"+mod.getValor_venda()+"',id_cliente = '"+mod.getId_cliente()+"'where id_venda ='"+mod.getCod_venda()+"'");
        
        cod_prod = mod.getId_prod();
        cod_venda = mod.getCod_venda();
        qnt =  mod.getQnt();
        conecta.executaSQL("insert into itens_venda_produto(id_venda,id_produto,quantidade_produto)values('"+cod_venda+"','"+cod_prod+"','"+qnt+"')");
        JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
       
        conecta.desconecta();
    }
    
    public void CancelarVenda(){
        PreparedStatement pst;
        try {
            conecta.conexao();
            conecta.executaSQL("select * from venda inner join itens_venda_produto on venda.id_venda = itens_venda_produto.id_venda " +
"inner join produtos on itens_venda_produto.id_produto = produtos.id_produto where valor_venda = 0");
            conecta.rs.first();
            do{
                int qntProduto = conecta.rs.getInt("quantidade");
                int qntVendida = conecta.rs.getInt("quantidade_produto");
                int soma = qntProduto + qntVendida;
                //estorno na tabela produto
                pst=conecta.con.prepareStatement("update produtos set quantidade = ? where id_produto = ?");
                pst.setInt(1, soma);
                pst.setInt(2, conecta.rs.getInt("id_produto"));
                pst.execute();
                
                //deleta da tabela itens_venda_produto
                pst = conecta.con.prepareStatement("delete from itens_venda_produto where id_venda = ?");
                pst.setInt(1, conecta.rs.getInt("id_venda"));
                pst.execute();
            }while(conecta.rs.next());
            
            pst = conecta.con.prepareStatement("delete from venda where valor_venda = ?");
            pst.setInt(1, 0);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Venda cancelada com sucesso");
            conecta.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Venda cancelada com sucesso" );
        }
    }
    
    public void BaixaDeEstoque(ModeloVendas mod){
        conecta.conexao();
           conecta.executaSQL("select * from produtos where id_produto ='"+mod.getId_prod()+"'");
        try {
            conecta.rs.first();
            qnt = conecta.rs.getInt("quantidade");
            qnt-=mod.getQnt();//baixa no estoque
            PreparedStatement pst = conecta.con.prepareStatement("update produtos set quantidade = ? where id_produto = ?");
            pst.setInt(1, qnt);
            pst.setInt(2, mod.getId_prod());
            pst.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ControleVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
    }
    
    public void ConcluirVenda(ModeloVendas mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("update venda set data_venda = ?,valor_venda = ?,id_cliente=? where id_venda = ?");
            pst.setString(1, mod.getData_venda());
            pst.setFloat(2, mod.getValor_venda());
            pst.setInt(3, mod.getId_cliente());
            pst.setInt(4, mod.getCod_venda());
            pst.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ControleVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        conecta.desconecta();
    }
    
     public void ReposicaoDeEstoque(ModeloVendas mod){
        conecta.conexao();
        RepCon.conexao();
           conecta.executaSQL("select * from itens_venda_produto where id_venda ='"+mod.getCod_venda()+"'");
        try {
            conecta.rs.first();
            do{
                qnt = conecta.rs.getInt("quantidade");
                RepCon.executaSQL("selec * from produtos where id_produto ='"+conecta.rs.getInt("id_produto")+"'");
                RepCon.rs.first();
                
                qnt+=RepCon.rs.getInt("quantidade");//baixa no estoque
                PreparedStatement pst = conecta.con.prepareStatement("update produtos set quantidade = ? where id_produto = ?");
                pst.setInt(1, qnt);
                pst.setInt(2, mod.getId_prod());
                pst.execute();
            }while(conecta.rs.next());
           
            
        } catch (SQLException ex) {
            Logger.getLogger(ControleVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        conecta.desconecta();
        RepCon.desconecta();
    }
}
