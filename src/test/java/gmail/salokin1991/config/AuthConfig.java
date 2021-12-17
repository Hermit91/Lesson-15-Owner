package gmail.salokin1991.config;

import org.aeonbits.owner.Config;

//@Config.LoadPolicy(Config.LoadType.FIRST) первый-папа
//@Config.LoadPolicy(Config.LoadType.MERGE) последний

@Config.Sources({
        "file:/E:/Курсы/QA/ДЗ/15/auth.properties",
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();
}
