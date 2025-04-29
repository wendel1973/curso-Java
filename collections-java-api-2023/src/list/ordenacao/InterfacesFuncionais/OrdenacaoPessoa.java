package list.ordenacao.InterfacesFuncionais;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private static List<Pessoa> pessoaList = List.of();
    //construtor
    public OrdenacaoPessoa() {
      this.pessoaList = new ArrayList<>();
    }
    public static void main(String[] args) {
        ordenarPessoaPorAltura();
        
    }
    public static  List<Pessoa> ordenarPessoaPorAltura() {
      try {
        if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
          } else {
            throw new RuntimeException("A lista está vazia!");
          }
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      return null;
    }
  }
