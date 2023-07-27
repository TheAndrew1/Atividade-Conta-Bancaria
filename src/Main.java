import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Alex");
        Scanner scanf = new Scanner(System.in);
        int opcao= 0;
        while (opcao != 5) {
        System.out.println("|Banco Biederman|");
        System.out.println("Bem vindo " +conta.getNomeCompleto());
        System.out.println("1- Visualizar saldos");
        System.out.println("2- Resgatar");
        System.out.println("3- Depositar");
        System.out.println("4- Investir");
        System.out.println("5- Fechar");
        System.out.println("Digite um numero:");
        opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1- Visualizar saldos");
                    break;
                case 2:
                    System.out.println("2- Resgatar");
                    break;
                case 3:
                    System.out.println("3- Depositar");
                    break;
                case 4:
                    System.out.println("4- Investir");
                    break;
                case 5:
                    System.out.println("4- Fechar");

                default:
                    System.out.println("numero invalido");
                    break;
            }
        }
        scanf.close();
    }
}