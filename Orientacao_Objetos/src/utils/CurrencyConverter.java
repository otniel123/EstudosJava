package utils;

public class CurrencyConverter {

    public static double dolarToReais(double cotacao, double reais){
        double valorTotal = cotacao * reais;

        return valorTotal + (valorTotal * 0.06);
    }
}
