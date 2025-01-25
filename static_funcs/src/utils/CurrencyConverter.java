package utils;

public class CurrencyConverter {

	public static final double IOF = 0.06; 
	
	public static double amountToPay(double dollarPrice, double quantity) {
		return quantity * dollarPrice * (1 + IOF);
	}
}
