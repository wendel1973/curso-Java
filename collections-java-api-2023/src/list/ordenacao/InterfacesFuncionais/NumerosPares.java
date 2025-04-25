package list.ordenacao.InterfacesFuncionais;

import java.util.List;
import java.util.function.Consumer;

public class NumerosPares {
   

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
        
        Consumer<Integer> imprimirNumeroPar = n -> {
            if (n %2 ==0){
                System.out.println(n);
            }

        };
        System.out.println("---MANEIRA 1--");
        numeros.forEach(imprimirNumeroPar);
        System.out.println("---------------------------");
        System.out.println("---MANEIRA 2--");
        numeros.stream().forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer n) {
                if(n %2 ==0){
                    System.out.println(n);
                };
            }

        });
        System.out.println("---------------------------");
        System.out.println("---MANEIRA 3--");

        numeros.forEach(n -> {
            if (n %2 == 0){
                System.out.println(n);
            }
            });
            


    }

}
