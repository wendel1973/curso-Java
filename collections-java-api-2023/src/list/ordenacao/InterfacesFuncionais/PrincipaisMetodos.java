package list.ordenacao.InterfacesFuncionais;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

public @interface PrincipaisMetodos {

    /*Combinada com as Expressões Lambda e Method reference, eles proporcionam uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.
    As operações na Stream API podem ser classificadas em duas categorias principais:

    Operações Intermediárias: são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados. São elas:

    - filter(Predicate<T> predicate): Filtra os elementos da Stream com base em um predicado. Retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado. Exemplo:  stream.filter(n -> n > 5)
    - map(Function<T, R> mapper): Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes. Exemplo: stream.map(s -> s.toUpperCase())
    - sorted(): Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido. Exemplo: stream.sorted()
    - distinct(): Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação. Exemplo: stream.distinct()
    - limit(long maxSize): Limita o número de elementos da Stream aos maxSize primeiros elementos Exemplo: stream.limit(10)
    - skip(long n): Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles. Exemplo: stream.skip(5)

    Operações Terminais: são aquelas que encerram o pipeline e produzem um resultado final. São elas:

    - forEach(Consumer<T> action): Executa uma ação para cada elemento da Stream. Exemplo: stream.forEach(System.out::println)
    - toArray(): Converte a Stream em um array contendo os elementos da Stream. Exemplo: stream.toArray()
    - collect(Collector<T, A, R> collector): Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa. Exemplo: stream.collect(Collectors.toList())
    - count(): Retorna o número de elementos na Stream. Exemplo: stream.count()
    - anyMatch(Predicate<T> predicate): Verifica se algum elemento da Stream atende ao predicado especificado. Exemplo: stream.anyMatch(s -> s.startsWith("A"))
    - allMatch(Predicate<T> predicate): Verifica se todos os elementos da Stream atendem ao predicado especificado. Exemplo: stream.allMatch(n -> n > 0)
    - noneMatch(Predicate<T> predicate): Verifica se nenhum elemento da Stream atende ao predicado especificado. Exemplo: stream.noneMatch(s -> s.isEmpty())
    - min(Comparator<T> comparator) e max(Comparator<T> comparator): Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido. Exemplo: stream.min(Comparator.naturalOrder()) ou stream.max(Comparator.naturalOrder())
    - reduce(T identity, BinaryOperator<T> accumulator): Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final. Exemplo: stream.reduce(0, (a, b) -> a + b)

Lambda

    As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.
    As interfaces funcionais desempenham um papel crucial na programação funcional em Java, pois servem de base para o uso de expressões lambda.
    Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.
    As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).*/

}
