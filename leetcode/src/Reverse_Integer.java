import java.math.*;
import java.util.Scanner;
public class Reverse_Integer {
	public static int reverse(int x) {
		boolean positive = (x > 0)?true:false;
		int result = 0;
		x = Math.abs(x);
		while(x > 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		
		if(result < 0)
		{
			return -1;
		}
		if(!positive){
			result *= -1;
		}
		return result;
//		int num = Math.abs(x);
//		int gewei = num % 10;
//		int shiwei = (num / 10)%10;
//		int baiwei = num / 100;
//		int sum = gewei * 100 + shiwei*10 + baiwei;
//		if (x < 0)
//		{
//			return -sum;
//		}else {
//			return sum;
//		}		
	}
	
	public static void main(String args[])
	{
		System.out.println(Integer.MAX_VALUE);
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt())
		{
			int result = reverse(scanner.nextInt());
			System.out.println(result);
		}
	}
}
