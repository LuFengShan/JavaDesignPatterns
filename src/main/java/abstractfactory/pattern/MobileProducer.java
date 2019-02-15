package abstractfactory.pattern;

import abstractfactory.pattern.factories.AppleFactory;
import abstractfactory.pattern.factories.SamsungFactory;

public class MobileProducer {
	public static MobileFactory getMobileFactory(FactoryType type){
		MobileFactory factory = null;
		switch(type){
			case AppleFactory: 
				factory = new AppleFactory();
				break;
			case SamsungFactory:
				factory = new SamsungFactory();
				break;
			default:
				break;
		}
		return factory;
	}
}
