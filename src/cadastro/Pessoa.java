
package cadastro;


public class Pessoa {
    
    private String nome;
    
    
    public String getNome ( ){
    return this.nome;
    //retornar valor do atributo
    }
    
    public void setNome(String n){
        this.nome=n;
    //aloca valor no atributo
    }
    
    public Pessoa (String n){
        this.setNome(n);
    //construtor da classe
    }
    
}
