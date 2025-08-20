package util;

public class Validadores {
    /*
    Essa classe possui os validadores da regra de negócio
     */
    public static boolean validarPrazo (int inteiro) {
        // prazo deve estar entre 10 e 35 anos para garantir lucro no financiamento
        // 420 meses no máximo = 35 anos
        if (inteiro >= 10 && inteiro <=33) {
            return true;
        }
        System.out.println("O prazo deve estar entre 10 e 30 anos");
        return false;
    }
    public static boolean validarValorImovel (double valor) {
        /*
        A linha de financiamento prevê condições facilitadas de crédito,
        como prazos de pagamento de até 420 meses e juros nominais de 10% ao ano,
        abaixo dos praticados pelo mercado. A proposta prevê aquisição de imóveis de até R$ 500 mil
         */
        if (valor >= 210000 && valor <= 500000) {
            return true;
        }
        System.out.println("o valor deve variar de R$ 210 mil a R$ 500 mil");
        System.out.println("Conforme regras do programa Minha Casa Minha Vida");
        return false;
    }

    public static boolean validarTaxaJuros (double juros) {
        /*
        juros nominais de 10% ao ano
         */
        if (juros <= 12 && juros >= 8) {
            return true;
        }
        System.out.println("A taxa de juros deve estar entre 8% e 12%");
        return false;
    }

    public static boolean validarInteiro (String entrada) {
        // todo: implementar try e except para validar os casts, verificar tipos de entrada
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
