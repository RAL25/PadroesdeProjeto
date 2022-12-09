/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.correnteresponsavel;

/**
 *
 * @author Rian Alves <Rian at IFNMG>
 */
public class CorrenteResponsavel {

    public static void main(String[] args) {    //Exemplo de como funciona o Chain of Responsability 
        int valor = 10;     //exemplo de valor passado por parametro
        
        System.out.println(">>Chamando o funcionario");
        new Funcionario1(valor);                       //chama o construtor do funcionario para verificar o caso
                                                       //se caso for preciso chama o outro funcionario que está acima dele para verificar
                                                       //até chegar no ultimo caso
        
    }
}
