package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        double valor = InterfaceUsuario.valorImovelFornecido();
        double taxa = InterfaceUsuario.taxaJurosAnualFornecida();
        int prazo = InterfaceUsuario.prazoFinanciamentoFornecido();

        Financiamento fin = new Financiamento(valor, taxa, prazo);
        System.out.println(fin);


    }
}