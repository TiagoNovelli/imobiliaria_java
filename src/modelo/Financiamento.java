package modelo;

public class Financiamento {
    double valorImovel;
    double taxaJurosAnual;
    int prazoFinanciamento;

    public Financiamento (double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal () {
        // 1. Pagamento mensal = (valor do imóvel / (prazo do financiamento em anos * 12)) * (1 + (taxa anual / 12))
        double mensal = (valorImovel / (prazoFinanciamento * 12)) * (taxaJurosAnual / 12);
        System.out.println("Valor mensal R$" + mensal);
        return mensal;
    }

    public double pagamentoTotal() {
        // 2. Total do pagamento = pagamento mensal * prazo do financiamento em anos * 12
        double total = (calcularPagamentoMensal() * prazoFinanciamento);
        System.out.println("Valor total R$" + total);
        return total;
    }
}
