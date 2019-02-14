package observer.pattern;

/**
 * interface observer（观察者接口）：
 */
public interface Observer {
	/**
	 * 观察都根据主题的更新，来更新自己安排
	 * @param schedule 时间表
	 */
	void update(String schedule);
}
