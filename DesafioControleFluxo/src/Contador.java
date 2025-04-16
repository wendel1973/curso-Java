import java.util.Locale;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroum = 20;//scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametrodois = 10; //scanner.nextInt();

        try {
            contar(parametroum, parametrodois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro. "+ e.getMessage());
        }
    }
    static void contar(int parametroum, int parametrodois) throws ParametrosInvalidosException{
        
        if (parametroum > parametrodois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametrodois - parametroum;

        for(int i=1; i <= contagem; i++){
            System.out.println(i);

        }

    }
}
