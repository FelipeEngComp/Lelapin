/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class ModeloProdutos {
    private int cod_prod;
    private String nome_prod;
    private float compra_prod;
    private float venda_prod;
    private int   quant_prod;
    private int   cod_forn;

    /**
     * @return the cod_prod
     */
    public int getCod_prod() {
        return cod_prod;
    }

    /**
     * @param cod_prod the cod_prod to set
     */
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    /**
     * @return the nome_prod
     */
    public String getNome_prod() {
        return nome_prod;
    }

    /**
     * @param nome_prod the nome_prod to set
     */
    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    /**
     * @return the compra_prod
     */
    public float getCompra_prod() {
        return compra_prod;
    }

    /**
     * @param compra_prod the compra_prod to set
     */
    public void setCompra_prod(float compra_prod) {
        this.compra_prod = compra_prod;
    }

    /**
     * @return the venda_prod
     */
    public float getVenda_prod() {
        return venda_prod;
    }

    /**
     * @param venda_prod the venda_prod to set
     */
    public void setVenda_prod(float venda_prod) {
        this.venda_prod = venda_prod;
    }

    /**
     * @return the quant_prod
     */
    public int getQuant_prod() {
        return quant_prod;
    }

    /**
     * @param quant_prod the quant_prod to set
     */
    public void setQuant_prod(int quant_prod) {
        this.quant_prod = quant_prod;
    }

    /**
     * @return the cod_forn
     */
    public int getCod_forn() {
        return cod_forn;
    }

    /**
     * @param cod_forn the cod_forn to set
     */
    public void setCod_forn(int cod_forn) {
        this.cod_forn = cod_forn;
    }
}
