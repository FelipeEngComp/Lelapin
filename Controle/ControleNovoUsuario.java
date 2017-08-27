/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloNovousuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleNovoUsuario {
    ConectaBanco conecta = new ConectaBanco();
    
    public void SalvaNovoUsuario(ModeloNovousuario mod){
        conecta.conexao();
        try {
            
            PreparedStatement pst = conecta.con.prepareStatement("insert into usuario(nome_usuario,senha_usuario,numero_acesso)values(?,?,?)");
            pst.setString(1, mod.getNome_usuario());
            pst.setString(2, mod.getSenha_usuario());
            pst.setInt(3, 0);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }
        conecta.desconecta();
    }
}
