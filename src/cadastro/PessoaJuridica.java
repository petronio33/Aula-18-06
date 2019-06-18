package cadastro;

public class PessoaJuridica extends Pessoa {
    
    private String cnpj;
    
    public String getCnpj (){
        return this.cnpj;
    
    } 
    
    public void setCnpj (String c){
        this.cnpj = c;
    }
    
    public PessoaJuridica(String n, String c){
        super(n);
        setCnpj(c);
        
    }
}
