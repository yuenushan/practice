package ioc.autowiring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by chenjing28 on 18/3/20.
 */
public class CDPlayerXMLTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("cdplayer.xml");
        assertNotNull(context.getBean("sgtPeppers"));
    }
}
