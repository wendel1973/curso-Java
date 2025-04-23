package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;
    
    
    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getNome()+" "+ getCodigo()+" "+getPreco()+" "+getQuantidade();
    }
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
  }
    @Override
    public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Produto produto)) return false;
         return getCodigo() == produto.getCodigo();
  }

    @Override
    public int hashCode() {
      // TODO Auto-generated method stub
          return Objects.hash(getCodigo());
  }


}
class ComparatorProdutoPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

    
}

