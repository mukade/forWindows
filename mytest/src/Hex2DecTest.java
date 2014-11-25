import java.io.*;
import java.lang.NumberFormatException;

public class Hex2DecTest {
	public static void main(String[] args) {
		String str = new String();
		int num;
		try {
			System.out.println("请输入一个十六进制数并按回车结束：");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine().toUpperCase();
		} catch (IOException e) {
			System.err.println("输入有误");
		}
		try {
			num = Integer.parseInt(str, 16);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.err.println("您的输入有误");
		}
	}

}
