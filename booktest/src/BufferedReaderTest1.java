import java.io.*;

public class BufferedReaderTest1 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���룺");
		String str = br.readLine();
		System.out.println("�����룺");
		str = br.readLine();
		System.out.println("�ַ�Ϊ"+str);
	}
}
