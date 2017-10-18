/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejm1;

/**
 *
 * @author adragonrc
 */
public class Cuenta{
    private String titular ;
    private float saldo;
        
    public Cuenta(String titular, float saldo){
    
        this.titular=titular;
        this.saldo=saldo;
        
    }
    public Cuenta(String titular){
        this.titular=titular;
        this.saldo=0;
    }
    
    public String gettitular(){
        return titular;
    }
    public void settitular(String titular){
        this.titular=titular;
    }
    public float getsaldo(){
        return saldo;
    }
    public void setsaldo(float saldo){
        this.saldo=saldo;
    }
    
}
