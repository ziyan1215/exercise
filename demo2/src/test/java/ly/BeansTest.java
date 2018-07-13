package ly;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ly.Person;
public class BeansTest {

	@Test
	public void getBean(){
		//通过一个带@Configuration的POJO转载Bean配置
		
		//ApplicationContext ctx = new AnnotationConfigApplicationContext ("Beans.class");
		//这样书写时出现了错误，("Beans.class")括号里面不能加双引号
		
		//AnnotationConfigApplicationContext将加载Beans.class中的Bean定义并调用Beans.class中的方法实例化Bean
		//启动容器并装配Bean
		ApplicationContext ctx = new AnnotationConfigApplicationContext (Beans.class);
		System.out.println("----------------------");
		Person p =ctx.getBean("person",Person.class);
		assertNotNull(p);
		p.sayHi();
	}
}
