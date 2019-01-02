package xz.io;

import java.io.FileReader;
import java.io.IOException;

public class IoUnit {
	
	


	public static void main(String[] args) throws IOException {
		/*创建可以读取文本文件的流对象，FileReader 让创建好的流对象和指定的文件相关联。
		*/
		FileReader fr = new FileReader("demo.txt");
		int ch = 0;
		while((ch = fr.read())!= -1) { //条件是没有读到结尾
		System.out.println((char)ch); //调用读取流的 read 方法，读取一个字符。
		}
		fr.close();
		
	}

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		1：创建一个字符输出流对象，用于操作文件。该对象一建立，就必须明确数据存储位置，是一个文件。
		2：对象产生后，会在堆内存中有一个实体，同时也调用了系统底层资源，在指定的位置创建了一个存储数据的文件。
		3：如果指定位置，出现了同名文件，文件会被覆盖。
		
		FileWriter fw = new FileWriter("A2.txt",true); // FileNotFoundException
		
		调用Writer类中的write方法写入字符串。字符串并未直接写入到目的地中，而是写入到了流中，(其实是写入到内存缓冲区中)。怎么把数据弄到文件中？
		
		fw.write("abcdea");
		fw.flush(); // 刷新缓冲区，将缓冲区中的数据刷到目的地文件中。
		fw.close(); // 关闭流，其实关闭的就是java调用的系统底层资源。在关闭前，会先刷新该流。
	
	}
*/
}
