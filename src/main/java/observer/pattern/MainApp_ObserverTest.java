package observer.pattern;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class MainApp_ObserverTest {
	private static Logger log = LoggerFactory.getLogger(MainApp_ObserverTest.class);

	@Test
	public void test01() {
		// 开发经理（相当于一个主题）
		PmPage pmPage = new PmPage();
		// 组员（观察者）
		GroupMember observer1 = new GroupMember(pmPage);
		GroupMember observer2 = new GroupMember(pmPage);
		// 开发经理发布时间安排【2019年12月31日之前完成】
		log.info(() -> "开发经理设置时间表1.******");
		pmPage.setSchedule("2019年12月31日之前完成");
		// 移除一个观察者
		pmPage.removeObserver(observer1);
		// 开发经理发布时间安排【2019年10月31日之前完成】
		log.info(() -> "开发经理设置时间表2.******");
		pmPage.setSchedule("2019年10月31日之前完成");
		// 一个观察者取消了订阅
		observer2.unsubscribe();

		// 开发经理发布时间安排【2019年10月15日之前完成】
		log.info(() -> "开发经理设置时间表3.******");
		pmPage.setSchedule("2019年10月15日之前完成");

	}
}
