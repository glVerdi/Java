package CotacaoECompraDeDolar;

public class CurrencyConverter{
    public static final double IOF = 6.0;
    public static double conversor(double dollar, double quantity){
        double value = dollar * quantity;
        return value += value * IOF / 100;
    }
}