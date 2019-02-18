package chainofresponsibility.pattern;

/**
 * 抽象的问题处理人员（专员）
 */
public abstract class AbstractConsultant {
	/**
	 * 等级：可以处理问题的最大级别
	 */
	protected int level;

	/**
	 * 下一个专员：如果当前人员不能处理这个问题，则给下一个高级别的专员来处理
	 */
	protected AbstractConsultant nextConsultant;

	/**
	 * 设置下一个问题处理人员
	 * @param nextConsultant
	 */
	public void setNextConsultant(AbstractConsultant nextConsultant) {
		this.nextConsultant = nextConsultant;
	}

	/**
	 *	给出建议：（如果当前级别专员不能处理这个问题，给就更高一级级别的专员来处理）
	 * @param level 等级
	 */
	public void giveAdvice(int level) {

		if (this.level >= level) {
			advise(level);
		} else {
			nextConsultant.giveAdvice(level);
		}
	}

	/**
	 * 建议
	 * @param level 级别
	 */
	abstract protected void advise(int level);
}
