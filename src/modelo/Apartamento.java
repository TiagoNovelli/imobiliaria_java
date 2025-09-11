package modelo;

public class Apartamento extends Financiamento {
    public Apartamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
    }

    @Override
    public double calcularPagamentoMensal() {
        double valorApartamento = super.getValorImovel();
        double taxaMensal = super.getTaxaJurosAnual() / 12; // já está dividido por 100 no construtor
        int meses = super.getPrazoFinanciamento() * 12;

        double numerador = valorApartamento * taxaMensal * Math.pow(1 + taxaMensal, meses);
        double denominador = Math.pow(1 + taxaMensal, meses) - 1;

        return numerador / denominador;
    }
}
