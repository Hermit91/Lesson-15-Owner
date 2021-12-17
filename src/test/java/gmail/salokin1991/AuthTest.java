package gmail.salokin1991;

import gmail.salokin1991.config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthTest {

    @Test
    public void testLocalConfig() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("dsalokin");
        assertThat(config.password()).isEqualTo("12345");
    }

    @Test
    public void testRemoteConfig() throws IOException {
        String content = "username=bbritva\npassword=51234";
        Path props = Paths.get("E:/Курсы/QA/ДЗ/15/auth.properties");

        Files.write(props, content.getBytes(StandardCharsets.UTF_8));

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("bbritva");
        assertThat(config.password()).isEqualTo("51234");

        Files.delete(props);
    }
}
