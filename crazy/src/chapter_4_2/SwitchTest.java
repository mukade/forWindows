package chapter_4_2;

public class SwitchTest {
	public static void main(String args[]){
		char score='C';
		switch(score){
			case 'A':{
				System.out.println("youxiu");
				break;
			}
			case 'B':{
				System.out.println("lianghao");
				break;
			}
			case 'C':{
				System.out.println("zhong");
				break;
			}
			case 'D':{
				System.out.println("jige");
				break;
			}
			case 'F':{
				System.out.println("bujige");
				break;
			}
			default: {
				System.out.println("wrong input");
				break;
			}
		}
	}
}
