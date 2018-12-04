package ly;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

/**
* @author 作者
* @version 创建时间：2018年12月3日 上午11:11:32
* 类说明
*/
public class Blank {
	@Test
	public void f(){
		Date time = new Date();
		System.out.println(time);
	}
	
	
	@Test
	public void f1() {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月"
				+ getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + "星期" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	public static String getNum(int num) {
		return num > 9 ? num + "" : "0" + num;
	}

	public static String getWeek(int index) {
		/*
		 * 查表法：建立数据的对应关系. 最好：数据个数是确定的，而且有对应关系。如果对应关系的一方，是数字，而且可以作为角标，那么可以 通过数组来作为表。
		 */
		String[] weeks = { "", "日", "一", "二", "三", "四", "五", "六" };
		return weeks[index];
	}
	
	@Test
	public void f2() {
		
		System.setProperty("myname","毕老师"); //给系统属性信息集添加具体的属性信息
		//临时设置方式：运行 jvm 时，可以通过 jvm 的参数进行系统属性的临时设置，可以在 java 命令的后面加入
		//–D<name>=<value> 用法：java –Dmyname=小明 类名。
		String name = System.getProperty("os.name");//获取指定属性的信息
		//想要知道该系统是否是该软件所支持的系统中的一个。
		//获取系统熟悉值
				Properties prop = System.getProperties();
				System.out.println(prop.get("myname"));
		Set<String> hs = new HashSet<String>();
		hs.add("Windows XP");
		hs.add("Windows 17");
		if(hs.contains(name))
		System.out.println("可以支持");
		else
		System.out.println("不支持");
		
	}
	
	
	
	@Test
	// static double ceil(double a) ; //返回大于指定数值的最小整数
	// static double floor(double a) ; //返回小于指定数值的最大整数
	// static long round(double a) ; //四舍五入成整数
	// static double pow(double a, double b) ; //a 的 b 次幂
	// static double random(); //返回 0~1 的伪随机数
	public void mathTest() {

		Random r = new Random();
		for (int x = 0; x < 10; x++) {
			// double d = Math.floor(Math.random()*10+1);
			// int d = (int)(Math.random()*10+1);
			int d = r.nextInt(10) + 1;
			System.out.println(d);

		}
	}
	
	@Test
	public void IpDemo() throws UnknownHostException {
		//通过名称(ip 字符串 or 主机名)来获取一个 ip 对象。
		InetAddress ip = InetAddress.getByName("www.baidu.com");//java.net.UnknownHostException
		System.out.println("addr:"+ip.getHostAddress());
		System.out.println("name:"+ip.getHostName());
	}
		
		

}
