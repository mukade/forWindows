package chapter_5_7;

import java.util.Scanner;

class BaseClass{
	public int book=6;
	public void base(){
		System.out.println("������ͨ����");
	}
	public void test(){
		System.out.println("���౻���Ƿ���");
	}
}
public class SubClass extends BaseClass{
	public String book="������java";
	public void test(){
		System.out.println("���า�Ƿ���");
	}
	public void sub(){
		System.out.println("������ͨ����");
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
