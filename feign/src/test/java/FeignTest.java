import com.github.jing.feign.FeignConnector;
import com.github.jing.feign.FeignConnectorFactory;
import org.junit.Test;

/**
 * Created by chenjing28 on 18/3/3.
 */
public class FeignTest {

    private FeignConnectorFactory feignConnectorFactory = new FeignConnectorFactory();
    FeignConnector feignConnector = feignConnectorFactory.getInstance();

    @Test
    public void testFeign() {
        System.out.println(feignConnector.hello("jack"));
    }

    @Test
    public void testErrorFeign() {
        try {
            System.out.println(feignConnector.hello2("jack"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
