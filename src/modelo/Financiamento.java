package modelo;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class  Financiamento {
    // Obtém o formatador para a localização brasileira (pt-BR)
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    protected double valorImovel;
    protected double taxaJurosAnual;
    protected int prazoFinanciamento;

    public double getValorImovel() {
        return valorImovel;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public Financiamento (double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual /100;
    }

    public abstract double  calcularPagamentoMensal ();
        // 1. Pagamento mensal = (valor do imóvel / (prazo do financiamento em anos * 12)) * (1 + (taxa anual / 12))
        //return (valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));


    public double pagamentoTotal() {
        // 2. Total do pagamento = pagamento mensal * prazo do financiamento em anos * 12
        return (calcularPagamentoMensal() * prazoFinanciamento * 12);

    }

    public void infoFinanciamento() {
        System.out.println("Valor do imovel:");
        System.out.println(nf.format(getValorImovel()));
        System.out.println("Valor da mensalidade:");
        System.out.println(nf.format(calcularPagamentoMensal()));
        System.out.println("Valor total a ser pago:");
        System.out.println(nf.format(pagamentoTotal()));

    }
}
