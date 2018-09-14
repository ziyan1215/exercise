######迭代器（Iterator）
>　　迭代器是一种设计模式，它是一个对象，它可以遍历并选择序列中的对象，而开发人员不需要了解该序列>的底层结构。迭代器通常被称为“轻量级”对象，因为创建它的代价小。
>　　Java中的Iterator功能比较简单，并且只能单向移动：
>　　(1) 使用方法iterator()要求容器返回一个Iterator。第一次调用Iterator的next()方法时，它返回>序列的第一个元素。注意：iterator()方法是java.lang.Iterable接口,被Collection继承。
>　　(2) 使用next()获得序列中的下一个元素。
>　　(3) 使用hasNext()检查序列中是否还有元素。
>　　(4) 使用remove()将迭代器新返回的元素删除。
>　　Iterator是Java迭代器最简单的实现，为List设计的ListIterator具有更多的功能，它可以从两个方>向遍历List，也可以从List中插入和删除元素
```java
public interface Iterator {  
　　boolean hasNext();  
　　Object next();  
　　void remove();  
}  
//使用：　Object next()：返回迭代器刚越过的元素的引用，返回值是Object，需要强制转换成自己需要的类型
//　　　　boolean hasNext()：判断容器内是否还有可供访问的元素
//　　　　void remove()：删除迭代器刚越过的元素
//迭代使用方法：（迭代其实可以简单地理解为遍历，是一个标准化遍历各类容器里面的所有对象的方法类
for(Iterator it = c.iterator(); it.hasNext(); ) {  
　　Object o = it.next();  
　　 //do something  
}  
```