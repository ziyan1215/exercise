package com.ly.collection;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
* @author 作者
* @version 创建时间：2019年1月21日 下午3:46:45
* 类说明
*/
public class ListSample {
	/*
	 * 使用一个体系时，原则：参阅顶层内容。建立底层对象
	List本身是Collection接口的子接口，具备了Collection的所有方法。
	现在学习List体系特有的共性方法，查阅方法发现List的特有方法都有索引，这是该集合最大的特点*/
	@Test
	public void test() {
		//List<String> list=new ArrayList<String>();
		List l =new ArrayList();
		System.out.println(l.size());
		l.add("nihao");
		System.out.println(l.size());
		System.out.println(l.get(0));
		
		
	}
	
	
	
	
	
	
}
