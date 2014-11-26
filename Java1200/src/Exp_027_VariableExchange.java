import java.util.Scanner;

public class Exp_027_VariableExchange {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("输入A：");
		long A = scan.nextLong();
		System.out.println("输入B：");
		long B = scan.nextLong();
		A = A^B;
		B = B^A;
		A = A^B;//代,s
		System.out.println("代换后A="+A+" B="+B);
	}
}
