/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author felipe
 */
public class ModeloBairros {
    private int cod_bairro;
    private String nome_bairro;
    private int cod_cidade;

    /**
     * @return the cod_bairro
     */
    public int getCod_bairro() {
        return cod_bairro;
    }

    /**
     * @param cod_bairro the cod_bairro to set
     */
    public void setCod_bairro(int cod_bairro) {
        this.cod_bairro = cod_bairro;
    }

    /**
     * @return the nome_bairro
     */
    public String getNome_bairro() {
        return nome_bairro;
    }

    /**
     * @param nome_bairro the nome_bairro to set
     */
    public void setNome_bairro(String nome_bairro) {
        this.nome_bairro = nome_bairro;
    }

    /**
     * @return the cod_cidade
     */
    public int getCod_cidade() {
        return cod_cidade;
    }

    /**
     * @param cod_cidade the cod_cidade to set
     */
    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }
}
