import java.io.*;
public class WordFrequenceStat {
	public static void main(String[] args) {
		String str = new String();
		try {
			System.out.println("������һ��ʮ�������������س�������");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine().toUpperCase();
		} catch (IOException e) {
			System.err.println("��������");
		}
		char[] ch = str.toCharArray();
		
	}
}
