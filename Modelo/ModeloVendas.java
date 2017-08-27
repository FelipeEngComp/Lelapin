/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class ModeloVendas {
    private int cod_venda;
    private String data_venda;
    private float valor_venda;
    private int id_cliente;
    private int id_prod;
    private int qnt;
    /**
     * @return the cod_venda
     */
    public int getCod_venda() {
        return cod_venda;
    }

    /**
     * @param cod_venda the cod_venda to set
     */
    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    /**
     * @return the data_venda
     */
    public String getData_venda() {
        return data_venda;
    }

    /**
     * @param data_venda the data_venda to set
     */
    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    /**
     * @return the valor_venda
     */
    public float getValor_venda() {
        return valor_venda;
    }

    /**
     * @param valor_venda the valor_venda to set
     */
    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_prod
     */
    public int getId_prod() {
        return id_prod;
    }

    /**
     * @param id_prod the id_prod to set
     */
    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    /**
     * @return the qnt
     */
    public int getQnt() {
        return qnt;
    }

    /**
     * @param qnt the qnt to set
     */
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
}
