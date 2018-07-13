package ly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class IOUtilTest {
	
	
	@Test
	public void f2(){
		// 了解构造函数的情况  查帮助
				File file = new File("d:\\test2.txt");
				//System.out.println(file.exists());
				if(!file.exists())
					file.mkdir(); //file.mkdirs()
				else
					file.delete();
				//是否是一个目录  如果是目录返回true,如果不是目录or目录不存在返回的是false
				System.out.println(file.isDirectory());
				//是否是一个文件
				System.out.println(file.isFile());
				
				//File file2 = new File("e:\\javaio\\日记1.txt");
				File file2 = new File("d:","日记1.txt");
				if(!file2.exists())
					try {
						file2.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				else 
					file2.delete();
		         //常用的File对象的API
				System.out.println(file);//file.toString()的内容
				System.out.println(file.getAbsolutePath());
				System.out.println(file.getName());
				System.out.println(file2.getName());
				System.out.println(file.getParent());
				System.out.println(file2.getParent());
				System.out.println(file.getParentFile().getAbsolutePath());
	}
	
	
	@Test
	public void f1() throws IOException{
	
		try {
			FileInputStream in =new FileInputStream("d:\\test.txt");
			FileOutputStream out =new FileOutputStream("d:\\log.txt");
			/*byte[] buf =new byte[8*1024];//8个字节大小的数组
			int b;
			int i;
			//in.read(buf, 0, buf.length)把东西读到buf数组里面
			if((b=in.read(buf, 0, buf.length))!=-1){
				out.write(buf,0,b);
				out.flush();
			}*/
			int b;
			
			while((b=in.read())!=-1){
				out.write(b);	
				out.flush();
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}	

}
