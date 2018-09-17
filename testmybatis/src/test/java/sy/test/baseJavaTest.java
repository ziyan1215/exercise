package sy.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class baseJavaTest {
	@Test
	public void f() throws IOException{
		
		Collection c =new ArrayList();
		File f =new File("1.txt");
		System.out.println(f.getAbsolutePath());
		f.createNewFile();	
	}
	
	@Test
	public void openFile() throws IOException{
		 final Runtime runtime = Runtime.getRuntime();  
		    Process process = null;
		    final String cmd = "rundll32 url.dll FileProtocolHandler file://C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe";//要打开的文件路径。
		    try {  
		        process = runtime.exec(cmd);  
		    } catch (final Exception e) {  
		        System.out.println("Error exec!");  
		    } 
			}
	
	@Test
	public void intNum(){
				int num=0;
				while(num<8){
				num+=1;
				if(num==3){
				continue;}
				num=num+1;
				}
				System.out.println(num);

			}

	}
	
	
