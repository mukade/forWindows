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
		System.out.println(nums);//�������
		System.out.println(Collections.max(nums));//������Ԫ��
		System.out.println(Collections.min(nums));//�����СԪ��
		Collections.replaceAll(nums, 0, 1);//�����������е�0����1
		System.out.println(nums);//�������
		System.out.println(Collections.frequency(nums, -5));//���������-5���ֵ�Ƶ��
		System.out.println(Collections.binarySearch(nums,3 ));//������ַ������3��λ��
		Collections.sort(nums);//�Լ��Ͻ�������
		System.out.println(nums);//�������
		System.out.println(Collections.binarySearch(nums, 3));;
		
		
	}

}
