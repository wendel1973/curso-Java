package list.ordenacao.InterfacesFuncionais;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class DesafioNove {
    public static void main(String[] args) {
        //Verificar se todos os números da lista são distintos (não se repetem):
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> resultado = numeros.stream().distinct().toList();
        System.out.println(resultado);


        List<Integer> numerosDistintos = numeros.stream().sorted((n1,n2) -> n2 - n1).toList();
        System.out.println(numerosDistintos);
}
}
