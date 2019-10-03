/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import java.util.Scanner;
import contacorrente.ContaCorrente;
import java.util.ArrayList;
import contacorrente.Extrato;
import javax.swing.JOptionPane;


public class Main {
    
    
    ArrayList<ContaCorrente> contas = new ArrayList(); 
    
    public void SalvaConta(float numero, float banco, float saldoIni,float agencia ,boolean ativa ){
    
        
     ContaCorrente Aconta = new ContaCorrente(numero,banco,saldoIni,agencia,ativa );    
   
     
    contas.add(Aconta);
        
    }
    
    public void Depositar(String data, float valor , String descricao, ContaCorrente conta){
    
        
        try {
            conta.getExtrato().setValor(valor);
            conta.getExtrato().setData(data);
            conta.getExtrato().setDescricao(descricao);
            System.out.println(valor);
            conta.setSaldoMais(valor);
            conta.getExtratos().add(conta.getExtrato());
        
        System.out.println(conta.toString());
        } catch (Exception e) {
            
             System.out.println("Erro: " + e.getMessage());
        }
       
}
    
    public void Sacar(String data, float valor , ContaCorrente conta){
         conta.getExtrato().setValor(valor);
         conta.getExtrato().setData(data);
         conta.setSaldoMenos(valor);
         conta.getExtratos().add(conta.getExtrato());
        
        
        System.out.println(conta.toString());
        
       
}
    
    public ContaCorrente BuscarConta(float conta){
        
        int cont = 0;
        
        System.out.println("buscasadas");
        ValidarConta(""+conta);
        while(contas.size() > cont){
            
            
            if(conta == contas.get(cont).getNumero() ){ 
                
                return contas.get(cont);
            }
            
          
            cont ++;
            

        }
            
        JOptionPane.showMessageDialog(null ,"Conta não encontada");
        return null;
          
         
    }

    public boolean ValidarConta(String conta) {
     
    int cont = 0;
     
    if(conta.isEmpty()){
        
        return false;
        
    }
    
        
    
    while(contas.size() > cont){
            
            float nconta = Float.parseFloat(conta); 
            
            if(nconta == contas.get(cont).getNumero() ){ 
                
                return true;
            }
            
          
            cont ++;
            

        }
    
    return false;
    
    }
}