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

        List<Class<?>> listaDeTiposFinanciamento = new ArrayList<>();

        listaDeTiposFinanciamento.add(Casa.class);
        listaDeTiposFinanciamento.add(Casa.class);
        listaDeTiposFinanciamento.add(Apartamento.class);
        listaDeTiposFinanciamento.add(Terreno.class);

        // foreach com o tipo declarado
        for (Class<?> tipo : listaDeTiposFinanciamento) {
            System.out.println("Financiamnto de " + tipo.getSimpleName()); // imprime o nome da classe
            valor = dados.valorImovelFornecido();
            taxa = dados.taxaJurosAnualFornecida();
            prazo = dados.prazoFinanciamentoFornecido();

             switch (tipo.getSimpleName()) {
                case "Casa":
                    areaTerreno = dados.areaTerreno();
                    areaConstruida = dados.areaConstruida();
                    Casa casa = new Casa(valor, taxa, prazo, areaConstruida, areaTerreno);
                    listaDeFinanciamentos.add(casa);
                    break;
                case "Apartamento":
                    numeroVagasGaragem = dados.numeroVagasGaragem();
                    numeroAndar = dados.numeroAndar();
                    Apartamento apartamento = new Apartamento(valor, taxa, prazo,numeroVagasGaragem, numeroAndar);
                    listaDeFinanciamentos.add(apartamento);
                    break;
                case "Terreno":
                    //areaTerreno = dados.areaTerreno();
                    zona = dados.zona();
                    Terreno terreno = new Terreno(valor, taxa, prazo, zona);
                    listaDeFinanciamentos.add(terreno);
                    break;
                default:
                    break;
            }
        }


        for (Financiamento i : listaDeFinanciamentos) {
            i.infoFinanciamento();
        }
    }
}