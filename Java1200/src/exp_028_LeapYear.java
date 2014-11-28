import java.awt.RenderingHints.Key;
import java.util.Scanner;

import org.omg.CORBA.Any;

public class exp_028_LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true){
			long year = scan.nextLong();
			String str = new String();
			System.out.println("please enter a year");
			if(year%4==0&&year%100!=0&&year%400==0){
				System.out.println(year+"is leap year");
			}else{
				System.out.println(year+"is not leap year");
			}
			System.out.println("press any key to continue or press bye to quit");
			str = scan.nextLine();
			if (str == "bye")break;
		}
	}
}
