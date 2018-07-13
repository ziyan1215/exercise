package ly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//表示是一个配置信息提供类
@Configuration
public class Beans {
	//定义一个bean
	@Bean(name="person")
	public Person buildPerson(){

		Person person =new Person();
		person.setName("xiaoLei");
		person.setSex("boy");
		person.setAge(30);
		return person;
	}
}
