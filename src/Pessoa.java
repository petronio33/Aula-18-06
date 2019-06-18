public class Pessoa {
   
    private double peso;
    private double altura;
    
    public void setPeso(double p ){
        this.peso = p;
    }
    public void setAltura(double altura ){
        this.altura = altura;
    }
    
    public double getPeso(){
        
        return this.peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void mostrar(){
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
    }
    
    
    public double imc(){
        return peso / (altura * altura);
    }
     
}
