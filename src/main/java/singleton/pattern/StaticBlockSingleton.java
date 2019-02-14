package singleton.pattern;

/**
 * 单例模式-静态代码块实现
 * 静态块单例实现与饿汉式实现相同，实例是在类加载时创建的。
 */
public class StaticBlockSingleton {
	/**
	 * 实例
	 */
	private static StaticBlockSingleton instance;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("");
		}
	}

	private StaticBlockSingleton() {
		message = "StaticBlockSingleton";
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
