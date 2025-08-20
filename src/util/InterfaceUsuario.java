package util;

import java.util.Scanner;

public class InterfaceUsuario {


    static Scanner sc = new Scanner(System.in);

    public static double valorImovelFornecido () {
        System.out.println("Qual o valor do imóvel?\n");
        double  valorImovel = sc.nextDouble();
        System.out.printf("O valor do imóvel é %f ", valorImovel);
        System.out.println("\n");
        return valorImovel;
    }

    public static double taxaJurosAnualFornecida () {
        System.out.println("Qual a taxa de juros anual?\n");
        double taxaJurosAnual = sc.nextDouble();
        System.out.printf("a taxa de juros anual é %f ", taxaJurosAnual);
        System.out.println("\n");
        return taxaJurosAnual;
    }

    public static int prazoFinanciamentoFornecido () {
        System.out.println("Qual o prazo do financiemanto em anos?\n");
        int prazoFinanciamento = sc.nextInt();
        System.out.println("o prazo do financiamento é " + prazoFinanciamento);
        System.out.println("\n");
        return prazoFinanciamento;
    }

}
