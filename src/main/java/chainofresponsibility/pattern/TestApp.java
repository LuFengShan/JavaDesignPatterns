package chainofresponsibility.pattern;

import org.junit.jupiter.api.Test;

public class TestApp {
	@Test
	public void test() {
		// 初级
		AbstractConsultant primary = new Primary();
		// 中级
		AbstractConsultant intermediate = new Intermediate();
		// 高级
		AbstractConsultant advanced = new Advanced();
		// 总监
		AbstractConsultant director = new Director();
		// 1. 如果初级不能处理，则给中级
		primary.setNextConsultant(intermediate);
		// 2. 如果中级不能处理，则给高级
		intermediate.setNextConsultant(advanced);
		// 3. 如果高级不能处理，则给总监
		advanced.setNextConsultant(director);

		System.out.println("--- 问题等级 = NORMAL（2） ---");
		ProblemLevel difficultLevel = ProblemLevel.NORMAL;
		// 默认给出的建议让谁处理一下
		primary.giveAdvice(difficultLevel.value());

		System.out.println("--- 问题等级 = DIFFICULT（4） ---");
		difficultLevel = ProblemLevel.DIFFICULT;
		primary.giveAdvice(difficultLevel.value());

		System.out.println("--- 问题等级 = DIFFICULT（6） ---");
		difficultLevel = ProblemLevel.VERYHARD;
		primary.giveAdvice(difficultLevel.value());

		System.out.println("--- 问题等级 = INSANE（7） ---");
		difficultLevel = ProblemLevel.INSANE;
		primary.giveAdvice(difficultLevel.value());

	}
}
