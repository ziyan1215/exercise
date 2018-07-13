package ly;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;
//import org.omg.CORBA_2_3.portable.OutputStream;  
//Type mismatch: cannot convert from java.io.OutputStream to org.omg.CORBA_2_3.portable.OutputStream  导致这句报错---  WritableResource res1 =new PathResource(filePath);
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

public class FileSourceExample {
	@Test
	public void f(){
		try {
			String filePath = "D:/onedrive/Workspace/selenium/demo2/src/main/resources/备注.txt";
			//1、使用系统文件路径方式加载文件
			WritableResource res1 =new PathResource(filePath);
			//2、使用类路径方式加载文件
			Resource res2 = new ClassPathResource("备注.txt");
			//3、使用WritableResource接口写资源文件
			OutputStream stream1 =  res1.getOutputStream();
			stream1.write("欢迎".getBytes());
			stream1.close();
			
			//4、使用resource接口读资源文件
			InputStream ins1= res1.getInputStream();
			InputStream ins2 = res2.getInputStream();
			
			ByteArrayOutputStream baos =new ByteArrayOutputStream();
			int i;
			while ((i=ins1.read())!=-1){
				baos.write(i);
			}
			System.out.println(baos.toString());
			
			System.out.println("res1:"+res1.getFilename());
			System.out.println("res2"+res2.getFilename());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} 

}
