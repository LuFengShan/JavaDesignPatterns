package factory.pattern;

import java.util.Random;

public class BMW implements Car {
	int id;

	public BMW() {
		Random randomno = new Random();
		id = randomno.nextInt();
	}

	@Override
	public String info() {
		return String.format("我是一辆新的 %s. 我的编号是 = %d", "宝马", id);
	}
}
