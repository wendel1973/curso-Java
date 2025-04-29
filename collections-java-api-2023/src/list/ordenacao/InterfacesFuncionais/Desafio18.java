package list.ordenacao.InterfacesFuncionais;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10,4, 6, 9);

        // Agrupa os números com base no próprio número.
        Map<Integer, List<Integer>> grupos = numeros.stream()
        .collect(Collectors.groupingBy(num -> num));
        // Você pode ver que temos a indicação quais são os números que se repetem observando chave - valor.
        System.out.println(grupos); 
    
        // Filtra os grupos com tamanho do valor maior que 1, logo, os números repetidos.
        List<Integer> numerosRepetidos = grupos.entrySet().stream()
        .filter(entry -> entry.getValue().size() > 1) // Filtamos as chaves pelos valores contendo acima de 1 repetição
        .map(entry -> entry.getKey()) // Pegamos apenas as chaves
        .collect(Collectors.toList()); // Coletamos para uma nova lista

        // Imprime os números repetidos.
        System.out.println(numerosRepetidos);
        
          
    }

}
