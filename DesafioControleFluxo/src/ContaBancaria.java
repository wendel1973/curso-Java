import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double saldo = 0.0F;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Valor a ser depositado:");
                    double valorDepositado = scanner.nextDouble();
                    saldo = saldo + valorDepositado;
                    System.out.println("Saldo atual "+ saldo);
                    break;
                case 2:
                System.out.println("Valor a ser sacado:");
                   double valorSacado = scanner.nextDouble();
                    if(valorSacado < saldo){
                      saldo = saldo - valorSacado;
                      System.out.println("Saldo atual "+ saldo);
                    }else{
                      System.out.println("Saldo insuficiente.");
                    }
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

}
