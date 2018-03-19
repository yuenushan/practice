package ioc.annotation;

import ioc.annotation.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by chenjing28 on 18/3/19.
 */
public class PersonTest {

    @Test
    public void testIoc() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Person.class);
        assertNotNull(applicationContext.getBean("person"));
    }

}
