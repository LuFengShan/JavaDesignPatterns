package singleton.pattern;

/**
 * 当有太多线程试图获取实例时，饿汉模式，静态代码模式，懒汉模式，线程安全模式都会在Java内存模型存在很多问题，所以推荐以下方式实现
 */
public class BillPughSingleton {
	private BillPughSingleton(){}

	/**
	 * 重新定义一个类来实现
	 */
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
}
