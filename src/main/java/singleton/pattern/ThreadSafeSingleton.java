package singleton.pattern;

/**
 * 多线程使用的单例模式，推荐使用双重检查模式的实现{@link #getInstanceDoubleLocking()}，主要是性能好
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
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
	private ThreadSafeSingleton() {
		message = "ThreadSafeSingleton";
	}

	/**
	 * 线程安全的单例模式，只是比懒汉模式加了<b>synchronized</b>同步锁关键字，
	 * 但是这个方法始终检查同步锁定，会降低性能，所以不推荐这种写法。
	 * 推荐使用双重检查{@link #getInstanceDoubleLocking()}
	 *
	 * @return
	 */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	/**
	 * 双重检查来实现单例模式，主要是性能高
	 *
	 * @return
	 */
	public static ThreadSafeSingleton getInstanceDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
