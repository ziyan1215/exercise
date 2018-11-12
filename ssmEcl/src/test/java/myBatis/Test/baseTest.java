package myBatis.Test;

import ly.entity.User;
import ly.service.UserService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class baseTest {
	
	private final static Logger logger = Logger.getLogger(baseTest.class);
	
	
	@Test
	public void test(){
		logger.debug("------获取配置文件------");
		
		ApplicationContext ac =new ClassPathXmlApplicationContext(new String []{"spring.xml","spring-mybatis.xml"});
		
		UserService userService =(UserService)ac.getBean("userService");
		
		logger.debug("测试");
		User user=userService.getUserByID(2);
		System.out.println(user.getUserName());
	}
}
