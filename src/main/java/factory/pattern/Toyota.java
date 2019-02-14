package factory.pattern;

import java.util.Random;

/**
 * 丰田
 */
public class Toyota implements Car{
	int id;

	public Toyota() {
		Random randomno = new Random();
		id = randomno.nextInt();
	}

	@Override
	public String info() {
		return String.format("我是一辆新的 %s. 我的编号是 = %d", "丰田", id);
	}
}
