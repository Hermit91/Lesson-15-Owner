package gmail.salokin1991.config;

import org.aeonbits.owner.Config;

public interface TypesConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("integer")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();
}
