package xz.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;


/**
 * @author Administrator LAST_IPDATE2018年11月30日上午11:21:59
 */
/**
 * @author Administrator
 *LAST_IPDATE2018年11月30日上午11:30:48
 */
public class IoUnitTest {

	@Test
	public void test() {
		String s = "22";// 将字符串出转换成16进制表示
		int i;
		int j;
		for (i = 0; i < s.length(); i++) {
			j = s.charAt(i);
			System.out.println(Integer.toHexString(j));
		}
	}

	/*
	 * IO异常处理
	 */
	@Test
	public void f() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt", true);
			fw.write("abcde");
		} catch (IOException e) {
			System.out.println(e.toString() + "....");
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("close:" + e.toString());
				}
		}
	}

	@Test // 自定义缓冲区来读取数据
	// 1、获取流对象
	// 2、创建缓存数组
	// 3.使用 read(char[])方法，将读取到字符存入数组
	public void f1() throws IOException {
		FileReader fr = new FileReader("demo.txt"); // 创建读取流对象和指定文件关联。
		// 因为要使用 read(char[])方法，将读取到字符存入数组。所以要创建一个字符数组，一般数组的长度都是 1024 的整数倍。

		char[] buf = new char[1024];
		int len = 0;
		while ((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		fr.close();

	}

	/**
	 * used: last update time : 2018年11月30日上午11:27:22 return :void
	 * 
	 * @throws IOException
	 */
	@Test
	public void f2() throws IOException {
		FileWriter fw = new FileWriter("bufdemo.txt");
		BufferedWriter bufw = new BufferedWriter(fw);// 让缓冲区和指定流相关联。
		for (int x = 0; x < 4; x++) {
			bufw.write(x + "abc");
			bufw.newLine(); // 写入一个换行符，这个换行符可以依据平台的不同写入不同的换行符。
			bufw.flush();// 对缓冲区进行刷新，可以让数据到目的地中。
		}
		bufw.close();
	}

	/**
	 * used: BufferedReader last update time : 2018年11月30日上午11:27:13 return :void
	 * 
	 * @throws IOException
	 */
	@Test
	public void f3() throws IOException {
		FileReader fr = new FileReader("bufdemo.txt");
		BufferedReader bufr = new BufferedReader(fr);
		String line = null;
		while ((line = bufr.readLine()) != null) { // readLine 方法返回的时候是不带换行符的。
			System.out.println(line);
		}
		bufr.close();
	}
	
	/**
	 * used: 获取键盘输入并打印出来
	 * last update time : 2018年11月30日上午11:30:59
	 * return :void
	 * @throws IOException
	 */
	@Test
	public void f4() throws IOException{
		//记住，只要一读取键盘录入，就用这句话。
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));//输出到控制台
		String line = null;
		while((line=bufr.readLine())!=null){
		if("over".equals(line))
		break;
		bufw.write(line.toUpperCase());//将输入的字符转成大写字符输出
		bufw.newLine();
		bufw.flush();
		}
		bufw.close();
		bufr.close();
	}



}
