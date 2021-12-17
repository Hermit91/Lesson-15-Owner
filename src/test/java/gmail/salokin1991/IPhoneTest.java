package gmail.salokin1991;

import gmail.salokin1991.config.IPhoneConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IPhoneTest {

    @Test
    public void testConfig() {
        IPhoneConfig config = ConfigFactory.create(IPhoneConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone turbo");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
    }
}
