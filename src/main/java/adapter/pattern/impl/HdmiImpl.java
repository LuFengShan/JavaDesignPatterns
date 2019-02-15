package adapter.pattern.impl;

public class HdmiImpl implements HDMI {
	@Override
	public void message() {
		System.out.println("传输HDMI数据");
	}
}
