/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

/**
 *
 * @author Rafael
 */
public class Extrato {

    public Extrato() {
   
    
    
    }
    
    
    private String data = "";
    private float valor = 0;
    private String descricao = "";

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor){
        this.valor = valor;
        
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
     public String toString(){
        return  " " + this.data + "  " + this.descricao + " " + this.valor  ;
    }
    
    
    
    
}
