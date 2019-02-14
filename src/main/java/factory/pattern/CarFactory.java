package factory.pattern;

public class CarFactory {
	public Car produce(CarType carType) {
		Car car = null;
		switch (carType) {
			case VOLVO:
				car = new Volvo();
				break;
			case TOYOTA:
				car = new Toyota();
				break;
			case BMW:
				car = new BMW();
				break;
			default:
				break;
		}
		return car;
	}
}
