package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdateConsumer implements Consumer<Product> {

	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice() * 1.1);
		
	}

}
