package modulo02_poo.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double dollarToReal(double valor, double preco) {
        return valor * preco * (1.0 + IOF);
    }

}
