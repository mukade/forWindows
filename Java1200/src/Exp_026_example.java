import java.util.Scanner;

public class Exp_026_example {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("������һ��������");
	long number = scan.nextLong();
	System.out.println("������������ǣ�"+number);
	System.out.println("����2֮��Ϊ��"+(number<<1));
	System.out.println("����4֮��Ϊ��"+(number<<2));
	System.out.println("����2֮��Ϊ��"+(double)(number>>1));
	}
}
