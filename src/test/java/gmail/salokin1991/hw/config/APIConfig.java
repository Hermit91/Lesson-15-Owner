package gmail.salokin1991.hw.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/E:/Курсы/QA/ДЗ/15/token.properties",
        "classpath:token.properties"
})
public interface APIConfig extends Config {

    @Key("base.url")
    @DefaultValue("https://github.com")
    String baseUrl();

    @Key("token")
    String token();
}
