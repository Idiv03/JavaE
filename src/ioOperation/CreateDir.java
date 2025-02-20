package ioOperation;
import java.io.*;
public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "D:\\Telusko\\Dir";
		try {
			File dir1 = new File(dirPath);
			dir1.mkdir();
			System.out.println(dir1.exists());
			System.out.println(dir1.isFile());
			System.out.println(dir1.canRead());
			System.out.println(dir1.isDirectory());
		}catch(Exception e){
			
			System.out.println("Some Erorr");
			
		}

	}

}
