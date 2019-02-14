package observer.pattern;

/**
 * interface Subject（主题接口）
 */
public interface Subject {
	/**
	 * 增加观察者
	 * @param o 观察者
	 */
	void addObserver(Observer o);

	/**
	 * 移除观察者
	 * @param o 观察者
	 */
	void removeObserver(Observer o);

	/**
	 * 通知观察者:主要是主题（Subject）更新了，把这个更新状态分发给订阅主题的观察者（Observer）
	 */
	void notifyObserver();
}
