public class Conta {
    
    private double saldo;
    private String numero;
    private Cliente titular;
    private String agencia;
    
    public Conta(double s, String n, Cliente t, String a){
        this.depositar(s);
        this.setNumero(n);
        this.setTitular(t);
        this.setAgencia(a);
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //Criando os atributos
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public Cliente getTitular(){
        return this.titular;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    
    public boolean sacar(double valor){
        
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        
        return false;
    }
    
    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    
}
