/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mycompany.entity;

/**
 *
 * @author Ruann
 */
public class User {
    
    private String name;
    private String lastName;
    private String cpf;
    
    public User(String name, String lastName, String cpf){
        this.name = name;
        this.lastName = lastName;
        this.cpf = cpf;
    }
    
    public User() {
        
    }
}
