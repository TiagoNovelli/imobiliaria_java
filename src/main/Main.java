package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import util.Validadores;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        InterfaceUsuario dados = new InterfaceUsuario();
        double valor;
        double taxa;
        int prazo;

        do {
            valor = dados.valorImovelFornecido();
        } while (!Validadores.validarValorImovel(valor));

        do {
            taxa = dados.taxaJurosAnualFornecida();
        } while (!Validadores.validarTaxaJuros(taxa));

        do {
            prazo = dados.prazoFinanciamentoFornecido();
        } while (!Validadores.validarPrazo(prazo));

        Financiamento fin = new Financiamento(valor, taxa, prazo);
        fin.infoFinanciamento();


    }
}