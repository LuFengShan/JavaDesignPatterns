package abstractfactory.pattern.factories;


import abstractfactory.pattern.MobileFactory;
import abstractfactory.pattern.product.smartphone.SmartPhone;
import abstractfactory.pattern.product.smartphone.SmartPhoneType;
import abstractfactory.pattern.product.smartphone.impl.Iphone6;
import abstractfactory.pattern.product.smartphone.impl.Iphone6Plus;
import abstractfactory.pattern.product.tablet.Tablet;
import abstractfactory.pattern.product.tablet.TabletType;
import abstractfactory.pattern.product.tablet.impl.IPadMini4;
import abstractfactory.pattern.product.tablet.impl.IPadPro;

public class AppleFactory implements MobileFactory {
	@Override
	public SmartPhone createSmartPhone(SmartPhoneType type) {
		SmartPhone phone = null;
		switch(type){
			case Iphone6: 
				phone = new Iphone6();
				break;
			case Iphone6Plus:
				phone = new Iphone6Plus();
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
			case IPadMini4:
				tablet = new IPadMini4();
				break;
			case IPadPro:
				tablet = new IPadPro();
				break;
			default:
				break;
		}
		return tablet;
	}

}
