/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facada;

/**
 *
 * @author Rian Alves <Rian at IFNMG>
 */
public class Cliente {
    private Integer Id;
    private String Nome;

    public Cliente(Integer Id, String Nome) {
        this.Id = Id;
        this.Nome = Nome;
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
}
