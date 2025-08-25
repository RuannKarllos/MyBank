/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mycompany.entity;

/**
 *
 * @author Ruann
 */
public class bank {
    
    private int agency;
    private int cc;
    private double balance;
    
    
    
    public bank(int agency, int cc, double balance) {
        this.agency = agency;
        this.cc = cc;
    }
    
    public bank() {
        
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    
    
}
