package main;

import modelo.Financiamento;
import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;

import util.InterfaceUsuario;
import util.Validadores;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        InterfaceUsuario dados = new InterfaceUsuario();
        double valor;
        double taxa;
        int prazo;

        List <Financiamento> listaDeFinanciamentos = new ArrayList<>();

        do {
            valor = dados.valorImovelFornecido();
        } while (!Validadores.validarValorImovel(valor));

        do {
            taxa = dados.taxaJurosAnualFornecida();
        } while (!Validadores.validarTaxaJuros(taxa));

        do {
            prazo = dados.prazoFinanciamentoFornecido();
        } while (!Validadores.validarPrazo(prazo));

        //Financiamento fin = new Financiamento(valor, taxa, prazo);

        Casa casa1 = new Casa(valor, taxa, prazo);
        Casa casa2 = new Casa(valor, taxa, prazo);
        Apartamento apartamento = new Apartamento(valor, taxa, prazo);
        Terreno terreno = new Terreno(valor, taxa, prazo);


        listaDeFinanciamentos.add(casa1);
        listaDeFinanciamentos.add(casa2);
        listaDeFinanciamentos.add(apartamento);
        listaDeFinanciamentos.add(terreno);

        //fin.infoFinanciamento();
        for (Financiamento i : listaDeFinanciamentos) {
            i.infoFinanciamento();
        }
    }
}