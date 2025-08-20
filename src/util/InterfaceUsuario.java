package util;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class InterfaceUsuario {

    // Obtém o formatador para a localização brasileira (pt-BR)
    static NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));



    static Scanner sc = new Scanner(System.in);

    public static double valorImovelFornecido () {
        System.out.println("Qual o valor do imóvel?");
        double  valorImovel = sc.nextDouble();
        System.out.println("O valor do imóvel é " + nf.format(valorImovel));
        return valorImovel;
    }

    public static double taxaJurosAnualFornecida () {
        System.out.println("Qual a taxa de juros anual?");
        double taxaJurosAnual = sc.nextDouble();
        System.out.println("a taxa de juros anual é  " + taxaJurosAnual + "%");
        return taxaJurosAnual;
    }

    public static int prazoFinanciamentoFornecido () {
        System.out.println("Qual o prazo do financiamento em anos?");
        int prazoFinanciamento = sc.nextInt();
        System.out.println("o prazo do financiamento é de " + prazoFinanciamento + " anos");
        return prazoFinanciamento;
    }

}
