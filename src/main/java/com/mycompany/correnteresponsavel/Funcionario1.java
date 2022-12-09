/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correnteresponsavel;

/**
 *
 * @author Rian Alves <Rian at IFNMG>
 */
public class Funcionario1 {
    public Funcionario1(int valor){
        if(valor<=50){
            System.out.println("Passando para o funcionario 2");
            new Funcionario2(valor);
        }else{
            System.out.println("Valor Aprovado!");
        }
    }
}
