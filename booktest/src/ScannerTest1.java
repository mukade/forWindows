import java.util.*;
public class ScannerTest1 {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while(reader.hasNextDouble()){
			double x = reader.nextDouble();
			m = m+1;
			sum = sum+x;
		}
		System.out.println(m);
		System.out.println(sum);
	}
}
