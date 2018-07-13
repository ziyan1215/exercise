package ly;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectTest {
	public static Person initByDefaultConst() throws Throwable{
		//通过类装载器获取Person对象
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("ly.Person");
		//获取类的默认构造器对象并通过它实例化
		Constructor cons =clazz.getDeclaredConstructor((Class[])null);
		Person person = (Person)cons.newInstance();
		//通过反射方法设置属性
		Method setName = clazz.getMethod("setName", String.class);
		setName.invoke(person,"xiaoming");
		Method setSex= clazz.getMethod("setSex", String.class);
		setSex.invoke(person,"boy");
		Method setAge= clazz.getMethod("setAge", int.class);
		setAge.invoke(person,21);
		return person;
	}
	
	@Test
	public void test() throws Throwable{
		Person person = initByDefaultConst();
		person.sayHi();
	}
	
}
