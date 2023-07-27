import java.math.BigDecimal;

public class Conta {

    private String nomeCompleto;

    private BigDecimal saldoContaCorrente;

    private BigDecimal saldoInvestimento;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public BigDecimal getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(BigDecimal saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public BigDecimal getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public void setSaldoInvestimento(BigDecimal saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }

    public Conta(String nome){
        this.nomeCompleto = nome;
        this.saldoContaCorrente = new BigDecimal("100.0");
        this.saldoInvestimento = new BigDecimal("0.0");
    }
}
