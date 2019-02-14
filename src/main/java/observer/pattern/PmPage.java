package observer.pattern;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 开发经理实现了主题的接口，这里作为一个被观察者。他需要
 * 1.维护一个组员列表，并具有添加，删除和通知其组员的方法。
 * 2.当PM更新了开发时间表时，所有观察者自动获取通知和更新自己的计划。
 * 3.PM不关心组员列表，并不关心它们如何实现自己的任务（老子只要结果）。
 */
public class PmPage implements Subject {
	private Logger log = LoggerFactory.getLogger(PmPage.class);
	// 1. 维护一个观察者列表
	List<Observer> list;
	// 时间表
	String schedule;

	public PmPage() {
		list = new ArrayList();
	}

	/**
	 * 2.1 增加组员
	 * @param o 观察者
	 */
	@Override
	public void addObserver(Observer o) {
		list.add(o);
	}

	/**
	 * 2.2 删除组员
	 * @param o 观察者
	 */
	@Override
	public void removeObserver(Observer o) {
		list.remove(o);
	}

	/**
	 * 2.3 通知所有的组员（观察者）
	 */
	@Override
	public void notifyObserver() {
		if (Objects.equals(null, list) || Objects.equals(0, list.size())) {
			log.info(() -> "兄弟没有人订阅你，你还是自己干你自己的活吧");
			return;
		}
		// 通知所有的观察者
		for (Observer o : list) {
			// 观察者根据PM发布的时间来安排自己的工作计划
			o.update(schedule);
		}
	}

	/**
	 * 3.1 获取PM的时间安排
 	 */
	public String getSchedule() {
		return schedule;
	}

	/**
	 * 3.2 PM发布时间安排，通知所有的组员（观察者）
	 * @param schedule
	 */
	public void setSchedule(String schedule) {
		// PM发布时间安排
		this.schedule = schedule;
		// 2.3 通知所有的组员（观察者）
		notifyObserver();
	}
}
