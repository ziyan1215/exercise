package com.ly.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {
	/**
	 * 读取指定文件内容，按照16进制输出到控制台
	 * 并且每输出10个byte换行
	 * @param fileName
	 * 单字节读取不适合大文件，大文件效率很低
	 */
	public static void printHex(String fileName)throws IOException{
		//把文件作为字节流进行读操作
		FileInputStream in = new FileInputStream(fileName);
		int b ;
		int i = 1;
		while((b = in.read())!=-1){
			if(b <= 0xf){
				//单位数前面补0
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b)+"  ");
			if(i++%10==0){
				System.out.println();
			}
		}
		in.close();
	}
	/**
	 * ������ȡ���Դ��ļ�����Ч�ʸߣ�Ҳ��������õĶ��ļ��ķ�ʽ
	 * @param fileName
	 * @throws IOException
	 */
	public static void printHexByByteArray(String fileName)throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[8 * 1024];
		/*��in��������ȡ�ֽڣ����뵽buf����ֽ������У�
		 * �ӵ�0��λ�ÿ�ʼ�ţ�����buf.length�� 
		 * ���ص��Ƕ������ֽڵĸ���
		*/
		/*int bytes = in.read(buf,0,buf.length);//һ���Զ��꣬˵���ֽ������㹻��
		int j = 1; 
		for(int i = 0; i < bytes;i++){
			System.out.print(Integer.toHexString(buf[i] & 0xff)+"  ");
			if(j++%10==0){
				System.out.println();
			}
		}*/
	  int bytes = 0;
	  int j = 1;
	  while((bytes = in.read(buf,0,buf.length))!=-1){
		  for(int i = 0 ; i < bytes;i++){
			  System.out.print(Integer.toHexString(buf[i] & 0xff)+"  ");
			  if(j++%10==0){
				  System.out.println();
			  }
		  }
	  }
	  in.close();
	}
	/**
	 * 文件拷贝，字节批量读取;file copy and read byte by byte  
	 * @param srcFile 文件名1
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFile(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�:"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8*1024];
		int b ;
	    while((b = in.read(buf,0,buf.length))!=-1){
	    	out.write(buf,0,b);
	    	out.flush();//��ü���
	    }
	    in.close();
	    out.close();
		
	}
	/**
	 * �����ļ��Ŀ��������ô�������ֽ���
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFileByBuffer(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�:"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		}
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destFile));
		int c ;
		while((c = bis.read())!=-1){
			bos.write(c);
			bos.flush();//ˢ�»�����
		}
		bis.close();
		bos.close();
	}
	/**
	 * ���ֽڣ�������������ļ�����
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFileByByte(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�:"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		int c ;
		while((c = in.read())!=-1){
			out.write(c);
			out.flush();
		}
		in.close();
		out.close();
	}
	
}
