import java.util.Scanner;

public class Exp_027_VariableExchange {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("����A��");
		long A = scan.nextLong();
		System.out.println("����B��");
		long B = scan.nextLong();
		A = A^B;
		B = B^A;
		A = A^B;//��,s
		System.out.println("������A="+A+" B="+B);
	}
}
