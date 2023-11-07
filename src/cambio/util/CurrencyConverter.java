package cambio.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double converter(double dollar, double reais){
        return  dollar * reais + (dollar * reais * IOF);
    }
}
