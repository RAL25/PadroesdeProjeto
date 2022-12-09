/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correnteresponsavel;

/**
 *
 * @author Rian Alves <Rian at IFNMG>
 */
public class Funcionario2 {

    public Funcionario2(int valor) {
        if(valor<=20){
            System.out.println("Passando para o Gerente");
            new Gerente(valor);
        }else{
            System.out.println("Valor Aprovado!");
        }
    }
}
