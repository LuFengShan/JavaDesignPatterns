package abstractfactory.pattern.factories;

import abstractfactory.pattern.MobileFactory;
import abstractfactory.pattern.product.smartphone.SmartPhone;
import abstractfactory.pattern.product.smartphone.SmartPhoneType;
import abstractfactory.pattern.product.smartphone.impl.GalaxyJ7;
import abstractfactory.pattern.product.smartphone.impl.GalaxyOn7;
import abstractfactory.pattern.product.tablet.Tablet;
import abstractfactory.pattern.product.tablet.TabletType;
import abstractfactory.pattern.product.tablet.impl.GalaxyTabA;
import abstractfactory.pattern.product.tablet.impl.GalaxyTabS2;

public class SamsungFactory implements MobileFactory {

	@Override
	public SmartPhone createSmartPhone(SmartPhoneType type) {
		SmartPhone phone = null;
		switch(type){
			case GalaxyJ7: 
				phone = new GalaxyJ7();
				break;
			case GalaxyOn7:
				phone = new GalaxyOn7();
				break;
			default:
				break;
		}
		return phone;
	}

	@Override
	public Tablet createTablet(TabletType type) {
		Tablet tablet = null;
		switch(type){
			case GalaxyTabA:
				tablet = new GalaxyTabA();
				break;
			case GalaxyTabS2:
				tablet = new GalaxyTabS2();
				break;
			default:
				break;
		}
		return tablet;
	}

}
