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
		System.out.println(nums);//�������
		//��ת���������
		Collections.reverse(nums);
		System.out.println(nums);
		//�����ϰ���Ȼ˳���������
		Collections.sort(nums);
		System.out.println(nums);
		//���������ϴ�Ʋ����
		Collections.shuffle(nums);
		System.out.println(nums);
		//�ڶ���ϴ��
		Collections.shuffle(nums);
		System.out.println(nums);
	}
}
