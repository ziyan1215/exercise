package com.ly.collection;

/**
 * 类：
 *
 * @author
 * @version
 */
public class demo1 {
	/**
	 * 方法描述
	 *测试类
	 * @param 空
	 * @return 空
	 */
	public void f1(){
		StringBuilder sb = new StringBuilder("abcdefg");
		sb.append("ak");  //abcdefgak
		sb.insert(1,"et");//aetbcdefg
		sb.deleteCharAt(2);//abdefg
		sb.delete(2,4);//abefg
		sb.setLength(4);//abcd
		sb.setCharAt(0,'k');//kbcdefg
		sb.replace(0,2,"hhhh");//hhhhcdefg
		
		//想要使用缓冲区，先要建立对象。
		StringBuffer sb1 = new StringBuffer();		
		sb1.append(12).append("haha");//方法调用链。
		String s = "abc"+4+'q';
		s = new StringBuffer().append("abc").append(4).append('q').toString();
	}
}
