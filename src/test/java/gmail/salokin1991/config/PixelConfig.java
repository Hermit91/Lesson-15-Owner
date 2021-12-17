package gmail.salokin1991.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:Pixel.properties")
public interface PixelConfig extends Config {

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();
}
