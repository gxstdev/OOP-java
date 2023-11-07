package cambio;

import cambio.util.CurrencyConverter;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double valorDollar = input.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double qtdDollar = input.nextDouble();
        System.out.printf("Valor a ser pago em reais = %.2f", CurrencyConverter.converter(valorDollar, qtdDollar));
        input.close();
    }
}
