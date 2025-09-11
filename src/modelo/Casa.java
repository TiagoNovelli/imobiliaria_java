package modelo;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double areaTerreno;

    public Casa (double valorImovel, double taxaJurosAnual, int prazoFinanciamento, double areaConstruida, double areaTerreno) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        // 1. Pagamento mensal = (valor do imóvel / (prazo do financiamento em anos * 12)) * (1 + (taxa anual / 12))
        return (valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12)) + 80;
    }
}
