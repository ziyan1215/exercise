package ly;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import com.ly.demo.Person;

public class GroovyApplicationContextTest {
	@Test
	public void getBean(){
		//
		ApplicationContext ctx = new GenericGroovyApplicationContext("classpath:ly/groovy-bean.groovy");
		Person person = (Person) ctx.getBean("person4");
		assertNotNull(person);
		assertEquals(person.getAge(),22);
	}
}
