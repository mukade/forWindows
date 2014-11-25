import java.io.*;

public class BufferedReaderTest1 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入：");
		String str = br.readLine();
		System.out.println("再输入：");
		str = br.readLine();
		System.out.println("字符为"+str);
	}
}
