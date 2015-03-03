package chapter_5_7;

import java.util.Scanner;

class BaseClass{
	public int book=6;
	public void base(){
		System.out.println("父类普通方法");
	}
	public void test(){
		System.out.println("父类被覆盖方法");
	}
}
public class SubClass extends BaseClass{
	public String book="轻量级java";
	public void test(){
		System.out.println("子类覆盖方法");
	}
	public void sub(){
		System.out.println("子类普通方法");
	}
	public static void main(String args[]){
		BaseClass bc=new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		SubClass sc=new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		BaseClass duotai=new SubClass();
		System.out.println(duotai.book);
		duotai.base();
		duotai.test();
	}
}
