package chapter_8_3;

import java.util.TreeSet;

class Err{
	
}


public class TreeSetErrorTest {
	public static void main(String args[]){
		TreeSet ts =new TreeSet();
		ts.add(new Err());
		ts.add(new Err());
	}
}
