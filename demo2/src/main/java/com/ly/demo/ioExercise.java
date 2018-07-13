package ly;

import java.io.*;

public class ioExercise {
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf =new RandomAccessFile("d://log.txt","rw");
		File f = new File("d:\\test.txt");
		f.createNewFile();
		File[] file = f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		System.out.println(raf.length());
	}

}
