package list.ordenacao.InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

  List<Integer> multiplosDeTresECinco = numeros.stream().filter(n -> n %2 == 0 || n % 3 ==0 || n % 5 == 0).toList();
        
   System.out.println(multiplosDeTresECinco);

   System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
   Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numeros.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
   System.out.println(collectNumerosMultiplosDe3E5);
}

}
