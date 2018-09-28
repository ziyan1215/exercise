package ly.mapping;

//import java.util.List;
import ly.model.User;
import ly.service.UserService;
//import org.apache.log4j.Logger;
import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import com.alibaba.fastjson.JSON;

public class TestMybatis {
	@Test
	public void test(){
		//获取spring上下文
		System.out.println("1111111111获取spring上下文111111111");
		ApplicationContext ac =new ClassPathXmlApplicationContext(new String []{"spring.xml","spring-mybatis.xml"});
		//System.out.println("1111111111111111111");
		UserService userService =(UserService)ac.getBean("userService");
		//System.out.println("1111111111111111111");
		//System.out.println(userService);
		//Integer id =1; 
		User user=userService.getUserByID(2);
		System.out.println(user.getUserName());
	}
	
}
/*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Test
	public void test1() {
		User u = userService.getUserByID(1);
		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
	}

	
}
*/