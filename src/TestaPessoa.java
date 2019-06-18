
public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setPeso(50);
        p.setAltura(175);
        
        System.out.println("Peso:" + p.getPeso());
        System.out.println ("Altura:" + p.getAltura());
        
        double i = p.imc();
        
        System.out.println("IMC: " + i);
        
    }

}
