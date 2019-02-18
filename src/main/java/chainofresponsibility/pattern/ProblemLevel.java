package chainofresponsibility.pattern;

/**
 * 问题等级
 */
public enum ProblemLevel {
	EASY(1), NORMAL(2), COMPLEX(3), DIFFICULT(4), HARD(5), VERYHARD(6), INSANE(7);
	/**
	 * 问题等级
	 */
	private int value;

	/**
	 * 枚举类默认就是私有的构造方法
	 * @param value
	 */
	ProblemLevel(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
}
