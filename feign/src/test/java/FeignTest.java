import com.github.jing.feign.FeignConnector;
import com.github.jing.feign.FeignConnectorFactory;
import org.junit.Test;

/**
 * Created by chenjing28 on 18/3/3.
 */
public class FeignTest {

    private FeignConnectorFactory feignConnectorFactory = new FeignConnectorFactory();

    @Test
    public void testFeign() {
        FeignConnector feignConnector = feignConnectorFactory.getInstance();
        System.out.println(feignConnector.hello("jack"));
    }
}
