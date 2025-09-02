/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.mycompany.mybank;

import br.com.mycompany.entity.Bank;
import br.com.mycompany.entity.User;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruann
 */
public class MyBank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Random cc = new Random();
        
        Bank bank = new Bank(cc.nextInt(30), 0);

        boolean exit = false;

        System.out.println("-----------------*MY BANK*-----------------");
        System.out.println("Qual seu nome? ");
        String name = scan.nextLine();
        System.out.println("Qual seu sobrenome? ");
        String lastName = scan.nextLine();
        System.out.println("Qual seu cpf? ");
        String cpf = scan.nextLine();
        System.out.println("\n");

        User user = new User(name, lastName, cpf);

        do {
            System.out.println("-----------------*MY BANK*-----------------");
            System.out.println("\n");
            System.out.println("Conta: " + bank.getCc() + "\nUsuário: " + user.getName() + " " + user.getLastName());
            System.out.println("Qual operação deseja realizar? \n");

            System.out.println("""
                               1. Saldo. 
                               2. Depósito. 
                               3. Saque. 
                               4. Sair""");
            System.out.println("-------------------------------------------");

            try {

                int option = scan.nextInt();

                switch (option) {
                    case 1 ->
                        System.out.println("Saldo: R$" + bank.checkBalance());
                    case 2 -> {
                        System.out.println("Valor a ser depósitado: ");
                        float value = scan.nextFloat();
                        bank.deposit(value);
                    }
                    case 3 -> {
                        System.out.println("Quanto deseja sacar: ");
                        float withdraw = scan.nextFloat();
                        bank.withdraw(withdraw);
                    }
                    case 4 -> {
                        System.out.println("Obrigado por utilizar nossos serviços!");
                        exit = true;
                    }
                    default ->
                        throw new AssertionError();
                }
            } catch (AssertionError e) {
                System.out.println("Opção inválida. Insira o número correto!");
            }

        } while (!exit);

        
        
    }
}
