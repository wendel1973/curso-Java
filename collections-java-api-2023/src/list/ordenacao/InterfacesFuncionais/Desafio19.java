package list.ordenacao.InterfacesFuncionais;

import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
          List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10,4, 6, 9, 6);

          int soma = numeros.stream().filter(n -> n %3 == 0 || n %5 ==0).mapToInt(Integer::intValue).sum();

          System.out.println("soma: "+soma);

    }

}
