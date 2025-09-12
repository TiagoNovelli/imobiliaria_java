package modelo;

public class Apartamento extends Financiamento {
    private int numeroVagasGaragem;
    private int numeroAndar;
    public Apartamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, int numeroVagasGaragem, int numeroAndar) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    public int getNumeroVagasGaragem() {
        return numeroVagasGaragem;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    public void setNumeroVagasGaragem(int numeroVagasGaragem) {
        this.numeroVagasGaragem = numeroVagasGaragem;
    }

    public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;
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

    public void infoFinanciamento() {
        System.out.println("o numero do andar é " + getNumeroAndar());
        System.out.println("a quantidade de vagas de garagem é " + getNumeroVagasGaragem());
    }
}
