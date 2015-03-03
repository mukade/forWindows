package chapter_8_8;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
	public static void main(String args[]){
		ArrayList nums=new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);//输出集合
		//反转集合再输出
		Collections.reverse(nums);
		System.out.println(nums);
		//将集合按自然顺序排序并输出
		Collections.sort(nums);
		System.out.println(nums);
		//将集合随机洗牌并输出
		Collections.shuffle(nums);
		System.out.println(nums);
		//第二次洗牌
		Collections.shuffle(nums);
		System.out.println(nums);
	}
}
