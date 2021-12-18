package gmail.salokin1991.hw.tests;

import gmail.salokin1991.hw.config.APIConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class APITest {

    @Test
    public void apiTest() {
        APIConfig apiConfig = ConfigFactory.create(APIConfig.class, System.getProperties());
        assertThat(apiConfig.baseUrl()).isEqualTo("https://github.com");
        assertThat(apiConfig.token()).isEqualTo("some_token");
    }

    @Test
    public void apiWithTempFileTest() throws IOException {
        String content = "token=some_token";
        Path props = Paths.get("C:/Windows/Temp/token.properties");

        Files.write(props, content.getBytes(StandardCharsets.UTF_8));

        APIConfig apiConfig = ConfigFactory.create(APIConfig.class, System.getProperties());
        assertThat(apiConfig.baseUrl()).isEqualTo("https://github.com");
        assertThat(apiConfig.token()).isEqualTo("some_token");

        Files.delete(props);
    }
}
