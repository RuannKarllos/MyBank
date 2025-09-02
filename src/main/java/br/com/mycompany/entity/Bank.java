/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mycompany.entity;

/**
 *
 * @author Ruann
 */
public class Bank {
     
    private int cc;
    private float balance;
    
    
    
    public Bank(int cc, float balance) {
        this.cc = cc;
        this.balance = balance;
    }
    
    public Bank() {
        
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
    
    public float checkBalance(){
        return balance;
    }
    
    public void deposit(float value){
        this.balance =+ value;
    }
    
    public void withdraw(float value){
        if (value > this.balance) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.balance =- value;
        }
    }
}
