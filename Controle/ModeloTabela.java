
package Controle;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList lin,String[] col){
        
        setLinhas(lin);
        setColunas(col);    
    }
    
    public ArrayList getLinhas(){
        return linhas;
    }
    
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    
    public String[] getColunas(){
        return colunas;
    }
    
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    
    public int getColumnCount(){
        return colunas.length;//quantidade de caracteres que vai ter na coluna
    }
    
    public int getRowCount(){
        
        return linhas.size();
    }
    
    public String getColumnName(int numCol){//vai pegar o valor e nome da coluna
        return colunas[numCol];
    }
    
    public Object getValueAt(int numLin,int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol]; //pega os valores e monta os objetos chamado Linha e retorna para a tabela
    }
}
