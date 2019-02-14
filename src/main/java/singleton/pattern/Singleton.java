package singleton.pattern;

/**
 * 简单单例类
 * 1.构造函数为私有的private,这样外部类就不能实例化了
 */
public class Singleton {

	private String message;
	/**
	 *	静态最终的实例化这个类
	 */
	private static final Singleton instance = new Singleton();

	/**
	 * 构造函数私有，确保外部类不能实例化这个类
	 */
	private Singleton() {
		message = "hello world";
	}

	/**
	 * 提供唯一的单例入口
	 * @return
	 */
	public static Singleton getInstance(){
		return instance;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}
