package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaProdutos;

    CadastroProdutos(){
        this.listaProdutos = new HashSet<>(); 
    }
    public void adicionarProduto(String nome, int cod,  double preco, int quantidade){
        listaProdutos.add(new Produto(nome, cod, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
      
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutoPorPreco());
        produtosPorPreco.addAll(listaProdutos);
        return produtosPorPreco;
    }
    
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Trigo", 1, 10, 1);
        cadastroProdutos.adicionarProduto("Feijao", 2, 40, 1);
        cadastroProdutos.adicionarProduto("Acucar", 3, 150, 1);
        cadastroProdutos.adicionarProduto("Arroz", 4, 50, 1);

        System.out.println("Produtos por nome: "+cadastroProdutos.exibirProdutosPorNome());

        System.out.println("Produtos por preço: "+cadastroProdutos.exibirProdutosPorPreco());
    }

}
