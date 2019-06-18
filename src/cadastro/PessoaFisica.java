package cadastro;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String c){
        this.cpf=c;
    }
    
    public PessoaFisica(String n, String c){
        super(n);
        this.setCpf(c);
    }
}
