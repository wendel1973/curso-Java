import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] nomes = {"José", "Manoel", "Pedro", "JOão"};

        for (String n : nomes) {
            System.out.println("Hello, World! "+ n);
            
        }
        Carros carro1 = new Carros("VW", 1973, "Fusca");
        Carros carro2 = new Carros("Fiat", 1999, "147");


        List<Carros> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
       
        for (Carros c : carros) {
            System.out.println(c.marca);
            
            
        }
        
    }
}
