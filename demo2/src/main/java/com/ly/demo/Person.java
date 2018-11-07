package com.ly.demo;


/** 
*类描述：People实体类
*
*@author 作者名
*@version 版本号
*/

public class Person {
	private String name;
	private String sex;
	private int age;
	
	/**
	*方法描述
	*@param 空
	*@return 空
	*/
	public Person(){};
	/**
	*方法描述2：构造函数
	*@param String 姓名
	*@return 返回值描述
	*/
	public  Person(String name){
		this.name=name;
		System.out.println("person instructor");
	};
	public void sayHi(){
		System.out.println("hello, my name is :"+name+" and i am "+age+" years old !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Number getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
