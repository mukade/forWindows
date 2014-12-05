import java.util.Scanner;

public class exp_028_LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("please enter a year");
			long year = scan.nextLong();
			String str = new String();
			if(year%4==0&&year%100!=0&&year%400==0){
				System.out.println(year+"is leap year");
			}else{
				System.out.println(year+" is not leap year");
			}
			System.out.println("press any key to continue or press bye to quit");
			if (str == "bye")break;
		}
	}
}
