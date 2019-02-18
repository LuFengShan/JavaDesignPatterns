package chainofresponsibility.pattern;

/**
 * 总监
 */
public class Director extends AbstractConsultant{
	/**
	 * 默认初级只能处理问题级别为7
	 */
	public Director() {
		this.level = 7;
	}

	@Override
	protected void advise(int level) {
		System.out.println("总监可以解决问题的级别" + level);
	}
}
