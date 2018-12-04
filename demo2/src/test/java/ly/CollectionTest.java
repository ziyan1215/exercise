package ly;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Test;

import com.ly.demo.Person;

/**
* @author 作者
* @version 创建时间：2018年12月3日 下午1:02:27
* 类说明
*/
public class CollectionTest {
	
	
	
	@Test
	public void f1() {
		//使用一个体系时，原则：参阅顶层内容。建立底层对象。
		Collection c = new ArrayList<>();
		Person p =new Person();
		Person p2 =new Person("p2");
		c.add(p);
		c.add(p2);
		System.out.println(c.size()+"collection:"+c.toString());
	
		Iterator i =c.iterator();
		if(i.hasNext()) {
			System.out.println("迭代器内循环"+i.next());
		}
		
	}
}
