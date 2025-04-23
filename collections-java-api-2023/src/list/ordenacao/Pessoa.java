package list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }
    @Override
    public int compareTo(Pessoa p) {
       
        return nome.compareToIgnoreCase(p.getNome());
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public String toString() {
        return getNome()+" "+ getIdade()+" "+getAltura();
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

}
class  ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    
}
class ComparatorPorIdade implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p1.getIdade(), p2.getIdade());
    }

}
