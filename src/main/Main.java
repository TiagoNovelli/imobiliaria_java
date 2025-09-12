package main;

import modelo.Financiamento;
import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;

import util.InterfaceUsuario;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        InterfaceUsuario dados = new InterfaceUsuario();
        double valor;
        double taxa;
        int prazo;
        double areaConstruida;
        double areaTerreno;
        int numeroVagasGaragem;
        int numeroAndar;
        String zona;

        List <Financiamento> listaDeFinanciamentos = new ArrayList<>();
        /*
        List<Class<?>> listaDeTiposFinanciamento = new ArrayList<>();

        listaDeTiposFinanciamento.add(Casa.class);
        listaDeTiposFinanciamento.add(Casa.class); // pode ter repetição
        listaDeTiposFinanciamento.add(Apartamento.class);
        listaDeTiposFinanciamento.add(Terreno.class);

        // foreach com o tipo declarado
        for (Class<?> tipo : listaDeTiposFinanciamento) {
            System.out.println(tipo.getName()); // imprime o nome da classe
        }
        */

        valor = dados.valorImovelFornecido();
        taxa = dados.taxaJurosAnualFornecida();
        prazo = dados.prazoFinanciamentoFornecido();
        areaTerreno = dados.areaTerreno();
        areaConstruida = dados.areaConstruida();
        numeroVagasGaragem = dados.numeroVagasGaragem();
        numeroAndar = dados.numeroAndar();
        zona = dados.zona();


        //Financiamento fin = new Financiamento(valor, taxa, prazo);

        Casa casa1 = new Casa(valor, taxa, prazo, areaConstruida, areaTerreno);
        Casa casa2 = new Casa(valor, taxa, prazo, areaConstruida, areaTerreno);
        Apartamento apartamento = new Apartamento(valor, taxa, prazo,numeroVagasGaragem, numeroAndar);
        Terreno terreno = new Terreno(valor, taxa, prazo, zona);


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