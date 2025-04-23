package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.w3c.dom.ranges.RangeException;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas(){
        pessoasList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorNome(){
        List<Pessoa> ordenarPorNome = new ArrayList<>(pessoasList);
        if(!ordenarPorNome.isEmpty()){
            Collections.sort(ordenarPorNome);
            return ordenarPorNome;
        }else{
            throw new RuntimeException("Lista vazia.");
        }
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenarPorAltura = new ArrayList<>(pessoasList);
        if(!ordenarPorAltura.isEmpty()){
            Collections.sort(ordenarPorAltura, new ComparatorPorAltura());
            return ordenarPorAltura;
        }else{
            throw new RuntimeException("Lista vazia.");
        }
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenarPorIdade = new ArrayList<>(pessoasList);
        if(!ordenarPorIdade.isEmpty()){
            Collections.sort(ordenarPorIdade, new ComparatorPorIdade());
            return ordenarPorIdade;
        }else{
            throw  new RuntimeException("Lista vazia");
        }
    }
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Otávio", 40, 1.98);
        ordenacaoPessoas.adicionarPessoa("Zenilda", 80, 1.65);
        ordenacaoPessoas.adicionarPessoa("Jose", 50, 1.7);
        ordenacaoPessoas.adicionarPessoa("Rodrigo", 99, 1.78);
        ordenacaoPessoas.adicionarPessoa("Manoel", 60, 1.4);
        ordenacaoPessoas.adicionarPessoa("Francisco", 15, 1.5);

        System.out.println("Ordenar por nome: "+ordenacaoPessoas.ordenarPorNome());
        System.out.println("Ordenar por altura: "+ordenacaoPessoas.ordenarPorAltura());
        System.out.println("Ordenar por idade: "+ordenacaoPessoas.ordenarPorIdade());


    }
}
