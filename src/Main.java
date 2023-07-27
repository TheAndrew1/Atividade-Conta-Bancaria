import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Alex");
        Scanner scanf = new Scanner(System.in);
        int opcao = 0;
        double valor;
        while (opcao != 5)
        {
            System.out.println("");
            System.out.println("|Banco Biederman|");
            System.out.println("Bem vindo " + conta.getNomeCompleto());
            System.out.println("1- Visualizar saldos");
            System.out.println("2- Resgatar");
            System.out.println("3- Depositar");
            System.out.println("4- Investir");
            System.out.println("5- Fechar");
            System.out.println("Digite um numero:");
            opcao = scanf.nextInt();

            switch (opcao) {
                case 1 -> {
                    conta.saldos();
                }
                case 2 -> {
                    conta.resgate(50.0);
                }
                case 3 -> {
                    conta.deposito(50.0);
                }
                case 4 -> {
                    conta.investimento(50.0);
                }
                case 5 -> {
                    System.out.println("Saindo...");
                }
                default -> System.out.println("Número inválido");
            }

            System.out.println("");
        }
        scanf.close();
    }
}