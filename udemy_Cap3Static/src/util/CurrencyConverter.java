package util;

public class CurrencyConverter {

	public static double IOF=0.06;

	
	public static double conversão(double dollarPrice, double dollarAmount) {
		return (1+IOF)*dollarPrice*dollarAmount;
	}	
}
