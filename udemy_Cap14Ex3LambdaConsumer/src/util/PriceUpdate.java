package util;

import java.util.function.Consumer;

import entities.Product1Interface;

public class PriceUpdate implements Consumer<Product1Interface> {

	@Override
	public void accept(Product1Interface p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}