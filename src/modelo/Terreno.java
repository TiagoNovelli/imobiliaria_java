package modelo;

public class Terreno extends Financiamento {
    private String zona;

    public Terreno (double valorImovel, double taxaJurosAnual, int prazoFinanciamento, String zona) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.zona = zona;
    }


    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public double calcularPagamentoMensal() {
        return (valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12)) * 1.02;
    }


}
