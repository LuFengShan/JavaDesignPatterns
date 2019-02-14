package observer.pattern;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 * 组员
 */
public class GroupMember implements Observer {
	private Logger log = LoggerFactory.getLogger(Observer.class);
	/**
	 * 时间表
	 */
	private String schedule;
	/**
	 * 组员ID
	 */
	private int groupMemberId;

	/**
	 * 观察者ID,默认为0
	 */
	public static int observerId = 0;
	/**
	 * 主题
	 */
	private Subject pmPage;

	/**
	 * 构造函数:当组员注册时，就把自己增加到观察都列表中
	 * @param pmPage 主题（开发经理）
	 */
	public GroupMember(Subject pmPage) {
		this.pmPage = pmPage;
		this.groupMemberId = ++observerId;
		pmPage.addObserver(this);
	}

	/**
	 * 组员调整自己的时间表
	 * @param schedule 时间表
	 */
	@Override
	public void update(String schedule) {
		this.schedule = schedule;
		// 组员调整自己的计划时间
		setOwnSchedule();
	}

	/**
	 * 组员调整自己的计划时间
	 */
	private void setOwnSchedule() {
		log.info(() -> "组员编号 ： " + this.groupMemberId + " 设置时间安排: " + this.schedule);
	}

	/**
	 * 组员不是这个PM的下属员工的时候，可以取消这个订阅
	 */
	public void unsubscribe() {
		this.pmPage.removeObserver(this);
	}
}
