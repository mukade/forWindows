package chapter_10_2;

import java.util.Date;

public class NullTest {
	public static void main(String args[]){
		Date d=null;
		try{
			System.out.println(d.after(new Date()));
		}catch(NullPointerException ne){
			System.out.println("��ָ���쳣");
		}catch(Exception e){
			System.out.println("δ֪�쳣");
		}
	}
}
