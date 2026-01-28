package util;
public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double convert(double dollarPrice, double quantity) {
        return quantity * dollarPrice * (1.0 + IOF);
    }
}
