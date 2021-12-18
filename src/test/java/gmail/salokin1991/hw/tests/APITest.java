package gmail.salokin1991.hw.tests;

import gmail.salokin1991.hw.config.APIConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class APITest {

    @Test
    public void apiTest() {
        APIConfig apiConfig = ConfigFactory.create(APIConfig.class, System.getProperties());
        assertThat(apiConfig.baseUrl()).isEqualTo("https://github.com");
        assertThat(apiConfig.token()).isEqualTo("some token");
    }
}
