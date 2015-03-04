package chapter_10_2;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

public class AccessExceptionMsg {
	public static void main(String args[]){
		try{
			FileInputStream fis=new FileInputStream("a.txt");
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
