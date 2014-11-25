import java.io.*;
public class WordFrequenceStat {
	public static void main(String[] args) {
		String str = new String();
		try {
			System.out.println("请输入一个十六进制数并按回车结束：");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine().toUpperCase();
		} catch (IOException e) {
			System.err.println("输入有误");
		}
		char[] ch = str.toCharArray();
		
	}
}
