package gmail.salokin1991;

import gmail.salokin1991.config.PixelConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PixelTest {

    @Test
    public void testConfig() {
        PixelConfig config = ConfigFactory.create(PixelConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("17.0");
    }
}
