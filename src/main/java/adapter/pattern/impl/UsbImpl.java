package adapter.pattern.impl;

public class UsbImpl implements USB {
	@Override
	public void message() {
		System.out.println("传输USB数据");
	}
}
