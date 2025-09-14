package util;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InterfaceUsuario {

    // Obtém o formatador para a localização brasileira (pt-BR)
    static NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    static Scanner sc = new Scanner(System.in);

    public double valorImovelFornecido () {
        double valorImovel;
        do {

            System.out.println("Qual o valor do imóvel?");
            valorImovel = sc.nextDouble();
            System.out.println("O valor do imóvel é " + nf.format(valorImovel));
        } while (!Validadores.validarValorImovel(valorImovel));

        return valorImovel;
    }

    public double taxaJurosAnualFornecida () {
        double taxaJurosAnual;
        do {
            System.out.println("Qual a taxa de juros anual?");
            taxaJurosAnual = sc.nextDouble();
            System.out.println("a taxa de juros anual é  " + taxaJurosAnual + "%");
        } while (!Validadores.validarTaxaJuros(taxaJurosAnual));

        return taxaJurosAnual;
    }

    public int prazoFinanciamentoFornecido () {
        int prazo;
        do {
            System.out.println("Qual o prazo do financiamento em anos?");
            prazo = sc.nextInt();
            System.out.println("o prazo do financiamento é de " + prazo + " anos");
        } while (!Validadores.validarPrazo(prazo));

        return prazo;
    }

    public double areaConstruida () {
        System.out.println("Qual a area Construida");
        double areaConstruida = sc.nextDouble();
        System.out.println("a area construida é  " + areaConstruida + " m²");
        return areaConstruida;
    }

    public double areaTerreno () {
        System.out.println("Qual a area do terreno");
        double areaTerreno = sc.nextDouble();
        System.out.println("a area do terreno é  " + areaTerreno + " m²");
        return areaTerreno;
    }

    public int numeroVagasGaragem () {
        System.out.println("Qual o numero de vagas de garagem desejadas?");
        double numeroVagasGaragem = sc.nextInt();
        System.out.println("O numero de vagas é  " + numeroVagasGaragem);
        return (int) numeroVagasGaragem;
    }

    public String zona () {
        String zona;
        do {
            System.out.println("1 - Zona urbana / 2 - Zona rural?");
            int zonaEscolhida = sc.nextInt();
            if(zonaEscolhida == 1) {
                zona = "Zona urbana";
            }
            else if (zonaEscolhida == 2){
                zona = "Zona urbana";
            } else {
                zona = "invalido";
                System.out.println("A zona escolhida é invalida");
            }
        } while (zona.equals("invalido"));


        System.out.println("A zona escolhida é  " + zona);
        return zona;
    }

    public int numeroAndar () {
        System.out.println("Qual o numero do andar do apartamento?");
        double numeroAndar = sc.nextInt();
        System.out.println("O numero do andar é  " + numeroAndar);
        return (int) numeroAndar;
    }

}
