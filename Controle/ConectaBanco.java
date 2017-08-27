/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class ConectaBanco {
    
    public Statement stm;//responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs;//responsavel por armazenar o resultado de uma pesquisa passada para o statemente
    private String driver = "org.postgresql.Driver";//responsavel por identificar o servico de banco de dados
    private String caminho = "jdbc:postgresql://localhost:5432/sistemalelapin";//responsavel settar o local do banco de dados
    private String usuario = "postgres";
    private String senha = "adsl2+router";
    public Connection con;//responsavel por realizar a coneccao com o banco de dados.
    
    public void conexao(){ //metodo responsavel por realizar a conexao com o banco
        try {
            System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexao
            con = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexao com o banco de dados
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\nErro: "+ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){ //irei usar esse obj para realizar algumas operacoes 
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);//vai esta recebendo minha stringo sql
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Erro ao conectar ao SQL\nErro: "+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
           // JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de desconexão!\nErro: "+ex.getMessage());
        }
    }
}
