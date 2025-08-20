package util;

public class Validadores {
    public static boolean validarInteiroPositivo (int inteiro) {
        return inteiro > 0;
    }
    public static boolean validarInteiro (String entrada) {
        try {
            int numero = Integer.parseInt(entrada);  // Tenta converter
            System.out.println("Número digitado: " + numero);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor digitado não é um número inteiro válido.");
            return false;
        }
    }
}
