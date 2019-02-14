package singleton.pattern;

/**
 * 单例模式-饿汉模式
 * Eager Singleton模式很简单，Singleton Instance将在类加载时创建。
 * 缺点是实例已创建，但应用程序可能不会在创建时间后立即使用它。
 */
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 构造方法私有
	 */
	private EagerSingleton() {
		message = "EagerSingleton";
	}

	public static EagerSingleton getInstance(){
		return instance;
	}

}
