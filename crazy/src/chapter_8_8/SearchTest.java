package chapter_8_8;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums=new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);//输出集合
		System.out.println(Collections.max(nums));//输出最大元素
		System.out.println(Collections.min(nums));//输出最小元素
		Collections.replaceAll(nums, 0, 1);//将集合中所有的0换成1
		System.out.println(nums);//输出集合
		System.out.println(Collections.frequency(nums, -5));//输出集合中-5出现的频度
		System.out.println(Collections.binarySearch(nums,3 ));//输出二分法查出的3的位置
		Collections.sort(nums);//对集合进行排序
		System.out.println(nums);//输出集合
		System.out.println(Collections.binarySearch(nums, 3));;
		
		
	}

}
