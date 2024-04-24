
package br.senac.tadsD.sesh.exemplosspringmvc.teste;

import lombok.Data;

@Data
public class Dados {
    
    private String nome;
    
    private String email;
    
    private int numero; 
    
    public boolean isValid(){
        if(!nome.equals(null))
            return true;
        else
            return false;
    }
    
}
