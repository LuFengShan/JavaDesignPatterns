package singleton.pattern;

import java.util.Objects;

/**
 * 单例模式-懒汉实现：将在客户端调用的第一次创建Singleton实例。
 */
public class LazySingleton {
	private static LazySingleton instance;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private LazySingleton() {
		message = "LazySingleton";
	}

	/**
	 * 创建懒汉单例实现的核心
	 *
	 * @return
	 */
	public static LazySingleton getInstance() {
		if (Objects.equals(null, instance)) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
