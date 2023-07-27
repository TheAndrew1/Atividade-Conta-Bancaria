import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Alex");
        Scanner scanf = new Scanner(System.in);
        int numero;

        System.out.println("|Banco Biederman|");
        System.out.println("Bem vindo" +conta.getNomeCompleto());
        System.out.println("Digite um numero:");
        numero = scanf.nextInt();
        System.out.println("1- Visualizar saldos");
        System.out.println("2- Resgatar");
        System.out.println("3- Depositar");
        System.out.println("4- Investir");
    }
}