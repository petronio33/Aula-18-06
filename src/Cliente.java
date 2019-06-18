public class Cliente {

    private String nome;
    private String cpf;
    
    public Cliente(String n, String c){
        this.setCpf(c);
        this.setNome(n);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
