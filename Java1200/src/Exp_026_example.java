import java.util.Scanner;

public class Exp_026_example {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入一个整数：");
	long number = scan.nextLong();
	System.out.println("你输入的数字是："+number);
	System.out.println("乘以2之后为："+(number<<1));
	System.out.println("乘以4之后为："+(number<<2));
	System.out.println("除以2之后为："+(double)(number>>1));
	}
}
