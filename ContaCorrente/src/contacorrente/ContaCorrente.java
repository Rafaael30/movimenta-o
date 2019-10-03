/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import java.util.ArrayList;
import java.util.Scanner;

public class ContaCorrente {

    
    
    private float banco = 0;
    private float numero = 0;
    private float saldoIni = 0;
    private float agencia = 0;
    private boolean ativa = true;
    private float saldo = 0;
    private Extrato extrato = new Extrato();        
    private ArrayList extratos = new ArrayList<Extrato>();
    
    
    
    public ContaCorrente(float numero, float banco, float saldoIni,float agencia ,boolean ativa) {
             
     this.setNumero(numero);
     this.setBanco(banco);
     this.setSaldoIni(saldoIni);
     this.setAgencia(agencia);
     this.setAtiva(ativa);
     
     
    }


    /**
     * @return the banco
     */
    public float getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(float banco) {
        this.banco = banco;
    }

    /**
     * @return the numero
     */
    public float getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(float numero) {
        this.numero = numero;
    }

    /**
     * @return the saldoIni
     */
    public double getSaldoIni() {
        return saldoIni;
    }

    /**
     * @param saldoIni the saldoIni to set
     */
    public void setSaldoIni(float saldoIni) {
        this.saldoIni = saldoIni;
        this.saldo = saldoIni ;
    }

    /**
     * @return the agencia
     */
    public float getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(float agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the ativa
     */
    public boolean isAtiva() {
        return ativa;
    }

    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    /**
     * @return the extrato
     */
    public Extrato getExtrato() {
        return extrato;
    }

    /**
     * @param extrato the extrato to set
     */
    public void setExtrato(Extrato extrato) {
        this.extrato = extrato;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldoMais(float saldo) {
        System.out.println(this.saldo);
      this.saldo += saldo;
    }
    
     public void setSaldoMenos(float saldo) {
      this.saldo -= saldo;
    }

    
    
     @Override
     public String toString(){
        return  " " + this.numero + " \n " + this.saldo;
    }
    
    public String ImprimirExtrato(){
        
        String qualquer = "";
        int cont = 0 ;
        
        qualquer += "Saldo Inicial" + this.saldoIni;
        
        while (this.getExtratos().size() > cont) {
            
            qualquer += " \n " + getExtratos().get(cont).toString();
            cont ++;
        }
        
        qualquer += "Saldo final" + this.saldo;
        
        return qualquer ;
        
    }

    /**
     * @return the extratos
     */
    public ArrayList getExtratos() {
        return extratos;
    }

    /**
     * @param extratos the extratos to set
     */
    public void setExtratos(ArrayList extratos) {
        this.extratos = extratos;
    }
        
 
}
