package factory.pattern;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestFactoryPattern {
	@Test
	public void testFactoryProduces() {
		List<Car> list = new ArrayList<>();
		CarFactory carFactory = new CarFactory();
		list.add(carFactory.produce(CarType.BMW));
		list.add(carFactory.produce(CarType.BMW));
		list.add(carFactory.produce(CarType.VOLVO));
		list.add(carFactory.produce(CarType.TOYOTA));
		list.add(carFactory.produce(CarType.TOYOTA));
		list.forEach(p -> System.out.println(p.info()));
	}
}
