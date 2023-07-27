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
    }

    public void deposito(double deposito){
        this.saldoContaCorrente += deposito;
        System.out.println("Valor R$" + deposito + "depositado com sucesso");
    }

    public void resgate(double resgate){
        this.saldoInvestimento -= resgate;
        this.saldoContaCorrente += resgate;
    }

    public void investimento(double investimento){
        this.saldoInvestimento += investimento;
        this.saldoContaCorrente -= investimento;
    }

}
