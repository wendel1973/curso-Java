package list.ordenacao.InterfacesFuncionais;

public class Pessoa {
    private String nome;
    private double altura;


public Pessoa(String nome, double altura){
    this.nome = nome;
    this.altura = altura;

}
public double getAltura() {
    return altura;
}
public String getNome() {
    return nome;
}
@Override
public String toString() {
    // TODO Auto-generated method stub
    return nome +' '+ altura;}
}
