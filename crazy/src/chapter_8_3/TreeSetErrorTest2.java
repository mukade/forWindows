package chapter_8_3;
import java.util.Date;
import java.util.TreeSet;
public class TreeSetErrorTest2 {
	public static void main(String args[]){
		TreeSet ts =new TreeSet();
		ts.add(new String("hi"));
		ts.add(new Date());
	}
}
