public class Carros {
    String marca;
    int ano;
    String modelo;
    public Carros(String marca, int ano, String modelo){
        this.marca=marca;
        this.ano=ano;
        this.modelo=modelo;

    }
    public int getAno() {
        return ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getMarca()+" "+ getAno()+" "+getModelo();
    }
}
