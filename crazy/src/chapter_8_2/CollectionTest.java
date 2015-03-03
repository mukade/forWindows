package chapter_8_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	public static void main(String args[]){
		Collection c=new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println("c集合元素个数为："+c.size());
		c.remove(6);
		System.out.println("删除6后c集合元素个数为"+c.size());
		System.out.println("c集是否包含\"孙悟空\"字符串："+c.contains("孙悟空"));
		c.add("轻量级");
		System.out.println("c集合加入轻量级后元素有哪些："+c);
		Collection books=new HashSet();
		books.add("轻量级");
		books.add("疯狂java");
		System.out.println("c集合是否包含books集合？"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("c集合删除books后的元素有："+c);
		c.clear();
		System.out.println("清除c后现在的元素还有："+c);
		books.retainAll(c);
		System.out.println("books与c集合交之后的元素有："+books);
		
	}
}
