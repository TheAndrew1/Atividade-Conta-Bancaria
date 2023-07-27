import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String cliente = scanf.nextLine();
        Conta conta = new Conta(cliente);
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
                    System.out.println("Digite um valor para resgatar(seu saldo atual é:"+conta.getSaldoInvestimento()+")");
                    valor = scanf.nextDouble();
                    conta.resgate(valor);
                }
                case 3 -> {
                    System.out.println("Digite um valor para depositar(seu saldo atual é:"+conta.getSaldoContaCorrente()+")");
                    valor = scanf.nextDouble();
                    conta.deposito(valor);
                }
                case 4 -> {
                    System.out.println("Digite um valor para investir(seu saldo atual é:"+conta.getSaldoContaCorrente()+")");
                    valor = scanf.nextDouble();
                    conta.investimento(valor);
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