/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.tadsD.sesh.exemplosspringmvc.teste;

import jakarta.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author giovani.ajusto
 */
public class Usuario {
    private @Getter @Setter Long id;
    
    @Getter
    @Setter
    @NotEmpty(message = "O nome é obrigatório")
    private String nome;
    
    @Getter
    @Setter
    @NotEmpty(message = "O sobrenome é obrigatório")
    private String sobrenome;
    
    @NotEmpty(message = "O Cargo é obrigatório")
    private @Getter @Setter String cargo;
    
    
    
    
}
