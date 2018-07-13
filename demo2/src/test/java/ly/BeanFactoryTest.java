package ly;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.*;
public class BeanFactoryTest {
 @Test
 public void getBean() throws Throwable{
	 ResourcePatternResolver resolver =new PathMatchingResourcePatternResolver();
	 Resource res = resolver.getResource("classpath:ly/beans.xml");
	 System.out.println(res.getURL());
	 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	 XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	 reader.loadBeanDefinitions(res);
	 //值得一提的是，在初始化BeanFactory时，必须为其提供一种日志框架，我们使用Log4J，即在类路径下提供Log4J的配置文件，这样启动spring容器才不会报错
	 System.out.println("init BeanFactory .");
	 //此处的person对应于beans.xml中配置的bean的id
	 Person p = factory.getBean("person1",Person.class);
	 System.out.println("person bean is ready for use!");
	 p.sayHi();
	 
 }
}
