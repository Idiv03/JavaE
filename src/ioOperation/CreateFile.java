package ioOperation;
import java.io.*;

public class CreateFile {

    public static void main(String[] args) {
    	String filePath = "C:\\Users\\divya\\eclipse-workspace\\Telusko\\src\\streamAPI";
        try {
            File file1 = new File(filePath); // Specify the filename
            if (file1.createNewFile()) {
                System.out.println("File created: " + file1.getName());
                file1.delete();
            } else {
                System.out.println("File already exists.");
            }
            String str[] = file1.list();
            long n = file1.length();
            System.out.println("Lenth of file1 is : "+ n);
            for(String s : str) {
            	System.out.println(s);
            }
            System.out.println(file1.canExecute());
            System.out.println(file1.isAbsolute());
            System.out.println(file1.getParent());
            
            
            
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
