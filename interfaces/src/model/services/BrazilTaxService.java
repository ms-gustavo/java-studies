package model.services;

public class BrazilTaxService implements TaxService {

	public final double tax(Double amount) {
		if(amount <= 100) {
			return amount * 0.20;
		} else {
			return amount * 0.15;
		}
	}
	
}
