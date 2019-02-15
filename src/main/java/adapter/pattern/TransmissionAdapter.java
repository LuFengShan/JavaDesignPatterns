package adapter.pattern;

import adapter.pattern.impl.HdmiImpl;
import adapter.pattern.impl.TypeCImpl;
import adapter.pattern.impl.UsbImpl;
import adapter.pattern.impl.VgaImpl;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 * 传输适配器类
 */
public class TransmissionAdapter implements TransmissionIntrface {
	private Logger log = LoggerFactory.getLogger(TransmissionAdapter.class);
	@Override
	public void hdmi() {
		new HdmiImpl().message();
	}

	@Override
	public void typeC() {
		new TypeCImpl().message();
	}

	@Override
	public void vga() {
		new VgaImpl().message();
	}

	@Override
	public void usb() {
		new UsbImpl().message();
	}
}
