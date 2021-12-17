package gmail.salokin1991;

import gmail.salokin1991.config.IPhoneConfig;
import gmail.salokin1991.config.MobileConfig;
import gmail.salokin1991.config.PixelConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTest {

    @Test
    public void testPixel() {
        System.setProperty("device", "Pixel");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("17.0");
    }

    @Test
    public void testIPhone() {
        System.setProperty("device", "IPhone");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone turbo");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
    }
}
