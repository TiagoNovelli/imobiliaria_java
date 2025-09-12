package util;

public class InterfaceUsuarioCasa extends InterfaceUsuario{
    protected double areaConstruida () {
        System.out.println("Qual a area Construida");
        double areaConstruida = sc.nextDouble();
        System.out.println("a area construida é  " + areaConstruida + " m²");
        return areaConstruida;
    }

    protected double areaTerreno () {
        System.out.println("Qual a area Construida");
        double areaTerreno = sc.nextDouble();
        System.out.println("a area do terreno é  " + areaTerreno + " m²");
        return areaTerreno;
    }
}
