/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execao;

/**
 *
 * @author ifnmg
 */
public class Pessoa {

   private String nome;

   public Pessoa(String nome)throws ParametroVazioException{ 
       this.setNome(nome);
   }
   public String getNome() {
        return nome;
    }

    public final void setNome(String nome)throws ParametroVazioException{ 
        
         if(nome.isEmpty()){
            throw new ParametroVazioException("Nome Vazio");
        }
        
        this.nome=nome;
    }    
}
