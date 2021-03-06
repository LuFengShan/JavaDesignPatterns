package abstractfactory.pattern.product.tablet.impl;

import abstractfactory.pattern.product.tablet.Tablet;

public class GalaxyTabS2 implements Tablet {

	@Override
	public String info() {
		String msg = String.format("This is %s - %s."
								, "Samsung - Galaxy Tab S2 8.0", "8.0-inches display");
		return msg;
	}
}
