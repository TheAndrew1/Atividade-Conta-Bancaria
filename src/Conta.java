import java.math.BigDecimal;

public class Conta {

    private String nomeCompleto;

    private BigDecimal saldoContaCorrente;

    private BigDecimal saldoInvestimento;

    public Conta(String nome){
        this.nomeCompleto = nome;
        this.saldoContaCorrente = new BigDecimal("100.0");
        this.saldoInvestimento = new BigDecimal("0.0");
    }
}
