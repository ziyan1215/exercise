package com.ly.demo;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
* @author 作者
* @version 创建时间：2019年1月2日 上午9:47:25
* 类说明
*/
public class HttpClientUtilTest {
	//private static Logger logger = Logger.getLogger(HttpClientUtilTest.class); 
	@Test
	public void test() {
		 String url = "http://rest.shanbay.com/api/v2/quote/quotes/today/?_=1546075870467"; 
		 File file2 = new File("f:\\","shanbayToday.json");
			if(!file2.exists())
				try {
					file2.createNewFile();		
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else 
				file2.delete();
	        try {  
	            String str = HttpClientUtil.doGet(url, "UTF-8");  
	            if (str != null) {  
	               // logger.info("http Get request result:" + str);  
	                //讲结果保存成文件
	                PrintStream ps = new PrintStream(new FileOutputStream(file2));
					 ps.println(str);// 往文件里写入字符串
	            } else {  
	               // logger.info("http Get request process fail");  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	}

}
