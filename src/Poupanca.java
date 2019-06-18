
public class Poupanca extends Conta {
    
    public Poupanca(double d, String n, Cliente c, String a){
        
        super(d, n, c, a);
        
    }
    
    public void renderJuros(double taxa){
        
        super.depositar(super.getSaldo() * taxa);
    }
    
}
