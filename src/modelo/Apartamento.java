package modelo;

public class Apartamento extends Financiamento {
    public Apartamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
    }

    @Override
    public double calcularPagamentoMensal() {

        // Imóvel de R$ 500.000,00, 10% de juros, 10 anos
        // (500000 * (1 + (0,10 / 12) * (0,10 / 12)) ^ (10 * 12)) / ((1 + (0,10 / 12)) ^ (10 * 12) - 1) =  6607,537
        double valorApartamento = super.getValorImovel();
        double taxaMensal = (super.getTaxaJurosAnual()/12) ;
        double meses = super.getPrazoFinanciamento() * 12;

        return (valorApartamento * Math.pow(1 + taxaMensal,meses)) / (Math.pow(1 + taxaMensal,meses) -1);

    }
}
