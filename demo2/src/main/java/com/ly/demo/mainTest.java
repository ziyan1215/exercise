package com.ly.demo;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String className ="com.ly.demo.Person";
		//Class clazz = Class.forName(className);
		//System.out.println(clazz.getClass());
		Object obj=new Person();
		Class c=obj.getClass();
		System.out.println(c);
	}

}
