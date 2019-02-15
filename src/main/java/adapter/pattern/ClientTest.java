package adapter.pattern;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 * 测试客户端
 */
public class ClientTest {
	private Logger log = LoggerFactory.getLogger(ClientTest.class);

	@Test
	public void test() {
		TransmissionIntrface ti = new TransmissionAdapter();
		log.info(() -> "调用hdmi");
		ti.hdmi();
		log.info(() -> "调用vga");
		ti.vga();
		log.info(() -> "调用usb");
		ti.usb();
		log.info(() -> "调用typeC");
		ti.typeC();
	}
}
