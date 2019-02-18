package chainofresponsibility.pattern;

/**
 * 中级
 */
public class Intermediate extends AbstractConsultant{
	/**
	 * 默认中级只能处理问题级别为4
	 */
	public Intermediate() {
		this.level = 4;
	}

	@Override
	protected void advise(int level) {
		System.out.println("中级开发人员可以解决问题的级别" + level);
	}
}
