import java.math.BigDecimal;

public class Conta {

    private String nomeCompleto;

    private double saldoContaCorrente;

    private double saldoInvestimento;

    public Conta(String nome){
        this.nomeCompleto = nome;
        this.saldoContaCorrente = 100.0;
        this.saldoInvestimento = 0.0;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public double getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public void setSaldoInvestimento(double saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }

    public void saldos(){
        System.out.println("");
        System.out.println("Saldo conta corrente: R$" + this.getSaldoContaCorrente());
        System.out.println("Saldo conta investimento: R$" + this.getSaldoInvestimento());
        System.out.println("");
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
        }
    }

    public void deposito(double deposito){
        if (deposito < 0){
            System.out.println("Valor inválido!");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
            }
            return;
        }

        this.saldoContaCorrente += deposito;
        System.out.println("Valor de R$" + deposito + " depositado com sucesso!");
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
        }
    }

    public void resgate(double resgate){
        if (resgate < 0){
            System.out.println("Valor inválido!");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
            }
            return;
        }
        if (this.saldoInvestimento < resgate){
            System.out.println("Valor solicitado no resgate não dispoível.");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
            }
            return;
        }

        this.saldoInvestimento -= resgate;
        this.saldoContaCorrente += resgate;

        System.out.println("Valor de R$" + resgate + " resgatado com sucesso!");
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
        }
    }

    public void investimento(double investimento){
        if (investimento < 0){
            System.out.println("Valor inválido!");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
            }
            return;
        }
        if (this.saldoContaCorrente < investimento){
            System.out.println("Valor do investimento não dispoível.");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
            }
            return;
        }

        this.saldoInvestimento += investimento;
        this.saldoContaCorrente -= investimento;

        System.out.println("Valor de R$" + investimento + " investido com sucesso!");
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
        }
    }

}
