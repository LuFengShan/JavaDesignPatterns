package chainofresponsibility.pattern;

/**
 * 初级
 */
public class Primary extends AbstractConsultant{
	/**
	 * 默认初级只能处理问题级别为2
	 */
	public Primary() {
		this.level = 2;
	}

	@Override
	protected void advise(int level) {
		System.out.println("初级开发人员可以解决问题的级别" + level);
	}
}
