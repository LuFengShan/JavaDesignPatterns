package singleton.pattern;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSingleton {
	private Logger log = LoggerFactory.getLogger(TestSingleton.class);
	@Test
	public void testSingleton(){
		Singleton singleton = Singleton.getInstance();
		assertEquals("hello world", "hello world", "可选的断言消息现在是最后一个参数。");
		singleton.setMessage("hello today");
		assertEquals("hello today", singleton.getMessage());
		Singleton singleton1 = Singleton.getInstance();
		log.info(() ->singleton1.getMessage());
		assertEquals(singleton, singleton1, "期望singleton, singleton1是同一个实例");
	}

	/**
	 * 测试枚举的单例模式
	 */
	@Test
	public void testEnumSingleton(){
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		assertEquals(singleton, singleton1, "期望singleton, singleton1是同一个实例");
	}
}
