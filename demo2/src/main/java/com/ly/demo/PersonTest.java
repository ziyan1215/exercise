package com.ly.demo;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

public class PersonTest {



	@Test
	public void f() throws ReflectiveOperationException {
		String className ="com.ly.demo.Person";
		Class clazz = Class.forName(className);
		System.out.println(clazz.getClass()); //class java.lang.Class
		//获取构造函数
		Constructor constructor = clazz.getConstructor(String.class);
		//想要对对象进行初始化，使用构造器的方法newInstance();
		Object obj = constructor.newInstance("testPeople");
		System.out.println(obj.toString());;
		((Person) obj).sayHi();
		//获取类中所有的方法
		Method[] methods = clazz.getMethods();//获取的是该类中的公有方法和父类中的公有方法。
		methods = clazz.getDeclaredMethods();//获取本类中的方法，包含私有方法。
		for(Method method : methods) {
			System.out.println(method);
	/*		public java.lang.String com.ly.demo.Person.getName()
			public void com.ly.demo.Person.setName(java.lang.String)
			public void com.ly.demo.Person.sayHi()
			public java.lang.String com.ly.demo.Person.getSex()
			public void com.ly.demo.Person.setSex(java.lang.String)
			public java.lang.Number com.ly.demo.Person.getAge()
			public void com.ly.demo.Person.setAge(int)*/

		}
		
		System.out.println("开始调用单个方法");
		Method oneMethods = clazz.getMethod("sayHi",null);
		Object obj2 =clazz.newInstance();
		oneMethods.invoke(obj2, null);//执行一个方法
		
		System.out.println("end");

	}
	
	@Test
	public void f1() throws ReflectiveOperationException {

		//根据对象获取类型    获取class的类型
		Object obj=new Person();
		Class c=obj.getClass();
		System.out.println(c);//class com.ly.demo.Person
	}
	
	@Test
	public void f2() throws ReflectiveOperationException {
		//直接获取指定的类型
		Class clazz = Person.class;
		System.out.println(clazz.getClass()); //class java.lang.Class
	
	}
	
	@Test
	public void f3() throws ReflectiveOperationException {
		Person p =new Person("xx");//通过构造函数实例化对象
		p.sayHi();
		

	}
	
}
