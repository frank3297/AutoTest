package other;

import driver.action.MyProperties;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class testproperties {

    @Test
    public void testpro() throws Exception {
        String value = MyProperties.getProperties("url");
        log.info(value);

    }
}
