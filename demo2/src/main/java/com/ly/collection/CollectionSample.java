package com.ly.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Test;

public class CollectionSample {
	
	@Test
	public void linkedListFunction(){
		
		//Collection arrayList = new ArrayList();
		//Collection<LinkedList> linkedList = new LinkedList();
		LinkedList queue = new LinkedList();
	    queue.addFirst("Bernadine");
	    queue.addFirst("Elizabeth");
	    queue.addFirst("Gene");
	    queue.addFirst("Elizabeth");
	    queue.addFirst("Clara");
	    System.out.println(queue);
	    queue.removeLast();
	    queue.removeLast();
	    System.out.println(queue);	
	}
	
	@Test
	public void mapFunction(){
		Map m =new HashMap();
		m.put(1, "a");
		System.out.println(m.get(1));
		
	}


}
