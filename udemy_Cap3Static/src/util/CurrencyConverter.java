package util;

public class CurrencyConverter {

	public static double IOF=0.06;

	
	public static double convers�o(double dollarPrice, double dollarAmount) {
		return (1+IOF)*dollarPrice*dollarAmount;
	}	
}
