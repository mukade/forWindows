package chapter_8_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	public static void main(String args[]){
		Collection c=new ArrayList();
		c.add("�����");
		c.add(6);
		System.out.println("c����Ԫ�ظ���Ϊ��"+c.size());
		c.remove(6);
		System.out.println("ɾ��6��c����Ԫ�ظ���Ϊ"+c.size());
		System.out.println("c���Ƿ����\"�����\"�ַ�����"+c.contains("�����"));
		c.add("������");
		System.out.println("c���ϼ�����������Ԫ������Щ��"+c);
		Collection books=new HashSet();
		books.add("������");
		books.add("���java");
		System.out.println("c�����Ƿ����books���ϣ�"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("c����ɾ��books���Ԫ���У�"+c);
		c.clear();
		System.out.println("���c�����ڵ�Ԫ�ػ��У�"+c);
		books.retainAll(c);
		System.out.println("books��c���Ͻ�֮���Ԫ���У�"+books);
		
	}
}
