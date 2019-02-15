package abstractfactory.pattern;


import abstractfactory.pattern.product.smartphone.SmartPhone;
import abstractfactory.pattern.product.smartphone.SmartPhoneType;
import abstractfactory.pattern.product.tablet.Tablet;
import abstractfactory.pattern.product.tablet.TabletType;

public interface MobileFactory {
	SmartPhone createSmartPhone(SmartPhoneType type);
	Tablet createTablet(TabletType type);
}
