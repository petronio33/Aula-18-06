
public class TestaConta {

    public static void main(String[] args) {

        Cliente p = new Cliente("Luciano", "007");
        
        Conta c1 = new Conta(100, "001", p, "0104-x");
        Poupanca p1 = new Poupanca(500, "002", p, "0007");
        
        
        System.out.println(p1.getSaldo());
        
    }

}
