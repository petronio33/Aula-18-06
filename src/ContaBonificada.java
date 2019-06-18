
public class ContaBonificada extends Conta {
    
    private double bonus;
    
    public ContaBonificada(double s, String n, Cliente t, String a, double b){
        super(s,n, t, a);
        this.setBonus(b);        
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    //Redefinição
    public void depositar(double valor){
        double b = (valor * 0.01) + this.getBonus();
        this.setBonus(b);
        super.depositar(valor);
    }
    
    public void renderBonus(){
        super.depositar(this.getBonus());
        this.setBonus(0);
    }
    
    
}
