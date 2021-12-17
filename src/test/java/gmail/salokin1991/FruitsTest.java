package gmail.salokin1991;

import gmail.salokin1991.config.FruitsConfig;
import gmail.salokin1991.config.TypesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    @Test
    public void testList() {
        System.setProperty("list", "orange,apple,banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList())
                .contains("orange", "apple", "banana");
    }

    @Test
    public void testArray() {
        System.setProperty("array", "orange,pineapple,banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray())
                .contains("orange", "pineapple", "banana");
    }

    @Test
    public void testListWithDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithDefault())
                .contains("orange", "apple");
    }

    @Test
    public void testListWithDefaultSeparator() {
        System.setProperty("list-with-default-separator", "orange;apple;banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithSeparator())
                .contains("orange", "apple", "banana");
    }
}
