package chainofresponsibility.pattern;

/**
 * 高级
 */
public class Advanced extends AbstractConsultant{
	/**
	 * 默认高级只能处理问题级别为6
	 */
	public Advanced() {
		this.level = 6;
	}

	@Override
	protected void advise(int level) {
		System.out.println("高级开发人员可以解决问题的级别" + level);
	}
}
