package application;

import utils.CurrencyConverter;

public class CurrencyConverterUtilizacao {
    public static void main(String[] args) {
        double cotacaoDolar = 3.10;
        double reais = 200;

        System.out.println(CurrencyConverter.dolarToReais(cotacaoDolar, reais));
    }
}
