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

        System.out.println("Vamos iniciar o financiamento!");
        InterfaceUsuario dados = new InterfaceUsuario();
        double valor;
        double taxa;
        int prazo;
        double areaConstruida;
        double areaTerreno;
        int numeroVagasGaragem;
        int numeroAndar;
        String zona;

        // Armazenando cada financiamento
        List <Financiamento> listaDeFinanciamentos = new ArrayList<>();

        //Achei uma boa ideia tratar cada financiamento pelo seu tipo

        List<Class<?>> listaDeTiposFinanciamento = new ArrayList<>();

        // Teremos 4 financiamentos
        // todo: posso perguntar quantos tipos de cada  serão
        listaDeTiposFinanciamento.add(Casa.class);
        listaDeTiposFinanciamento.add(Casa.class);
        listaDeTiposFinanciamento.add(Apartamento.class);
        listaDeTiposFinanciamento.add(Terreno.class);

        // para cada item nessa lista e o seu tipo
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