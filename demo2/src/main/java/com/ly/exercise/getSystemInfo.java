package com.ly.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author 作者
 * @version 创建时间：2019年1月8日 上午10:54:43 类说明
 */
public class getSystemInfo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties systemInfo = System.getProperties();
		systemInfo.list(System.out);// 获取JVM的系统属性

		Properties pps = new Properties();
		pps.load(new FileInputStream("Test.properties"));
		//Interface Enumeration<E> 枚举接口
		Enumeration enum1 = pps.propertyNames();// 得到配置文件的名字
		while (enum1.hasMoreElements()) {
			String strKey = (String) enum1.nextElement();
			String strValue = pps.getProperty(strKey);
			System.out.println(strKey + "=" + strValue);
		}
	}
}
